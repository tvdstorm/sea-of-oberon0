set JDEPEND_HOME=./metrics/jdepend-2.9.1
set CLASSPATH=%CLASSPATH%;%JDEPEND_HOME%\lib\jdepend-2.9.1.jar
java jdepend.xmlui.JDepend -file jdepend.xml target/classes/randy/oberon0/ast target/classes/randy/oberon0/exception/ target/classes/randy/oberon0/interpreter target/classes/randy/oberon0/main target/classes/randy/oberon0/value
