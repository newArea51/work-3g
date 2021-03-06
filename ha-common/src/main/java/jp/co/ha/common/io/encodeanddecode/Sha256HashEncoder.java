package jp.co.ha.common.io.encodeanddecode;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

import org.springframework.stereotype.Component;

import jp.co.ha.common.exception.BaseException;
import jp.co.ha.common.exception.CommonErrorCode;
import jp.co.ha.common.exception.SystemException;
import jp.co.ha.common.type.Algorithm;
import jp.co.ha.common.type.Charset;

/**
 * SHA-256ハッシュ値作成クラス
 *
 * @version 1.0.0
 */
@Component("sha256HashEncoder")
public class Sha256HashEncoder implements HashEncoder {

    /** HASH化アルゴリズム */
    private static final Algorithm HASH_ALGORITHM = Algorithm.SHA_256;

    @Override
    public String encode(String password, String salt) throws BaseException {

        try {
            return encodeDefault(password, salt, HASH_ALGORITHM);
        } catch (NoSuchAlgorithmException e) {
            throw new SystemException(CommonErrorCode.ALGORITH_ERROR,
                    HASH_ALGORITHM.getValue() + "でのハッシュ化に失敗しました", e);
        } catch (UnsupportedEncodingException e) {
            throw new SystemException(CommonErrorCode.ALGORITH_ERROR,
                    "指定した文字コードが不正です。文字コード：" + Charset.UTF_8.getValue(), e);
        }
    }
}
