package jp.co.ha.business.db.crud.delete.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jp.co.ha.business.db.crud.delete.AccountDeleteService;
import jp.co.ha.common.db.annotation.Delete;
import jp.co.ha.db.entity.AccountKey;
import jp.co.ha.db.mapper.AccountMapper;

/**
 * アカウント情報削除サービスインターフェース実装クラス
 *
 * @version 1.0.0
 */
@Service
public class AccountDeleteServiceImpl implements AccountDeleteService {

    /** AccountMapper */
    @Autowired
    private AccountMapper mapper;

    /**
     * {@inheritDoc}
     */
    @Delete
    @Override
    @Transactional(rollbackFor = Exception.class)
    public void deleteById(String userId) {
        AccountKey key = new AccountKey();
        key.setUserId(userId);
        mapper.deleteByPrimaryKey(key);
    }
}
