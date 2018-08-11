CREATE TABLE ACCOUNT (
-- ユーザID
USER_ID VARCHAR(16) NOT NULL PRIMARY KEY,
-- パスワード
PASSWORD VARCHAR(16),
-- 削除フラグ
DELETE_FLAG VARCHAR(1),
-- パスワード有効期限
PASSWORD_EXPIRE DATE,
-- 備考
REMARKS VARCHAR(256),
-- APIキー
API_KEY VARCHAR(64),
-- 更新日時
UPDATE_DATE TIMESTAMP,
-- 登録日時
REG_DATE TIMESTAMP
);
