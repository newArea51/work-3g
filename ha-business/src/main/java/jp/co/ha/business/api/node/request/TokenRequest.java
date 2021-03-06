package jp.co.ha.business.api.node.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import jp.co.ha.web.form.BaseApiRequest;

/**
 * Token発行APIのリクエストクラス
 *
 * @version 1.0.0
 */
public class TokenRequest extends BaseNodeRequest implements BaseApiRequest {

    /** ユーザID */
    @JsonProperty("seq_user_id")
    private Integer seqUserId;

    /**
     * seqUserIdを返す
     *
     * @return seqUserId
     */
    public Integer getSeqUserId() {
        return seqUserId;
    }

    /**
     * seqUserIdを設定する
     *
     * @param seqUserId
     */
    public void setSeqUserId(Integer seqUserId) {
        this.seqUserId = seqUserId;
    }

}
