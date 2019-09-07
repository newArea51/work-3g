package jp.co.ha.dashboard.validator;

import java.util.Date;

import org.springframework.validation.Errors;

import jp.co.ha.common.exception.ValidateErrorCode;
import jp.co.ha.common.type.CommonFlag;
import jp.co.ha.common.type.DateFormatType;
import jp.co.ha.common.util.DateUtil;
import jp.co.ha.common.util.StringUtil;
import jp.co.ha.dashboard.form.HealthInfoReferenceForm;
import jp.co.ha.web.validator.BaseWebValidator;

/**
 * 結果照会画面のValidator
 *
 */
public class HealthInfoReferenceValidator extends BaseWebValidator<HealthInfoReferenceForm> {

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void validate(HealthInfoReferenceForm form, Errors errors) {

		// 相関チェック
		correlationCheck(form, errors);

	}

	/**
	 * 相関チェックを行う
	 *
	 * @param form
	 *     結果検索フォーム
	 * @param errors
	 *     エラークラス
	 */
	private void correlationCheck(HealthInfoReferenceForm form, Errors errors) {

		if (StringUtil.isEmpty(form.getHealthInfoId())) {
			if (CommonFlag.TRUE.is(form.getHealthInfoRegDateSelectFlag())) {
				// 直接指定フラグが指定されてる場合
				super.rejectIfEmpty(errors, "fromHealthInfoRegDate", "健康情報作成日");

			} else {
				if (StringUtil.isEmpty(form.getFromHealthInfoRegDate())) {
					// 健康情報作成日(開始)が指定されてない場合
					super.rejectIfEmpty(errors, "fromHealthInfoRegDate", "健康情報作成日(開始)");

				} else if (StringUtil.isEmpty(form.getToHealthInfoRegDate())) {
					// 健康情報作成日(終了)が指定されてない場合
					super.rejectIfEmpty(errors, "toHealthInfoRegDate", "健康情報作成日(終了)");

				} else {

					Date fromDate = DateUtil.toDate(form.getFromHealthInfoRegDate(), DateFormatType.YYYYMMDD);
					Date toDate = DateUtil.toDate(form.getToHealthInfoRegDate(), DateFormatType.YYYYMMDD);
					if (DateUtil.isAfter(fromDate, toDate, false)) {
						// 健康情報作成日(終了) < 健康情報作成日(開始) となっている場合
						errors.rejectValue("toHealthInfoRegDate", ValidateErrorCode.DATE_OVER.getOuterErrorCode(),
								new String[] { "健康情報作成日(終了)" }, ValidateErrorCode.DATE_OVER.getOuterErrorCode());
					}

				}
			}
		}
	}

}
