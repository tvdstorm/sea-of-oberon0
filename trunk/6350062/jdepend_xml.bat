set JDEPEND_HOME=./metrics/jdepend-2.9.1
set CLASSPATH=%CLASSPARH%;%JDEPEND_HOME%\lib\jdepend-2.9.1.jar
java jdepend.xmlui.JDepend src/main/java/randy/ast src/main/java/randy/exception/ src/main/java/randy/interpreter src/main/java/randy/main src/main/java/randy/value
pause