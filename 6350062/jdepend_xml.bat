set JDEPEND_HOME=./metrics/jdepend-2.9.1
set CLASSPATH=%CLASSPATH%;%JDEPEND_HOME%\lib\jdepend-2.9.1.jar
java jdepend.xmlui.JDepend -components randy.oberon0.ast,randy.oberon0.ast.datastructures,randy.oberon0.ast.enums,randy.oberon0.exception,randy.oberon0.interpreter.antlr,randy.oberon0.interpreter.buildinfunctions,randy.oberon0.interpreter.runtime,randy.oberon0.main,randy.oberon0.value src/main/java/randy/oberon0/ast src/main/java/randy/oberon0/exception/ src/main/java/randy/oberon0/interpreter src/main/java/randy/oberon0/main src/main/java/randy/oberon0/value
pause