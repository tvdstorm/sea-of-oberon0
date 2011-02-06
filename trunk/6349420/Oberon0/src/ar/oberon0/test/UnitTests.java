package ar.oberon0.test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

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

public class UnitTests extends TestCase {

	private PrintStream inputForProgram = null;
	private ByteArrayOutputStream resultStream = null;
	private ByteArrayOutputStream inputForProgramOutputStream;

	public static Test suite() {
		return new TestSuite(UnitTests.class);
	}

	protected void setUp() {
		resultStream = new ByteArrayOutputStream();
		WriteNode.setStreamToWriteTo(new PrintStream(resultStream));

		inputForProgramOutputStream = new ByteArrayOutputStream();
		inputForProgram = new PrintStream(inputForProgramOutputStream);

	}

	private Oberon0Parser GetParser(String programText) {
		CharStream stream = new ANTLRStringStream(programText);
		Oberon0Lexer lexer = new Oberon0Lexer(stream);
		TokenStream tokenStream = new CommonTokenStream(lexer);
		Oberon0Parser parser = new Oberon0Parser(tokenStream);
		return parser;
	}

	public void testSmokeTest() {
		inputForProgram.println("1");
		inputForProgram.println("4");
		inputForProgram.println("3");
		inputForProgram.println("2");
		inputForProgram.println("5");

		InputStream inputForProgramInputStream = new ByteArrayInputStream(inputForProgramOutputStream.toByteArray());
		ReadNode.setStreamToReadFrom(inputForProgramInputStream);

		ExpectedResult expectedResult = new ExpectedResult();
		expectedResult.addString("1");
		expectedResult.addString("2");
		expectedResult.addString("3");
		expectedResult.addString("4");
		expectedResult.addString("5");
		TestResultEvaluator evaluator = new TestResultEvaluator(expectedResult);

		InterpreterExecuter.Execute("ExtRef\\smoke.txt", "module", "module");

		assertTrue(evaluator.evaluate(resultStream));
	}

	public void testTypeIdentifier() {
		ExpectedResult expectedResult = new ExpectedResult();
		expectedResult.addString("23");
		expectedResult.addString("4");
		TestResultEvaluator evaluator = new TestResultEvaluator(expectedResult);
		InterpreterExecuter.Execute("ExtRef\\TypeIdentifierTest", "module", "module");

		assertTrue(evaluator.evaluate(resultStream));
	}

	public void testRecordType() {
		ExpectedResult expectedResult = new ExpectedResult();
		expectedResult.addString("23");
		expectedResult.addString("2");
		expectedResult.addString("3");
		TestResultEvaluator evaluator = new TestResultEvaluator(expectedResult);
		InterpreterExecuter.Execute("ExtRef\\RecordTypeTest", "module", "module");

		assertTrue(evaluator.evaluate(resultStream));
	}

	public void testIntegerDivision() {
		ExpectedResult expectedResult = new ExpectedResult();
		expectedResult.addString("3");
		TestResultEvaluator evaluator = new TestResultEvaluator(expectedResult);
		InterpreterExecuter.Execute("ExtRef\\DivisionTest", "module", "module");

		assertTrue(evaluator.evaluate(resultStream));
	}

	public void testProcedureWithParamters() {
		ExpectedResult expectedResult = new ExpectedResult();
		expectedResult.addString("hallo ");
		expectedResult.addString("1");
		expectedResult.addString("3");
		expectedResult.addString("3");
		TestResultEvaluator evaluator = new TestResultEvaluator(expectedResult);
		InterpreterExecuter.Execute("ExtRef\\ProcedureWithParametersTest", "module", "module");

		assertTrue(evaluator.evaluate(resultStream));
	}

	public void testProcedureWithoutParameters() {
		ExpectedResult expectedResult = new ExpectedResult();
		expectedResult.addString("hallo ");

		TestResultEvaluator evaluator = new TestResultEvaluator(expectedResult);
		InterpreterExecuter.Execute("ExtRef\\ProcedureWithoutParametersTest", "module", "module");

		assertTrue(evaluator.evaluate(resultStream));
	}

	public void testConstantImmutability() {
		ExpectedResult expectedResult = new ExpectedResult();
		expectedResult.addString("9");
		expectedResult.addString("9");
		TestResultEvaluator evaluator = new TestResultEvaluator(expectedResult);
		InterpreterExecuter.Execute("ExtRef\\ConstantImmutabilityTest", "module", "module");

		assertTrue(evaluator.evaluate(resultStream));
	}

