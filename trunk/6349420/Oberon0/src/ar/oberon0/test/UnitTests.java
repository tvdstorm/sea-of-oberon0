package ar.oberon0.test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.List;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;

import ar.oberon0.ast.dataTypes.IntegerType;
import ar.oberon0.ast.statements.ReadNode;
import ar.oberon0.ast.statements.WriteNode;
import ar.oberon0.lists.ConstantList;
import ar.oberon0.lists.DataFieldList;
import ar.oberon0.parser.Oberon0Lexer;
import ar.oberon0.parser.Oberon0Parser;
import ar.oberon0.runtime.Context;
import ar.oberon0.runtime.DataField;
import ar.oberon0.shared.CheckViolation;
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

	public void testTypeChecking() {

		List<CheckViolation> violations = InterpreterExecuter.check("ExtRef\\TypeCheckerTest", "module", "module");
		assertTrue(violations.size() == 2);
		assertTrue(violations.get(0).getMessage().equals("The types of the assignment did not match."));
		assertTrue(violations.get(1).getMessage().equals("There is no variable or constant var2 in the scope."));
	}

	public void testTypeChecking2() {

		List<CheckViolation> violations = InterpreterExecuter.check("ExtRef\\TypeCheckerTest2", "module", "module");
		assertTrue(violations.size() == 3);
		assertTrue(violations.get(0).getMessage().equals("The type of parameter \"message\" did not match the type of the formal parameter in the function \"PrintHallo\"."));
		assertTrue(violations.get(1).getMessage().equals("There is no procedure with the name FunctieDieNietBestaat."));
		assertTrue(violations.get(2).getMessage().equals("The types of the assignment did not match."));
	}

	public void testSmokeTest() {
		inputForProgram.println("10");
		inputForProgram.println("14");
		inputForProgram.println("12");
		inputForProgram.println("6");
		inputForProgram.println("5");

		InputStream inputForProgramInputStream = new ByteArrayInputStream(inputForProgramOutputStream.toByteArray());
		ReadNode.setStreamToReadFrom(inputForProgramInputStream);

		ExpectedResult expectedResult = new ExpectedResult();
		expectedResult.addString("5");
		expectedResult.addString("6");
		expectedResult.addString("10");
		expectedResult.addString("12");
		expectedResult.addString("14");
		TestResultEvaluator evaluator = new TestResultEvaluator(expectedResult);

		InterpreterExecuter.interpret("ExtRef\\smoke.txt", "module", "module");

		assertTrue(evaluator.evaluate(resultStream));
	}

	public void testTypeIdentifier() {
		ExpectedResult expectedResult = new ExpectedResult();
		expectedResult.addString("23");
		expectedResult.addString("4");
		TestResultEvaluator evaluator = new TestResultEvaluator(expectedResult);
		InterpreterExecuter.interpret("ExtRef\\TypeIdentifierTest", "module", "module");

		assertTrue(evaluator.evaluate(resultStream));
	}

	public void testWith() {
		ExpectedResult expectedResult = new ExpectedResult();
		expectedResult.addString("4");
		expectedResult.addString("5");
		expectedResult.addString("23");
		TestResultEvaluator evaluator = new TestResultEvaluator(expectedResult);
		InterpreterExecuter.interpret("ExtRef\\WithTest", "module", "module");

		assertTrue(evaluator.evaluate(resultStream));
	}

	public void testRecordType() {
		ExpectedResult expectedResult = new ExpectedResult();
		expectedResult.addString("23");
		expectedResult.addString("2");
		expectedResult.addString("3");
		TestResultEvaluator evaluator = new TestResultEvaluator(expectedResult);
		InterpreterExecuter.interpret("ExtRef\\RecordTypeTest", "module", "module");

		assertTrue(evaluator.evaluate(resultStream));
	}

	public void testIntegerDivision() {
		ExpectedResult expectedResult = new ExpectedResult();
		expectedResult.addString("3");
		TestResultEvaluator evaluator = new TestResultEvaluator(expectedResult);
		InterpreterExecuter.interpret("ExtRef\\DivisionTest", "module", "module");

		assertTrue(evaluator.evaluate(resultStream));
	}

	public void testProcedureWithParamters() {
		ExpectedResult expectedResult = new ExpectedResult();
		expectedResult.addString("hallo");
		expectedResult.addString("1");
		expectedResult.addString("3");
		expectedResult.addString("3");
		TestResultEvaluator evaluator = new TestResultEvaluator(expectedResult);
		InterpreterExecuter.interpret("ExtRef\\ProcedureWithParametersTest", "module", "module");

		assertTrue(evaluator.evaluate(resultStream));
	}

	public void testProcedureWithoutParameters() {
		ExpectedResult expectedResult = new ExpectedResult();
		expectedResult.addString("hallo");

		TestResultEvaluator evaluator = new TestResultEvaluator(expectedResult);
		InterpreterExecuter.interpret("ExtRef\\ProcedureWithoutParametersTest", "module", "module");

		assertTrue(evaluator.evaluate(resultStream));
	}

	public void testConstantImmutability() {
		ExpectedResult expectedResult = new ExpectedResult();
		expectedResult.addString("9");
		expectedResult.addString("9");
		TestResultEvaluator evaluator = new TestResultEvaluator(expectedResult);
		InterpreterExecuter.interpret("ExtRef\\ConstantImmutabilityTest", "module", "module");

		assertTrue(evaluator.evaluate(resultStream));
	}

	public void testArray() {
		ExpectedResult expectedResult = new ExpectedResult();
		expectedResult.addString("5");
		expectedResult.addString("9");
		TestResultEvaluator evaluator = new TestResultEvaluator(expectedResult);
		InterpreterExecuter.interpret("ExtRef\\ArrayTest", "module", "module");

		assertTrue(evaluator.evaluate(resultStream));
	}

	public void testConstants() {
		ExpectedResult expectedResult = new ExpectedResult();
		expectedResult.addString("9");
		TestResultEvaluator evaluator = new TestResultEvaluator(expectedResult);
		InterpreterExecuter.interpret("ExtRef\\ConstantTest", "module", "module");

		assertTrue(evaluator.evaluate(resultStream));
	}

	public void testSimpleModule() {
		ExpectedResult expectedResult = new ExpectedResult();
		expectedResult.addString("testtt");
		TestResultEvaluator evaluator = new TestResultEvaluator(expectedResult);
		InterpreterExecuter.interpret("ExtRef\\SimpleModuleTest", "module", "module");

		assertTrue(evaluator.evaluate(resultStream));
	}

	public void testWhileLoop() {
		ExpectedResult expectedResult = new ExpectedResult();
		expectedResult.addString("a");
		expectedResult.addString("a");
		expectedResult.addString("a");
		expectedResult.addString("a");
		expectedResult.addString("a");
		TestResultEvaluator evaluator = new TestResultEvaluator(expectedResult);
		InterpreterExecuter.interpret("ExtRef\\WhileTest", "module", "module");

		assertTrue(evaluator.evaluate(resultStream));
	}

	public void testIf() {
		ExpectedResult expectedResult = new ExpectedResult();
		expectedResult.addString("in if");
		TestResultEvaluator evaluator = new TestResultEvaluator(expectedResult);
		InterpreterExecuter.interpret("ExtRef\\IfTest", "ifStatement", "ifStatement");

		assertTrue(evaluator.evaluate(resultStream));
	}

	public void testIfElse() {
		ExpectedResult expectedResult = new ExpectedResult();
		expectedResult.addString("in else");
		TestResultEvaluator evaluator = new TestResultEvaluator(expectedResult);
		InterpreterExecuter.interpret("ExtRef\\IfElseTest", "ifStatement", "ifStatement");

		assertTrue(evaluator.evaluate(resultStream));
	}

	public void testIfElseIf() {
		ExpectedResult expectedResult = new ExpectedResult();
		expectedResult.addString("in else if");
		TestResultEvaluator evaluator = new TestResultEvaluator(expectedResult);
		InterpreterExecuter.interpret("ExtRef\\IfElseElseIfTest", "ifStatement", "ifStatement");

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
			constants.addItem("a", new DataField(new IntegerType(), new IntegerValue(9)));
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
			DataField variable = new DataField(new IntegerType());
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
