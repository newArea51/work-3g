@echo off

rem ------------------------------------------------------------------------
rem
rem Nodeのモジュールの更新を行う
rem package.jsonのdependencies内のversionの最新化
rem
rem ------------------------------------------------------------------------

cls

echo start npm update
cd ../
npm update