	public void testArray() {
		ExpectedResult expectedResult = new ExpectedResult();
		expectedResult.addString("5");
		expectedResult.addString("9");
		TestResultEvaluator evaluator = new TestResultEvaluator(expectedResult);
		InterpreterExecuter.Execute("ExtRef\\ArrayTest", "module", "module");

		assertTrue(evaluator.evaluate(resultStream));
	}

	public void testConstants() {
		ExpectedResult expectedResult = new ExpectedResult();
		expectedResult.addString("9");
		TestResultEvaluator evaluator = new TestResultEvaluator(expectedResult);
		InterpreterExecuter.Execute("ExtRef\\ConstantTest", "module", "module");

		assertTrue(evaluator.evaluate(resultStream));
	}

	public void testSimpleModule() {
		ExpectedResult expectedResult = new ExpectedResult();
		expectedResult.addString("testtt ");
		TestResultEvaluator evaluator = new TestResultEvaluator(expectedResult);
		InterpreterExecuter.Execute("ExtRef\\SimpleModuleTest", "module", "module");

		assertTrue(evaluator.evaluate(resultStream));
	}

	public void testWhileLoop() {
		ExpectedResult expectedResult = new ExpectedResult();
		expectedResult.addString("a ");
		expectedResult.addString("a ");
		expectedResult.addString("a ");
		expectedResult.addString("a ");
		expectedResult.addString("a ");
		TestResultEvaluator evaluator = new TestResultEvaluator(expectedResult);
		InterpreterExecuter.Execute("ExtRef\\WhileTest", "module", "module");

		assertTrue(evaluator.evaluate(resultStream));
	}

	public void testIf() {
		ExpectedResult expectedResult = new ExpectedResult();
		expectedResult.addString("in if ");
		TestResultEvaluator evaluator = new TestResultEvaluator(expectedResult);
		InterpreterExecuter.Execute("ExtRef\\IfTest", "ifStatement", "ifStatement");

		assertTrue(evaluator.evaluate(resultStream));
	}

	public void testIfElse() {
		ExpectedResult expectedResult = new ExpectedResult();
		expectedResult.addString("in else ");
		TestResultEvaluator evaluator = new TestResultEvaluator(expectedResult);
		InterpreterExecuter.Execute("ExtRef\\IfElseTest", "ifStatement", "ifStatement");

		assertTrue(evaluator.evaluate(resultStream));
	}

	public void testIfElseIf() {
		ExpectedResult expectedResult = new ExpectedResult();
		expectedResult.addString("in else if ");
		TestResultEvaluator evaluator = new TestResultEvaluator(expectedResult);
		InterpreterExecuter.Execute("ExtRef\\IfElseElseIfTest", "ifStatement", "ifStatement");

		assertTrue(evaluator.evaluate(resultStream));
	}

	public void testSimpleExpressionWithNegation() {
		Oberon0Parser parser = GetParser("-22");
		Interpretable interpreter = null;
		try {
			interpreter = parser.simpleExpression().simpleExpression;
		} catch (RecognitionException e) {
			assertTrue(false);
			e.printStackTrace();
		}
		try {
			IntegerValue result = (IntegerValue) interpreter.interpret(new Context());
			assertTrue(result.equals(new IntegerValue(-22)));
		} catch (Exception e) {
			assertTrue(false);
			e.printStackTrace();
		}
	}

	public void testSimpleExpressionWithAdd() {
		Oberon0Parser parser = GetParser("22+2");
		Interpretable interpreter = null;
		try {
			interpreter = parser.simpleExpression().simpleExpression;
		} catch (RecognitionException e) {
			assertTrue(false);
			e.printStackTrace();
		}
		try {
			IntegerValue result = (IntegerValue) interpreter.interpret(new Context());
			assertTrue(result.equals(new IntegerValue(24)));
		} catch (Exception e) {
			assertTrue(false);
			e.printStackTrace();
		}
	}

