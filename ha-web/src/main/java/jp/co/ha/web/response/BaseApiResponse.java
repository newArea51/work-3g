package jp.co.ha.web.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import jp.co.ha.web.form.BaseForm;
import jp.co.ha.web.response.serialize.ResultTypeSerializer;
import jp.co.ha.web.type.ResultType;

/**
 * API共通レスポンス
 *
 */
public abstract class BaseApiResponse implements BaseForm {

	/** API結果コード */
	@JsonSerialize(using = ResultTypeSerializer.class)
	@JsonProperty(value = "result")
	private ResultType resultType;

	/**
	 * resultTypeを返す
	 *
	 * @return resultType
	 */
	public ResultType getResultType() {
		return resultType;
	}

	/**
	 * resultTypeを設定する
	 *
	 * @param resultType
	 *     API結果コード
	 */
	public void setResultType(ResultType resultType) {
		this.resultType = resultType;
	}

}
