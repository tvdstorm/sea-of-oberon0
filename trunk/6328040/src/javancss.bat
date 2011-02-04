@echo off
REM Please adapt this script to your environment.

@REM Set JAVANCSS_HOME to the directory this batch file is in.
set me=%0
for %%i in (%me%) do set JAVANCSS_HOME=%%~dpi
set JAVANCSS_HOME=%JAVANCSS_HOME%\..

set _JAVA_HOME_ORIG=%JAVA_HOME%
set _CLASSPATH_ORIG=%CLASSPATH%

if NOT "%JAVA_HOME%"=="" goto endif1
	REM #################### EDIT THIS ENVIRONMENT VARIABLE IF NOT ALREADY SET #################
	set JAVA_HOME="C:\Program Files\Java\jdk1.6.0_23"
:endif1

REM #################### EDIT THIS ENVIRONMENT VARIABLE IF NOT ALREADY SET #################
set CLASSPATH=".;C:\Program Files (x86)\Java\jre6\lib\ext\QTJava.zip;C:\javancss-32.53\lib\javancss.jar;C:\javancss-32.53\lib\ccl.jar;C:\javancss-32.53\lib\jhbasic.jar"

%JAVA_HOME%\bin\java -classpath %CLASSPATH% javancss.Main %1 %2 %3 %4 %5 %6 %7 %8 %9

set JAVA_HOME=%_JAVA_HOME_ORIG%
set CLASSPATH=%_CLASSPATH_ORIG%
set _JAVA_HOME_ORIG=
set _CLASSPATH_ORIG=
