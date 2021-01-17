-- 管理者サイト権限マスタ
CREATE TABLE IF NOT EXISTS ROOT_ROLE_MT (
  -- 管理者サイト権限マスタID
  SEQ_ROOT_ROLE_MT_ID INT AUTO_INCREMENT NOT NULL PRIMARY KEY COMMENT '管理者サイト権限マスタID',
  -- ユーザ権限
  ROLE VARCHAR(2) NOT NULL COMMENT 'ユーザ権限',
  -- ユーザ権限名
  ROLE_NAME VARCHAR(64) NOT NULL COMMENT 'ユーザ権限名',
  -- 更新日時
  UPDATE_DATE DATETIME NOT NULL COMMENT '更新日時',
  -- 登録日時
  REG_DATE DATETIME NOT NULL COMMENT '登録日時'
);