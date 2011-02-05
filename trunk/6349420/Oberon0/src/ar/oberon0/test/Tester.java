package ar.oberon0.test;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import junit.framework.TestCase;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;

import ar.oberon0.ast.dataTypes.SimpleType;
import ar.oberon0.ast.statements.ReadNode;
import ar.oberon0.ast.statements.WriteNode;
import ar.oberon0.lists.ConstantList;
import ar.oberon0.lists.DataFieldList;
import ar.oberon0.parser.Oberon0Lexer;
import ar.oberon0.parser.Oberon0Parser;
import ar.oberon0.runtime.Context;
import ar.oberon0.runtime.DataField;
import ar.oberon0.shared.Interpretable;
import ar.oberon0.values.BooleanValue;
import ar.oberon0.values.IntegerValue;

public class Tester extends TestCase {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {

		Tester tester = new Tester();

		tester.SmokeTest();

		tester.TestTypeIdentifier();
		tester.TestRecordType();
		tester.TestIntegerDivision();
		tester.TestProcedureWithParamters();
		tester.TestProcedureWithoutParameters();
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
		ByteArrayOutputStream resultStream = new ByteArrayOutputStream();
		WriteNode.setStreamToWriteTo(new PrintStream(resultStream));

		ByteArrayOutputStream inputStream = new ByteArrayOutputStream();
		PrintStream ps = new PrintStream(inputStream);
		ps.println("1");
		ps.println("4");
		ps.println("3");
		ps.println("5");
		ps.println("2");

		InputStream input = new ByteArrayInputStream(inputStream.toByteArray());
		ReadNode.setStreamToReadFrom(input);

		ExpectedResult expectedResult = new ExpectedResult();
		expectedResult.addString("1");
		expectedResult.addString("2");
		expectedResult.addString("3");
		expectedResult.addString("4");
		expectedResult.addString("5");
		TestResultEvaluator evaluator = new TestResultEvaluator(expectedResult);
		ExecuteModule("ExtRef\\smoke.txt");

		boolean passed = evaluator.evaluate(resultStream);
		System.out.println(getResultString("Smoke test", passed));
	}

	private void TestTypeIdentifier() {
		ByteArrayOutputStream resultStream = new ByteArrayOutputStream();
		WriteNode.setStreamToWriteTo(new PrintStream(resultStream));

		ExpectedResult expectedResult = new ExpectedResult();
		expectedResult.addString("23");
		expectedResult.addString("4");
		TestResultEvaluator evaluator = new TestResultEvaluator(expectedResult);
		ExecuteModule("ExtRef\\TypeIdentifierTest");

		boolean passed = evaluator.evaluate(resultStream);
		System.out.println(getResultString("Type identifier", passed));
	}

	private void TestRecordType() {
		ByteArrayOutputStream resultStream = new ByteArrayOutputStream();
		WriteNode.setStreamToWriteTo(new PrintStream(resultStream));

		ExpectedResult expectedResult = new ExpectedResult();
		expectedResult.addString("23");
		expectedResult.addString("2");
		expectedResult.addString("3");
		TestResultEvaluator evaluator = new TestResultEvaluator(expectedResult);
		ExecuteModule("ExtRef\\RecordTypeTest");

		boolean passed = evaluator.evaluate(resultStream);
		System.out.println(getResultString("Record Type", passed));
	}

	private void TestIntegerDivision() {
		ByteArrayOutputStream resultStream = new ByteArrayOutputStream();
		WriteNode.setStreamToWriteTo(new PrintStream(resultStream));

		ExpectedResult expectedResult = new ExpectedResult();
		expectedResult.addString("3");
		TestResultEvaluator evaluator = new TestResultEvaluator(expectedResult);
		ExecuteModule("ExtRef\\DivisionTest");

		boolean passed = evaluator.evaluate(resultStream);
		System.out.println(getResultString("Division", passed));
	}

	private void TestProcedureWithParamters() {
		ByteArrayOutputStream resultStream = new ByteArrayOutputStream();
		WriteNode.setStreamToWriteTo(new PrintStream(resultStream));

		ExpectedResult expectedResult = new ExpectedResult();
		expectedResult.addString("hallo ");
		expectedResult.addString("1");
		expectedResult.addString("3");
		expectedResult.addString("3");
		TestResultEvaluator evaluator = new TestResultEvaluator(expectedResult);
		ExecuteModule("ExtRef\\ProcedureWithParametersTest");

		boolean passed = evaluator.evaluate(resultStream);
		System.out.println(getResultString("Procedure with parameters", passed));
	}

	private void TestProcedureWithoutParameters() {
		ByteArrayOutputStream resultStream = new ByteArrayOutputStream();
		WriteNode.setStreamToWriteTo(new PrintStream(resultStream));

		ExpectedResult expectedResult = new ExpectedResult();
		expectedResult.addString("hallo ");

		TestResultEvaluator evaluator = new TestResultEvaluator(expectedResult);
		ExecuteModule("ExtRef\\ProcedureWithoutParametersTest");

		boolean passed = evaluator.evaluate(resultStream);
		System.out.println(getResultString("Procedure without parameters", passed));
	}

