package jp.co.ha.common.http;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import jp.co.ha.common.exception.ApiException;
import jp.co.ha.common.exception.BaseException;
import jp.co.ha.common.log.Logger;
import jp.co.ha.common.log.LoggerFactory;
import jp.co.ha.common.type.Charset;
import jp.co.ha.common.util.BeanUtil;

/**
 * HTTPクライアント
 *
 * @since 1.0
 */
public class HttpClient {

	/** LOG */
	private static final Logger LOG = LoggerFactory.getLogger(HttpClient.class);

	/** HTTPクライアント 設定情報 */
	private HttpClientConfig conf;

	/** HTTPステータス */
	private HttpStatus httpStatus;
	/** レスポンス情報 */
	private String responseBody;

	/**
	 * コンストラクタ
	 *
	 * @param conf
	 *     HTTPクライアントの設定情報保持クラス
	 */
	public HttpClient(HttpClientConfig conf) {
		this.conf = conf;
	}

	/**
	 * Httpステータスを返す
	 *
	 * @return httpStatus
	 */
	public HttpStatus getHttpStatus() {
		return httpStatus;
	}

	/**
	 * responseBodyを返す
	 *
	 * @return responseBody
	 */
	public String getResponseBody() {
		return responseBody;
	}

	/**
	 * リクエスト情報を送信する
	 *
	 * @throws BaseException
	 *     HTTP送信に失敗した場合
	 */
	public void send() throws BaseException {

		HttpURLConnection connection = null;
		try {
			URL url = new URL(conf.getRequestUrl());
			connection = (HttpURLConnection) url.openConnection();
			connection.setConnectTimeout(conf.getTimeout());
			connection.setReadTimeout(conf.getTimeout());
			connection.setRequestMethod(conf.getHttpMethod().getValue());

			connection.connect();
			httpStatus = HttpStatus.of(String.valueOf(connection.getResponseCode()));
		} catch (IOException e) {
			throw new ApiException(e);
		}

		String encoding = getEncoding(connection.getContentEncoding());

		try (BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream(), encoding))) {
			if (HttpStatus.OK == httpStatus) {
				String line = null;
				StringBuilder sb = new StringBuilder();
				while (BeanUtil.notNull(line = br.readLine())) {
					sb.append(line);
				}
				this.responseBody = sb.toString();
			} else {
				LOG.warn("HTTP ステータス = " + httpStatus + "(" + httpStatus.getValue() + ")");
			}
		} catch (IOException e) {
			LOG.error("通信に失敗しました", e);
		} finally {
			if (BeanUtil.notNull(connection)) {
				connection.disconnect();
			}
		}
	}

	/**
	 * 文字Encodeを返す
	 *
	 * @param encoding
	 *     Encode
	 * @return エンコード文字列
	 */
	private String getEncoding(String encoding) {
		if (BeanUtil.isNull(encoding)) {
			encoding = Charset.UTF_8.getValue();
		}
		return encoding;
	}
}
