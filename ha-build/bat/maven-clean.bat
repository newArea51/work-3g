@echo off

rem ------------------------------------------------------------------------
rem maven-clean行うbat
rem ------------------------------------------------------------------------

cls

rem iniファイルを読み込む
call initialize.bat



rem common/targetディレクトリをクリーン
echo ------------------------------------------------------------------------
echo START common project clean
echo ------------------------------------------------------------------------
cd %baseDir%\ha-common
call mvn clean
echo ------------------------------------------------------------------------
echo END common project clean
echo ------------------------------------------------------------------------



rem business/targetディレクトリをクリーン
echo ------------------------------------------------------------------------
echo START business project clean
echo ------------------------------------------------------------------------
cd %baseDir%\ha-business
call mvn clean
echo ------------------------------------------------------------------------
echo END business project clean
echo ------------------------------------------------------------------------



rem db/targetディレクトリをクリーン
echo ------------------------------------------------------------------------
echo START db project clean
echo ------------------------------------------------------------------------
cd %baseDir%\ha-db
call mvn clean
echo ------------------------------------------------------------------------
echo END db project clean
echo ------------------------------------------------------------------------



cd %~dp0
