package jp.co.ha.business.db.crud.delete.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jp.co.ha.business.db.crud.delete.HealthInfoDeleteService;
import jp.co.ha.common.db.annotation.Delete;
import jp.co.ha.db.entity.HealthInfoKey;
import jp.co.ha.db.mapper.HealthInfoMapper;

/**
 * 健康情報削除サービスインターフェース実装クラス
 *
 * @version 1.0.0
 */
@Service
public class HealthInfoDeleteServiceImpl implements HealthInfoDeleteService {

    /** HealthInfoMapper */
    @Autowired
    private HealthInfoMapper mapper;

    @Delete
    @Override
    @Transactional(rollbackFor = Exception.class)
    public void deleteById(Integer seqHealthInfoId) {
        HealthInfoKey key = new HealthInfoKey();
        key.setSeqHealthInfoId(seqHealthInfoId);
        mapper.deleteByPrimaryKey(key);
    }
}
