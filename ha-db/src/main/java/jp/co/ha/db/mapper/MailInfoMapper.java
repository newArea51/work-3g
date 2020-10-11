package jp.co.ha.db.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import jp.co.ha.db.entity.MailInfo;
import jp.co.ha.db.entity.MailInfoExample;
import jp.co.ha.db.entity.MailInfoKey;

/**
 * メール情報Mapper
 *
 * @version 1.0.0
 */
public interface MailInfoMapper {

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table mail_info
     *
     * @mbg.generated Sat Sep 19 23:01:13 GMT+09:00 2020
     */
    long countByExample(MailInfoExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table mail_info
     *
     * @mbg.generated Sat Sep 19 23:01:13 GMT+09:00 2020
     */
    int deleteByExample(MailInfoExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table mail_info
     *
     * @mbg.generated Sat Sep 19 23:01:13 GMT+09:00 2020
     */
    int deleteByPrimaryKey(MailInfoKey key);

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table mail_info
     *
     * @mbg.generated Sat Sep 19 23:01:13 GMT+09:00 2020
     */
    int insert(MailInfo record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table mail_info
     *
     * @mbg.generated Sat Sep 19 23:01:13 GMT+09:00 2020
     */
    int insertSelective(MailInfo record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table mail_info
     *
     * @mbg.generated Sat Sep 19 23:01:13 GMT+09:00 2020
     */
    List<MailInfo> selectByExample(MailInfoExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table mail_info
     *
     * @mbg.generated Sat Sep 19 23:01:13 GMT+09:00 2020
     */
    MailInfo selectByPrimaryKey(MailInfoKey key);

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table mail_info
     *
     * @mbg.generated Sat Sep 19 23:01:13 GMT+09:00 2020
     */
    int updateByExampleSelective(@Param("record") MailInfo record,
            @Param("example") MailInfoExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table mail_info
     *
     * @mbg.generated Sat Sep 19 23:01:13 GMT+09:00 2020
     */
    int updateByExample(@Param("record") MailInfo record,
            @Param("example") MailInfoExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table mail_info
     *
     * @mbg.generated Sat Sep 19 23:01:13 GMT+09:00 2020
     */
    int updateByPrimaryKeySelective(MailInfo record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table mail_info
     *
     * @mbg.generated Sat Sep 19 23:01:13 GMT+09:00 2020
     */
    int updateByPrimaryKey(MailInfo record);
}