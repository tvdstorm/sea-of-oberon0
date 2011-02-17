set JDEPEND_HOME=./metrics/jdepend-2.9.1
set CLASSPATH=%CLASSPATH%;%JDEPEND_HOME%\lib\jdepend-2.9.1.jar
java jdepend.xmlui.JDepend -file jdepend.xml -components randy.oberon0.ast,randy.oberon0.ast.datastructures,randy.oberon0.exception,randy.oberon0.interpreter,randy.oberon0.interpreter.antlr,randy.oberon0.interpreter.buildinfunctions,randy.oberon0.interpreter.runtime,randy.oberon0.main,randy.oberon0.value,randy.library target/classes/randy/oberon0/ast target/classes/randy/oberon0/exception/ target/classes/randy/oberon0/interpreter target/classes/randy/oberon0/main target/classes/randy/oberon0/value target/classes/randy/library