package jp.co.ha.batch.invoke;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Options;
import org.springframework.context.MessageSource;

import jp.co.ha.batch.exception.BatchExceptionHandler;
import jp.co.ha.batch.execute.BaseBatch;
import jp.co.ha.batch.type.BatchResult;
import jp.co.ha.common.io.encodeanddecode.HashEncoder;
import jp.co.ha.common.io.encodeanddecode.Sha256HashEncoder;
import jp.co.ha.common.log.Logger;
import jp.co.ha.common.log.LoggerFactory;
import jp.co.ha.common.log.MDC;
import jp.co.ha.common.system.BatchBeanLoader;
import jp.co.ha.common.system.SystemMemory;
import jp.co.ha.common.util.DateTimeUtil;

/**
 * Batchの呼び出しクラス
 *
 * @version 1.0.0
 */
public class BatchInvoker {

    /** {@linkplain Logger} */
    private static final Logger LOG = LoggerFactory.getLogger(BatchInvoker.class);
    /** {@linkplain MessageSource} */
    private static final MessageSource MESSAGE_SOURCE = BatchBeanLoader
            .getBean(MessageSource.class);
    /** {@linkplain HashEncoder} */
    private static final HashEncoder HASH_ENCODER = BatchBeanLoader
            .getBean(Sha256HashEncoder.class);
    /** パッケージ名の接頭語 */
    private static final String PACKAGE_PREFIX = "jp.co.ha.batch.execute.";
    /** {@linkplain HelpFormatter} */
    private static final HelpFormatter HELP_FORMATTER = new HelpFormatter();
    /** 例外処理クラス */
    private static final BatchExceptionHandler EXCEPTION_HANDLER = BatchBeanLoader
            .getBean(BatchExceptionHandler.class);

    /**
     * invoke処理
     *
     * @param args
     *     バッチ引数(第一引数：Batch名、第二引数以降：オプション引数)
     */
    @SuppressWarnings("unchecked")
    public static void invoke(String[] args) {

        LOG.debug("■■■■■ Batch処理開始 ■■■■■");

        // Beanの初期化を行う
        BatchBeanLoader.initializeBean();

        String batchName = PACKAGE_PREFIX + args[0];
        LOG.info(batchName + " START memory use "
                + SystemMemory.getInstance().getMemoryUsage());

        BatchResult batchResult = BatchResult.FAILURE;

        try {

            // MDCを設定する
            MDC.put("id",
                    HASH_ENCODER.encode(DateTimeUtil.getSysDate().toString(), "dummy"));

            // batch名からインスタンスを取得
            Class<? extends BaseBatch> batch = (Class<? extends BaseBatch>) Class
                    .forName(batchName);
            BaseBatch batchInstance = BatchBeanLoader.getBean(batch);

            List<String> optionList = new ArrayList<>();
            for (int i = 0; i < args.length; i++) {
                if (i == 0) {
                    continue;
                } else {
                    optionList.add(args[i]);
                }
            }

            // getOptions 実行
            Options options = batchInstance.getOptions();

            // オプションのヘルプ情報を表示する。
            HELP_FORMATTER.printHelp("[opts]", options);

            // コマンドライン解析
            CommandLine cmd = new DefaultParser().parse(options,
                    optionList.toArray(new String[0]));

            // execute 実行
            batchResult = batchInstance.execute(cmd);

        } catch (Exception e) {
            // ログを出力する
            EXCEPTION_HANDLER.handleException(e);
            batchResult = BatchResult.FAILURE;
        } finally {
            LOG.info(MESSAGE_SOURCE.getMessage(batchResult.getComment(), null,
                    Locale.getDefault()));
        }

        LOG.info(batchName + " END memory use "
                + SystemMemory.getInstance().getMemoryUsage());

        LOG.debug("■■■■■ Batch処理終了 ■■■■■");
    }

}
