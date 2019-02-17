@echo off

rem ------------------------------------------------------------------------
rem maven-compileを行うbat
rem ------------------------------------------------------------------------

cls

rem iniファイルを読み込む
call initialize.bat



rem commonをcompile
echo ------------------------------------------------------------------------
echo START common project compile
echo ------------------------------------------------------------------------
cd %baseDir%\ha-common
call mvn compile
echo ------------------------------------------------------------------------
echo END common project compile
echo ------------------------------------------------------------------------



rem dbをcompile
echo ------------------------------------------------------------------------
echo START db project compile
echo ------------------------------------------------------------------------
cd %baseDir%\ha-db
call mvn compile
echo ------------------------------------------------------------------------
echo END db project compile
echo ------------------------------------------------------------------------



rem businessをcompile
echo ------------------------------------------------------------------------
echo START business project compile
echo ------------------------------------------------------------------------
cd %baseDir%\ha-business
call mvn compile
echo ------------------------------------------------------------------------
echo END business project compile
echo ------------------------------------------------------------------------



cd %~dp0