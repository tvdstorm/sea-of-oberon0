package ar.oberon0.test;

import java.io.IOException;

import junit.framework.TestCase;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;

import ar.oberon0.ast.dataTypes.SimpleType;
import ar.oberon0.lists.ConstantList;
import ar.oberon0.lists.DataFieldList;
import ar.oberon0.parser.Oberon0Lexer;
import ar.oberon0.parser.Oberon0Parser;
import ar.oberon0.runtime.Context;
import ar.oberon0.runtime.DataField;
import ar.oberon0.shared.Interpretable;
import ar.oberon0.values.IntegerNode;

public class Tester extends TestCase {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		Tester tester = new Tester();
		tester.TestTypeIdentifier();
		tester.TestRecordType();
		tester.SmokeTest();

		tester.TestIntegerDivision();
		tester.TestProcedureWithParamters();
		tester.TestProcedureWithoutVars();
		tester.TestConstantImmutability();
		tester.TestArray();
		tester.TestConstants();
		tester.TestIf();
		tester.TestIfElse();
		tester.TestIfElseIf();
		tester.TestWhileLoop();
		tester.TestSimpleModule();
		tester.TestTerm();
		tester.TestFactorWithInteger();
		tester.TestFactorWithSelector();
		tester.TestSimpleExpressionWithNegation();
		tester.TestSimpleExpressionWithAdd();
		tester.TestSimpleExpressionWithMin();
		tester.TestExpressionWithEquals();
		tester.TestExpressionWithGreater();
		tester.TestSimpleExpressionBIG();
		tester.TestAssignmentNode();

