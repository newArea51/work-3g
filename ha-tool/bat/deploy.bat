@echo off

rem iniファイルを読み込む
echo start initialize
call initialize.bat
echo end initialize

rem jarが置かれてるフォルダ
set commonTargetDir=%baseDir%\ha-common\target
set businessTargetDir=%baseDir%\ha-business\target

rem jarを配置したいフォルダ
set businessLibDir=%baseDir%\ha-business\src\main\webapp\WEB-INF\lib
set apiLibDir=%baseDir%\ha-api\src\main\webapp\WEB-INF\lib
set webLibDir=%baseDir%\ha-web\src\main\webapp\WEB-INF\lib

rem ディレクトリ存在確認用変数
set befBusinessDir=%baseDir%\ha-business\src\main\webapp\WEB-INF
set befApiDir=%baseDir%\ha-api\src\main\webapp\WEB-INF
set befWebDir=%baseDir%\ha-web\src\main\webapp\WEB-INF

echo start echck lib dir
rem libディレクトリ 存在確認
cd %befBusinessDir%
echo %businessLibDir% check
if not exist "lib\" (
	mkdir lib
	echo mkdir %businessLibDir%
)

cd %befApiDir%
echo %apiLibDir% check
if not exist "lib\" (
	mkdir lib
	echo mkdir %apiLibDir%
)

cd %befWebDir%
echo %webLibDir% check
if not exist "lib\" (
	mkdir lib
	echo mkdir %webLibDir%
)
echo end echck lib dir


echo start deploy
rem common.jarを配置
cd %commonTargetDir%
copy *.jar %businessLibDir%
copy *.jar %apiLibDir%
copy *.jar %webLibDir%

rem business.jarを配置
cd %businessTargetDir%
copy *.jar %apiLibDir%
copy *.jar %webLibDir%

echo end deploy

cd %~dp0