	private void TestConstantImmutability() {
		ByteArrayOutputStream resultStream = new ByteArrayOutputStream();
		WriteNode.setStreamToWriteTo(new PrintStream(resultStream));

		ExpectedResult expectedResult = new ExpectedResult();
		expectedResult.addString("9");
		expectedResult.addString("9");
		TestResultEvaluator evaluator = new TestResultEvaluator(expectedResult);
		ExecuteModule("ExtRef\\ConstantImmutabilityTest");

		boolean passed = evaluator.evaluate(resultStream);
		System.out.println(getResultString("Constant immutability", passed));
	}

	private void TestArray() {
		ByteArrayOutputStream resultStream = new ByteArrayOutputStream();
		WriteNode.setStreamToWriteTo(new PrintStream(resultStream));

		ExpectedResult expectedResult = new ExpectedResult();
		expectedResult.addString("5");
		expectedResult.addString("9");
		TestResultEvaluator evaluator = new TestResultEvaluator(expectedResult);
		ExecuteModule("ExtRef\\ArrayTest");

		boolean passed = evaluator.evaluate(resultStream);
		System.out.println(getResultString("Array", passed));
	}

	private void TestConstants() {
		ByteArrayOutputStream resultStream = new ByteArrayOutputStream();
		WriteNode.setStreamToWriteTo(new PrintStream(resultStream));

		ExpectedResult expectedResult = new ExpectedResult();
		expectedResult.addString("9");
		TestResultEvaluator evaluator = new TestResultEvaluator(expectedResult);
		ExecuteModule("ExtRef\\ConstantTest");

		boolean passed = evaluator.evaluate(resultStream);
		System.out.println(getResultString("Constant", passed));
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
			IntegerValue result = (IntegerValue) interpreter.interpret(new Context());
			System.out.println(getResultString("simpleExpression with negation", result.equals(new IntegerValue(-22))));
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
			IntegerValue result = (IntegerValue) interpreter.interpret(new Context());
			System.out.println(getResultString("simpleExpression with add", result.equals(new IntegerValue(24))));
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
			IntegerValue result = (IntegerValue) interpreter.interpret(new Context());
			System.out.println(getResultString("simpleExpression with min", result.equals(new IntegerValue(20))));
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
			IntegerValue result = (IntegerValue) interpreter.interpret(new Context());
			System.out.println(getResultString("term", result.equals(new IntegerValue(44))));
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
			IntegerValue result = (IntegerValue) interpreter.interpret(new Context());
			System.out.println(getResultString("factor with integer", result.equals(new IntegerValue(22))));
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
			constants.addItem("a", new DataField(new SimpleType("INTEGER"), new IntegerValue(9)));
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
			System.out.println(getResultString("expression with Equals", ((BooleanValue) result).getValueAsBoolean()));
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
			System.out.println(getResultString("expression with Equals", ((BooleanValue) result).getValueAsBoolean()));
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
			System.out.println(getResultString("BIG TEST", ((IntegerValue) result).equals(new IntegerValue(2))));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void ExecuteModule(String pathOfSource) {
		try {
			CharStream stream = new ANTLRFileStream(pathOfSource);
			Oberon0Lexer lexer = new Oberon0Lexer(stream);
			TokenStream tokenStream = new CommonTokenStream(lexer);
			Oberon0Parser parser = new Oberon0Parser(tokenStream);
			Interpretable interpreter = parser.module().module;
			interpreter.interpret(null);

		} catch (IOException e) {
			e.printStackTrace();
		} catch (RecognitionException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private String getResultString(String rule, boolean passed) {
		if (passed)
			return "passed test for " + rule + ".";
		else
			return "Failed test for " + rule + ".";
	}

	private class TestResultEvaluator {
		private ExpectedResult expectedResult;

		protected TestResultEvaluator(ExpectedResult expectedResult) {
			this.expectedResult = expectedResult;
		}

		protected boolean evaluate(ByteArrayOutputStream outputStream) {
			BufferedReader actualResultReader = getReaderForOutputStream(outputStream);
			for (String expectedString : expectedResult) {
				String actualString;
				try {
					actualString = actualResultReader.readLine();
				} catch (Exception e) {
					return false;
				}
				if (actualString == null) {
					return false;
				}
				if (!actualString.equals(expectedString)) {
					return false;
				}
			}

			try {
				if (actualResultReader.readLine() != null) {
					return false;
				}
			} catch (Exception e) {
				return false;
			}
			return true;
		}

		private BufferedReader getReaderForOutputStream(ByteArrayOutputStream outputStream) {
			InputStream input = new ByteArrayInputStream(outputStream.toByteArray());
			return new BufferedReader(new InputStreamReader(input));
		}
	}

	private class ExpectedResult implements Iterable<String> {
		List<String> expectedStrings;

		private ExpectedResult() {
			this.expectedStrings = new ArrayList<String>();
		}

		protected void addString(String expectedString) {
			this.expectedStrings.add(expectedString);
		}

		public Iterator<String> iterator() {
			return this.expectedStrings.iterator();
		}
	}
}
