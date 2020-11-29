package jp.co.ha.db.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import jp.co.ha.db.entity.Account;
import jp.co.ha.db.entity.AccountExample;
import jp.co.ha.db.entity.AccountKey;

/**
 * アカウント情報Mapper
 *
 * @version 1.0.0
 */
public interface AccountMapper {

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table account
     *
     * @mbg.generated Sun Nov 29 14:01:10 GMT+09:00 2020
     */
    long countByExample(AccountExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table account
     *
     * @mbg.generated Sun Nov 29 14:01:10 GMT+09:00 2020
     */
    int deleteByExample(AccountExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table account
     *
     * @mbg.generated Sun Nov 29 14:01:10 GMT+09:00 2020
     */
    int deleteByPrimaryKey(AccountKey key);

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table account
     *
     * @mbg.generated Sun Nov 29 14:01:10 GMT+09:00 2020
     */
    int insert(Account record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table account
     *
     * @mbg.generated Sun Nov 29 14:01:10 GMT+09:00 2020
     */
    int insertSelective(Account record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table account
     *
     * @mbg.generated Sun Nov 29 14:01:10 GMT+09:00 2020
     */
    List<Account> selectByExampleWithRowbounds(AccountExample example,
            RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table account
     *
     * @mbg.generated Sun Nov 29 14:01:10 GMT+09:00 2020
     */
    List<Account> selectByExample(AccountExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table account
     *
     * @mbg.generated Sun Nov 29 14:01:10 GMT+09:00 2020
     */
    Account selectByPrimaryKey(AccountKey key);

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table account
     *
     * @mbg.generated Sun Nov 29 14:01:10 GMT+09:00 2020
     */
    int updateByExampleSelective(@Param("record") Account record,
            @Param("example") AccountExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table account
     *
     * @mbg.generated Sun Nov 29 14:01:10 GMT+09:00 2020
     */
    int updateByExample(@Param("record") Account record,
            @Param("example") AccountExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table account
     *
     * @mbg.generated Sun Nov 29 14:01:10 GMT+09:00 2020
     */
    int updateByPrimaryKeySelective(Account record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table account
     *
     * @mbg.generated Sun Nov 29 14:01:10 GMT+09:00 2020
     */
    int updateByPrimaryKey(Account record);
}