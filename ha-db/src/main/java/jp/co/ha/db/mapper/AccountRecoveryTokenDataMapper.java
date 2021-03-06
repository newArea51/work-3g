package jp.co.ha.db.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import jp.co.ha.db.entity.AccountRecoveryTokenData;
import jp.co.ha.db.entity.AccountRecoveryTokenDataExample;
import jp.co.ha.db.entity.AccountRecoveryTokenDataKey;

/**
 * アカウント回復トークン情報Mapper
 *
 * @version 1.0.0
 */
public interface AccountRecoveryTokenDataMapper {
    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table account_recovery_token_data
     *
     * @mbg.generated Sun Nov 29 14:26:32 GMT+09:00 2020
     */
    long countByExample(AccountRecoveryTokenDataExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table account_recovery_token_data
     *
     * @mbg.generated Sun Nov 29 14:26:32 GMT+09:00 2020
     */
    int deleteByExample(AccountRecoveryTokenDataExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table account_recovery_token_data
     *
     * @mbg.generated Sun Nov 29 14:26:32 GMT+09:00 2020
     */
    int deleteByPrimaryKey(AccountRecoveryTokenDataKey key);

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table account_recovery_token_data
     *
     * @mbg.generated Sun Nov 29 14:26:32 GMT+09:00 2020
     */
    int insert(AccountRecoveryTokenData record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table account_recovery_token_data
     *
     * @mbg.generated Sun Nov 29 14:26:32 GMT+09:00 2020
     */
    int insertSelective(AccountRecoveryTokenData record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table account_recovery_token_data
     *
     * @mbg.generated Sun Nov 29 14:26:32 GMT+09:00 2020
     */
    List<AccountRecoveryTokenData> selectByExampleWithRowbounds(
            AccountRecoveryTokenDataExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table account_recovery_token_data
     *
     * @mbg.generated Sun Nov 29 14:26:32 GMT+09:00 2020
     */
    List<AccountRecoveryTokenData> selectByExample(
            AccountRecoveryTokenDataExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table account_recovery_token_data
     *
     * @mbg.generated Sun Nov 29 14:26:32 GMT+09:00 2020
     */
    AccountRecoveryTokenData selectByPrimaryKey(AccountRecoveryTokenDataKey key);

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table account_recovery_token_data
     *
     * @mbg.generated Sun Nov 29 14:26:32 GMT+09:00 2020
     */
    int updateByExampleSelective(@Param("record") AccountRecoveryTokenData record,
            @Param("example") AccountRecoveryTokenDataExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table account_recovery_token_data
     *
     * @mbg.generated Sun Nov 29 14:26:32 GMT+09:00 2020
     */
    int updateByExample(@Param("record") AccountRecoveryTokenData record,
            @Param("example") AccountRecoveryTokenDataExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table account_recovery_token_data
     *
     * @mbg.generated Sun Nov 29 14:26:32 GMT+09:00 2020
     */
    int updateByPrimaryKeySelective(AccountRecoveryTokenData record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table account_recovery_token_data
     *
     * @mbg.generated Sun Nov 29 14:26:32 GMT+09:00 2020
     */
    int updateByPrimaryKey(AccountRecoveryTokenData record);
}