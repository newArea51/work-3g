package jp.co.ha.common.db;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import jp.co.ha.common.BaseCommonTest;

/**
 * {@linkplain JdbcConfig} のjUnit
 *
 * @version 1.0.0
 */
public class JdbcConfigTest extends BaseCommonTest {

    /** JdbcConfig */
    @Autowired
    private JdbcConfig conf;

    /**
     * JdbcConfigのテスト
     */
    @Test
    public void test() {
        assertEquals("com.mysql.cj.jdbc.Driver", conf.getDriverClassName());
        assertEquals("jdbc:mysql://localhost:3306/work3g?serverTimezone=JST",
                conf.getUrl());
        assertEquals("root", conf.getUsername());
        assertEquals("admin", conf.getPassword());
    }

}
