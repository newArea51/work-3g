package jp.co.ha.business.db.crud.update.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jp.co.ha.business.db.crud.update.MailInfoUpdateService;
import jp.co.ha.common.db.annotation.Update;
import jp.co.ha.db.entity.MailInfo;
import jp.co.ha.db.mapper.MailInfoMapper;

/**
 * メール情報更新サービス実装クラス
 *
 * @version 1.0.0
 */
@Service
public class MailInfoUpdateServiceImpl implements MailInfoUpdateService {

    /** MailInfoMapper */
    @Autowired
    private MailInfoMapper mapper;

    /**
     * {@inheritDoc}
     */
    @Update
    @Override
    @Transactional(rollbackFor = Exception.class)
    public void update(MailInfo entity) {
        mapper.updateByPrimaryKey(entity);
    }

}