		System.out.println("Finished");
	}

	private Oberon0Parser GetParser(String programText) {
		CharStream stream = new ANTLRStringStream(programText);
		Oberon0Lexer lexer = new Oberon0Lexer(stream);
		TokenStream tokenStream = new CommonTokenStream(lexer);
		Oberon0Parser parser = new Oberon0Parser(tokenStream);
		return parser;
	}

	private void SmokeTest() {
		try {
			CharStream stream = new ANTLRFileStream("ExtRef\\smoke.txt");
			Oberon0Lexer lexer = new Oberon0Lexer(stream);
			TokenStream tokenStream = new CommonTokenStream(lexer);
			Oberon0Parser parser = new Oberon0Parser(tokenStream);
			Interpretable interpreter = parser.module().module;
			interpreter.interpret(null);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RecognitionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private void TestTypeIdentifier() {
		Oberon0Parser parser = GetParser("MODULE module; TYPE record = RECORD leeftijd : INTEGER; END;  t = leeftijd; leeftijd = INTEGER; VAR a : t; b : record; BEGIN b.leeftijd := 23; Write(b.leeftijd); a := 4; Write(a) END module");
		Interpretable interpreter = null;
		try {
			interpreter = parser.module().module;
		} catch (RecognitionException e) {
			e.printStackTrace();
		}
		try {
			Integer result = (Integer) interpreter.interpret(null);
			System.out.println(getResultString("Type identifier", result.equals(0)));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private void TestRecordType() {
		Oberon0Parser parser = GetParser("MODULE module; VAR persoon : RECORD leeftijd : INTEGER; getallen : ARRAY 10 OF INTEGER; adres : RECORD straat : INTEGER END; END; BEGIN persoon.leeftijd := 23; Write( persoon.leeftijd ); persoon.adres.straat := 2; Write(persoon.adres.straat); persoon.getallen[1] := 3; Write(persoon.getallen[1]) END module");
		Interpretable interpreter = null;
		try {
			interpreter = parser.module().module;
		} catch (RecognitionException e) {
			e.printStackTrace();
		}
		try {
			Integer result = (Integer) interpreter.interpret(null);
			System.out.println(getResultString("Record Type", result.equals(0)));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private void TestIntegerDivision() {
		Oberon0Parser parser = GetParser("MODULE module; BEGIN Write( 7 DIV 2 ) END module");
		Interpretable interpreter = null;
		try {
			interpreter = parser.module().module;
		} catch (RecognitionException e) {
			e.printStackTrace();
		}
		try {
			Integer result = (Integer) interpreter.interpret(null);
			System.out.println(getResultString("Procedure with parameters", result.equals(0)));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void TestProcedureWithParamters() {
		Oberon0Parser parser = GetParser("MODULE module; VAR i: INTEGER; PROCEDURE PrintHallo(VAR message: INTEGER); BEGIN Write(\"hallo\"); Write(message); message := 3; Write(message) END PrintHallo; BEGIN i := 1; PrintHallo(i); Write(i) END module");
		Interpretable interpreter = null;
		try {
			interpreter = parser.module().module;
		} catch (RecognitionException e) {
			e.printStackTrace();
		}
		try {
			Integer result = (Integer) interpreter.interpret(null);
			System.out.println(getResultString("Procedure with parameters", result.equals(0)));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void TestProcedureWithoutVars() {
		Oberon0Parser parser = GetParser("MODULE module; PROCEDURE PrintHallo; BEGIN Write(\"hallo\") END PrintHallo; BEGIN PrintHallo END module");
		Interpretable interpreter = null;
		try {
			interpreter = parser.module().module;
		} catch (RecognitionException e) {
			e.printStackTrace();
		}
		try {
			Integer result = (Integer) interpreter.interpret(null);
			System.out.println(getResultString("Procedure without vars", result.equals(0)));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void TestArray() {
		Oberon0Parser parser = GetParser("MODULE module;CONST length = 5; VAR input: ARRAY length OF INTEGER; BEGIN input[2] := 5; Write(input[2]); input[2] := 9; Write(input[2]) END module");
		Interpretable interpreter = null;
		try {
			interpreter = parser.module().module;
		} catch (RecognitionException e) {
			e.printStackTrace();
		}
		try {
			Integer result = (Integer) interpreter.interpret(null);
			System.out.println(getResultString("constant", result.equals(0)));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void TestConstants() {
		Oberon0Parser parser = GetParser("MODULE module;CONST const = 9; BEGIN Write(const) END module");
		Interpretable interpreter = null;
		try {
			interpreter = parser.module().module;
		} catch (RecognitionException e) {
			e.printStackTrace();
		}
		try {
			Integer result = (Integer) interpreter.interpret(null);
			System.out.println(getResultString("constant", result.equals(0)));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void TestConstantImmutability() {
		Oberon0Parser parser = GetParser("MODULE module;CONST const = 9; BEGIN Write(const); const := 10; Write(const) END module");
		Interpretable interpreter = null;
		try {
			interpreter = parser.module().module;
		} catch (RecognitionException e) {
			e.printStackTrace();
		}
		try {
			Integer result = (Integer) interpreter.interpret(null);
			System.out.println(getResultString("constant", result.equals(0)));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void TestIf() {
		Oberon0Parser parser = GetParser("IF 2 = 2 THEN Write(\"in if\") ELSE Write(\"in else\") END");
		Interpretable interpreter = null;
		try {
			interpreter = parser.ifStatement().ifStatement;
		} catch (RecognitionException e) {
			e.printStackTrace();
		}
		try {
			Integer result = (Integer) interpreter.interpret(new Context());
			System.out.println(getResultString("if statement", result.equals(0)));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void TestIfElse() {
		Oberon0Parser parser = GetParser("IF 2 = 3 THEN Write(\"in if\") ELSE Write(\"in else\") END");
		Interpretable interpreter = null;
		try {
			interpreter = parser.ifStatement().ifStatement;
		} catch (RecognitionException e) {
			e.printStackTrace();
		}
		try {
			Integer result = (Integer) interpreter.interpret(new Context());
			System.out.println(getResultString("if else statement", result.equals(0)));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void TestIfElseIf() {
		Oberon0Parser parser = GetParser("IF 2 = 3 THEN Write(\"in if\") ELSIF 3 = 3 THEN Write(\"in else if\") ELSE Write(\"in else\") END");
		Interpretable interpreter = null;
		try {
			interpreter = parser.ifStatement().ifStatement;
		} catch (RecognitionException e) {
			e.printStackTrace();
		}
		try {
			Integer result = (Integer) interpreter.interpret(new Context());
			System.out.println(getResultString("if else if statement", result.equals(0)));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void TestSimpleModule() {
		Oberon0Parser parser = GetParser("MODULE module;CONST const1 = 9; TYPE type1 = INTEGER; VAR var1 : INTEGER; BEGIN var1 := 1+1; Write(\"testtt\") END module");
		Interpretable interpreter = null;
		try {
			interpreter = parser.module().module;
		} catch (RecognitionException e) {
			e.printStackTrace();
		}
		try {
			Integer result = (Integer) interpreter.interpret(new Context());
			System.out.println(getResultString("simple module", result.equals(0)));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void TestWhileLoop() {
		Oberon0Parser parser = GetParser("MODULE module;VAR iterations, i : INTEGER; BEGIN iterations := 5; i := 0; WHILE i < iterations DO Write(\"a\"); i := i + 1 END END module");
		Interpretable interpreter = null;
		try {
			interpreter = parser.module().module;
		} catch (RecognitionException e) {
			e.printStackTrace();
		}
		try {
			Integer result = (Integer) interpreter.interpret(new Context());
			System.out.println(getResultString("while loop", result.equals(0)));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void TestSimpleExpressionWithNegation() {
		Oberon0Parser parser = GetParser("-22");
		Interpretable interpreter = null;
		try {
			interpreter = parser.simpleExpression().simpleExpression;
		} catch (RecognitionException e) {
			e.printStackTrace();
		}
		try {
			IntegerNode result = (IntegerNode) interpreter.interpret(new Context());
			System.out.println(getResultString("simpleExpression with negation", result.equals(new IntegerNode(-22))));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void TestSimpleExpressionWithAdd() {
		Oberon0Parser parser = GetParser("22+2");
		Interpretable interpreter = null;
		try {
			interpreter = parser.simpleExpression().simpleExpression;
		} catch (RecognitionException e) {
			e.printStackTrace();
		}
		try {
			IntegerNode result = (IntegerNode) interpreter.interpret(new Context());
			System.out.println(getResultString("simpleExpression with add", result.equals(new IntegerNode(24))));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void TestSimpleExpressionWithMin() {
		Oberon0Parser parser = GetParser("22-2");
		Interpretable interpreter = null;
		try {
			interpreter = parser.simpleExpression().simpleExpression;
		} catch (RecognitionException e) {
			e.printStackTrace();
		}
		try {
			IntegerNode result = (IntegerNode) interpreter.interpret(new Context());
			System.out.println(getResultString("simpleExpression with min", result.equals(new IntegerNode(20))));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void TestTerm() {
		Oberon0Parser parser = GetParser("22*2");
		Interpretable interpreter = null;
		try {
			interpreter = parser.term().term;
		} catch (RecognitionException e) {
			e.printStackTrace();
		}
		try {
			IntegerNode result = (IntegerNode) interpreter.interpret(new Context());
			System.out.println(getResultString("term", result.equals(new IntegerNode(44))));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void TestFactorWithInteger() {
		Oberon0Parser parser = GetParser("22");
		Interpretable interpreter = null;
		try {
			interpreter = parser.factor().factor;
		} catch (RecognitionException e) {
			e.printStackTrace();
		}
		try {
			IntegerNode result = (IntegerNode) interpreter.interpret(new Context());
			System.out.println(getResultString("factor with integer", result.equals(new IntegerNode(22))));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void TestFactorWithSelector() {
		Oberon0Parser parser = GetParser("a");
		Interpretable interpreter = null;
		try {
			interpreter = parser.factor().factor;
		} catch (RecognitionException e) {
			e.printStackTrace();
		}
		try {
			Context context = new Context();
			ConstantList constants = new ConstantList();
			constants.addItem("a", new DataField(new SimpleType("INTEGER"), new IntegerNode(9)));
			context.addConstants(constants);
			Object result = interpreter.interpret(context);
			System.out.println(getResultString("factor with ident", ((DataField) result).getValue(context).toString().compareTo("9") == 0));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void TestAssignmentNode() {
		Oberon0Parser parser = GetParser("a := 3");
		Interpretable interpreter = null;
		try {
			interpreter = parser.assignment().assignment;
		} catch (RecognitionException e) {
			e.printStackTrace();
		}
		try {
			Context context = new Context();
			DataFieldList varList = new DataFieldList();
			DataField variable = new DataField(new SimpleType("INTEGER"));
			varList.addItem("a", variable);
			context.addVariables(varList);
			Object result = interpreter.interpret(context);
			System.out.println(getResultString("assignment", result.toString().compareTo("0") == 0));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void TestExpressionWithEquals() {
		Oberon0Parser parser = GetParser("2 = 2");
		Interpretable interpreter = null;
		try {
			interpreter = parser.expression().expression;
		} catch (RecognitionException e) {
			e.printStackTrace();
		}
		try {
			Object result = interpreter.interpret(new Context());
			System.out.println(getResultString("expression with Equals", (Boolean) result));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void TestExpressionWithGreater() {
		Oberon0Parser parser = GetParser("3 > 2");
		Interpretable interpreter = null;
		try {
			interpreter = parser.expression().expression;
		} catch (RecognitionException e) {
			e.printStackTrace();
		}
		try {
			Object result = interpreter.interpret(new Context());
			System.out.println(getResultString("expression with Equals", (Boolean) result));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void TestSimpleExpressionBIG() {
		Oberon0Parser parser = GetParser("2+4*5 DIV 2 MOD 5");
		Interpretable interpreter = null;
		try {
			interpreter = parser.simpleExpression().simpleExpression;
		} catch (RecognitionException e) {
			e.printStackTrace();
		}
		try {
			Object result = interpreter.interpret(new Context());
			System.out.println(getResultString("BIG TEST", ((IntegerNode) result).equals(new IntegerNode(2))));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private String getResultString(String rule, boolean passed) {
		if (passed)
			return "passed test for rule " + rule + ".";
		else
			return "Failed test for rule " + rule + ".";
	}
}
