set JDEPEND_HOME=./metrics/jdepend-2.9.1
set CLASSPATH=%CLASSPATH%;%JDEPEND_HOME%\lib\jdepend-2.9.1.jar
java jdepend.xmlui.JDepend src/main/java/randy/oberon0/ast src/main/java/randy/oberon0/exception/ src/main/java/randy/oberon0/interpreter src/main/java/randy/oberon0/main src/main/java/randy/oberon0/value
pause