#!/bin/sh

########################################
# mvn flyway shell
########################################

# 基底ディレクトリ
BASE_DIR="/Applications/Eclipse_2019-03.app/Contents/work-3g"

# プロジェクトディレクトリ
DB_DIR=${BASE_DIR}"/ha-db"

echo "------------------------------------------------------------------------"
echo "START $0"
echo "------------------------------------------------------------------------"


echo "------------------------------------------------------------------------"
echo "START db project clean"
echo "------------------------------------------------------------------------"
cd ${DB_DIR}
mvn flyway:info
mvn flyway:migrate
echo "------------------------------------------------------------------------"
echo "END db project clean"
echo "------------------------------------------------------------------------"


# 元のshellのディレクトリに戻る
cd ${BASE_DIR}"/ha-build/shell"

echo "------------------------------------------------------------------------"
echo "END $0"
echo "------------------------------------------------------------------------"
