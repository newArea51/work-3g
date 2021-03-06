package jp.co.ha.common.io.encodeanddecode;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

import org.springframework.stereotype.Component;

import jp.co.ha.common.type.Charset;

/**
 * Base64エンコード/デコードクラス
 *
 * @version 1.0.0
 */
@Component("base64EncodeAndDecoder")
public class Base64EncodeAndDecoder implements BaseEncodeAndDecoder {

    @Override
    public String encode(String src, Charset charset)
            throws UnsupportedEncodingException {
        return Base64.getEncoder().encodeToString(src.getBytes(charset.getValue()));
    }

    @Override
    public String decode(String src, Charset charset)
            throws UnsupportedEncodingException {
        return new String(Base64.getDecoder().decode(src.getBytes(charset.getValue())),
                charset.getValue());
    }

}