	public void testSimpleExpressionWithMin() {
		Oberon0Parser parser = GetParser("22-2");
		Interpretable interpreter = null;
		try {
			interpreter = parser.simpleExpression().simpleExpression;
		} catch (RecognitionException e) {
			assertTrue(false);
			e.printStackTrace();
		}
		try {
			IntegerValue result = (IntegerValue) interpreter.interpret(new Context());
			assertTrue(result.equals(new IntegerValue(20)));
		} catch (Exception e) {
			assertTrue(false);
			e.printStackTrace();
		}
	}

	public void testTerm() {
		Oberon0Parser parser = GetParser("22*2");
		Interpretable interpreter = null;
		try {
			interpreter = parser.term().term;
		} catch (RecognitionException e) {
			assertTrue(false);
			e.printStackTrace();
		}
		try {
			IntegerValue result = (IntegerValue) interpreter.interpret(new Context());
			assertTrue(result.equals(new IntegerValue(44)));
		} catch (Exception e) {
			assertTrue(false);
			e.printStackTrace();
		}
	}

	public void testFactorWithInteger() {
		Oberon0Parser parser = GetParser("22");
		Interpretable interpreter = null;
		try {
			interpreter = parser.factor().factor;
		} catch (RecognitionException e) {
			assertTrue(false);
			e.printStackTrace();
		}
		try {
			IntegerValue result = (IntegerValue) interpreter.interpret(new Context());
			assertTrue(result.equals(new IntegerValue(22)));
		} catch (Exception e) {
			assertTrue(false);
			e.printStackTrace();
		}
	}

	public void testFactorWithSelector() {
		Oberon0Parser parser = GetParser("a");
		Interpretable interpreter = null;
		try {
			interpreter = parser.factor().factor;
		} catch (RecognitionException e) {
			assertTrue(false);
			e.printStackTrace();
		}
		try {
			Context context = new Context();
			ConstantList constants = new ConstantList();
			constants.addItem("a", new DataField(new SimpleType("INTEGER"), new IntegerValue(9)));
			context.addConstants(constants);
			Object result = interpreter.interpret(context);
			assertTrue(((DataField) result).getValue(context).toString().compareTo("9") == 0);
		} catch (Exception e) {
			assertTrue(false);
			e.printStackTrace();
		}
	}

	public void testAssignmentNode() {
		Oberon0Parser parser = GetParser("a := 3");
		Interpretable interpreter = null;
		try {
			interpreter = parser.assignment().assignment;
		} catch (RecognitionException e) {
			assertTrue(false);
			e.printStackTrace();
		}
		try {
			Context context = new Context();
			DataFieldList varList = new DataFieldList();
			DataField variable = new DataField(new SimpleType("INTEGER"));
			varList.addItem("a", variable);
			context.addVariables(varList);
			Object result = interpreter.interpret(context);
			assertTrue(result.toString().compareTo("0") == 0);
		} catch (Exception e) {
			assertTrue(false);
			e.printStackTrace();
		}
	}

	public void testExpressionWithEquals() {
		Oberon0Parser parser = GetParser("2 = 2");
		Interpretable interpreter = null;
		try {
			interpreter = parser.expression().expression;
		} catch (RecognitionException e) {
			assertTrue(false);
			e.printStackTrace();
		}
		try {
			Object result = interpreter.interpret(new Context());
			assertTrue(((BooleanValue) result).getValueAsBoolean());
		} catch (Exception e) {
			assertTrue(false);
			e.printStackTrace();
		}
	}

	public void testExpressionWithGreater() {
		Oberon0Parser parser = GetParser("3 > 2");
		Interpretable interpreter = null;
		try {
			interpreter = parser.expression().expression;
		} catch (RecognitionException e) {
			assertTrue(false);
			e.printStackTrace();
		}
		try {
			Object result = interpreter.interpret(new Context());
			assertTrue(((BooleanValue) result).getValueAsBoolean());
		} catch (Exception e) {
			assertTrue(false);
			e.printStackTrace();
		}
	}

	public void testSimpleExpressionBIG() {
		Oberon0Parser parser = GetParser("2+4*5 DIV 2 MOD 5");
		Interpretable interpreter = null;
		try {
			interpreter = parser.simpleExpression().simpleExpression;
		} catch (RecognitionException e) {
			assertTrue(false);
			e.printStackTrace();
		}
		try {
			Object result = interpreter.interpret(new Context());
			assertTrue(((IntegerValue) result).equals(new IntegerValue(2)));
		} catch (Exception e) {
			assertTrue(false);
			e.printStackTrace();
		}
	}

}
