package ar.oberon0.test;

import java.io.IOException;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;

import ar.oberon0.interpreter.Interpretable;
import ar.oberon0.interpreter.DataTypes.IntegerNode;
import ar.oberon0.interpreter.DataTypes.SimpleType;
import ar.oberon0.interpreter.Lists.ConstantList;
import ar.oberon0.interpreter.Lists.DataFieldList;
import ar.oberon0.interpreter.Memory.Context;
import ar.oberon0.interpreter.Memory.DataField;
import ar.oberon0.parser.Oberon0Lexer;
import ar.oberon0.parser.Oberon0Parser;

public class Tester
{

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException
	{

		Tester tester = new Tester();
		tester.TestIntegerDivision();
		tester.SmokeTest();
		/*
		 * tester.TestProcedureWithParamters();
		 * tester.TestProcedureWithoutVars(); tester.TestConstantImmutability();
		 * tester.TestArray(); tester.TestConstants(); tester.TestIf();
		 * tester.TestIfElse(); tester.TestIfElseIf(); tester.TestWhileLoop();
		 * tester.TestSimpleModule(); tester.TestTerm();
		 * tester.TestFactorWithInteger(); tester.TestFactorWithSelector();
		 * tester.TestSimpleExpressionWithNegation();
		 * tester.TestSimpleExpressionWithAdd();
		 * tester.TestSimpleExpressionWithMin();
		 * tester.TestExpressionWithEquals();
		 * tester.TestExpressionWithGreater(); tester.TestSimpleExpressionBIG();
		 * tester.TestAssignmentNode();
		 */
		System.out.println("Finished");
	}

	private Oberon0Parser GetParser(String programText)
	{
		CharStream stream = new ANTLRStringStream(programText);
		Oberon0Lexer lexer = new Oberon0Lexer(stream);
		TokenStream tokenStream = new CommonTokenStream(lexer);
		Oberon0Parser parser = new Oberon0Parser(tokenStream);
		return parser;
	}

	private void SmokeTest()
	{
		try
		{
			CharStream stream = new ANTLRFileStream("D:\\DropBox\\My Dropbox\\UVA\\SC\\smoke.txt");
			Oberon0Lexer lexer = new Oberon0Lexer(stream);
			TokenStream tokenStream = new CommonTokenStream(lexer);
			Oberon0Parser parser = new Oberon0Parser(tokenStream);
			Interpretable interpreter = parser.module().result;
			interpreter.Interpret(null);

		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RecognitionException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void TestIntegerDivision()
	{
		Oberon0Parser parser = GetParser("MODULE module; BEGIN Write( 7 DIV 2 ) END module");
		Interpretable interpreter = null;
		try
		{
			interpreter = parser.module().result;
		} catch (RecognitionException e)
		{
			e.printStackTrace();
		}
		try
		{
			Integer result = (Integer) interpreter.Interpret(null);
			System.out.println(getResultString("Procedure with parameters", result.equals(0)));
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	public void TestProcedureWithParamters()
	{
		Oberon0Parser parser = GetParser("MODULE module; VAR i: INTEGER; PROCEDURE PrintHallo(VAR message: INTEGER); BEGIN Write(\"hallo\"); Write(message); message := 3; Write(message) END PrintHallo; BEGIN i := 1; PrintHallo(i); Write(i) END module");
		Interpretable interpreter = null;
		try
		{
			interpreter = parser.module().result;
		} catch (RecognitionException e)
		{
			e.printStackTrace();
		}
		try
		{
			Integer result = (Integer) interpreter.Interpret(null);
			System.out.println(getResultString("Procedure with parameters", result.equals(0)));
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	public void TestProcedureWithoutVars()
	{
		Oberon0Parser parser = GetParser("MODULE module; PROCEDURE PrintHallo; BEGIN Write(\"hallo\") END PrintHallo; BEGIN PrintHallo END module");
		Interpretable interpreter = null;
		try
		{
			interpreter = parser.module().result;
		} catch (RecognitionException e)
		{
			e.printStackTrace();
		}
		try
		{
			Integer result = (Integer) interpreter.Interpret(null);
			System.out.println(getResultString("Procedure without vars", result.equals(0)));
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	public void TestArray()
	{
		Oberon0Parser parser = GetParser("MODULE module;CONST length = 5; VAR input: ARRAY length OF INTEGER; BEGIN input[2] := 5; Write(input[2]); input[2] := 9; Write(input[2]) END module");
		Interpretable interpreter = null;
		try
		{
			interpreter = parser.module().result;
		} catch (RecognitionException e)
		{
			e.printStackTrace();
		}
		try
		{
			Integer result = (Integer) interpreter.Interpret(null);
			System.out.println(getResultString("constant", result.equals(0)));
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	public void TestConstants()
	{
		Oberon0Parser parser = GetParser("MODULE module;CONST const = 9; BEGIN Write(const) END module");
		Interpretable interpreter = null;
		try
		{
			interpreter = parser.module().result;
		} catch (RecognitionException e)
		{
			e.printStackTrace();
		}
		try
		{
			Integer result = (Integer) interpreter.Interpret(null);
			System.out.println(getResultString("constant", result.equals(0)));
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	public void TestConstantImmutability()
	{
		Oberon0Parser parser = GetParser("MODULE module;CONST const = 9; BEGIN Write(const); const := 10; Write(const) END module");
		Interpretable interpreter = null;
		try
		{
			interpreter = parser.module().result;
		} catch (RecognitionException e)
		{
			e.printStackTrace();
		}
		try
		{
			Integer result = (Integer) interpreter.Interpret(null);
			System.out.println(getResultString("constant", result.equals(0)));
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	public void TestIf()
	{
		Oberon0Parser parser = GetParser("IF 2 = 2 THEN Write(\"in if\") ELSE Write(\"in else\") END");
		Interpretable interpreter = null;
		try
		{
			interpreter = parser.ifStatement().result;
		} catch (RecognitionException e)
		{
			e.printStackTrace();
		}
		try
		{
			Integer result = (Integer) interpreter.Interpret(new Context());
			System.out.println(getResultString("if statement", result.equals(0)));
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	public void TestIfElse()
	{
		Oberon0Parser parser = GetParser("IF 2 = 3 THEN Write(\"in if\") ELSE Write(\"in else\") END");
		Interpretable interpreter = null;
		try
		{
			interpreter = parser.ifStatement().result;
		} catch (RecognitionException e)
		{
			e.printStackTrace();
		}
		try
		{
			Integer result = (Integer) interpreter.Interpret(new Context());
			System.out.println(getResultString("if else statement", result.equals(0)));
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	public void TestIfElseIf()
	{
		Oberon0Parser parser = GetParser("IF 2 = 3 THEN Write(\"in if\") ELSIF 3 = 3 THEN Write(\"in else if\") ELSE Write(\"in else\") END");
		Interpretable interpreter = null;
		try
		{
			interpreter = parser.ifStatement().result;
		} catch (RecognitionException e)
		{
			e.printStackTrace();
		}
		try
		{
			Integer result = (Integer) interpreter.Interpret(new Context());
			System.out.println(getResultString("if else if statement", result.equals(0)));
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	public void TestSimpleModule()
	{
		Oberon0Parser parser = GetParser("MODULE module;CONST const1 = 9; TYPE type1 = INTEGER; VAR var1 : INTEGER; BEGIN var1 := 1+1; Write(\"testtt\") END module");
		Interpretable interpreter = null;
		try
		{
			interpreter = parser.module().result;
		} catch (RecognitionException e)
		{
			e.printStackTrace();
		}
		try
		{
			Integer result = (Integer) interpreter.Interpret(new Context());
			System.out.println(getResultString("simple module", result.equals(0)));
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	public void TestWhileLoop()
	{
		Oberon0Parser parser = GetParser("MODULE module;VAR iterations, i : INTEGER; BEGIN iterations := 5; i := 0; WHILE i < iterations DO Write(\"a\"); i := i + 1 END END module");
		Interpretable interpreter = null;
		try
		{
			interpreter = parser.module().result;
		} catch (RecognitionException e)
		{
			e.printStackTrace();
		}
		try
		{
			Integer result = (Integer) interpreter.Interpret(new Context());
			System.out.println(getResultString("while loop", result.equals(0)));
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	public void TestSimpleExpressionWithNegation()
	{
		Oberon0Parser parser = GetParser("-22");
		Interpretable interpreter = null;
		try
		{
			interpreter = parser.simpleExpression().result;
		} catch (RecognitionException e)
		{
			e.printStackTrace();
		}
		try
		{
			IntegerNode result = (IntegerNode) interpreter.Interpret(new Context());
			System.out.println(getResultString("simpleExpression with negation", result.equals(new IntegerNode(-22))));
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	public void TestSimpleExpressionWithAdd()
	{
		Oberon0Parser parser = GetParser("22+2");
		Interpretable interpreter = null;
		try
		{
			interpreter = parser.simpleExpression().result;
		} catch (RecognitionException e)
		{
			e.printStackTrace();
		}
		try
		{
			IntegerNode result = (IntegerNode) interpreter.Interpret(new Context());
			System.out.println(getResultString("simpleExpression with add", result.equals(new IntegerNode(24))));
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	public void TestSimpleExpressionWithMin()
	{
		Oberon0Parser parser = GetParser("22-2");
		Interpretable interpreter = null;
		try
		{
			interpreter = parser.simpleExpression().result;
		} catch (RecognitionException e)
		{
			e.printStackTrace();
		}
		try
		{
			IntegerNode result = (IntegerNode) interpreter.Interpret(new Context());
			System.out.println(getResultString("simpleExpression with min", result.equals(new IntegerNode(20))));
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	public void TestTerm()
	{
		Oberon0Parser parser = GetParser("22*2");
		Interpretable interpreter = null;
		try
		{
			interpreter = parser.term().result;
		} catch (RecognitionException e)
		{
			e.printStackTrace();
		}
		try
		{
			IntegerNode result = (IntegerNode) interpreter.Interpret(new Context());
			System.out.println(getResultString("term", result.equals(new IntegerNode(44))));
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	public void TestFactorWithInteger()
	{
		Oberon0Parser parser = GetParser("22");
		Interpretable interpreter = null;
		try
		{
			interpreter = parser.factor().result;
		} catch (RecognitionException e)
		{
			e.printStackTrace();
		}
		try
		{
			IntegerNode result = (IntegerNode) interpreter.Interpret(new Context());
			System.out.println(getResultString("factor with integer", result.equals(new IntegerNode(22))));
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	public void TestFactorWithSelector()
	{
		Oberon0Parser parser = GetParser("a");
		Interpretable interpreter = null;
		try
		{
			interpreter = parser.factor().result;
		} catch (RecognitionException e)
		{
			e.printStackTrace();
		}
		try
		{
			Context context = new Context();
			ConstantList constants = new ConstantList();
			constants.AddItem("a", new DataField(new SimpleType("INTEGER"), new IntegerNode(9)));
			context.AddConstants(constants);
			Object result = interpreter.Interpret(context);
			System.out.println(getResultString("factor with ident", ((DataField) result).getValue(context).toString().compareTo("9") == 0));
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	public void TestAssignmentNode()
	{
		Oberon0Parser parser = GetParser("a := 3");
		Interpretable interpreter = null;
		try
		{
			interpreter = parser.assignment().result;
		} catch (RecognitionException e)
		{
			e.printStackTrace();
		}
		try
		{
			Context context = new Context();
			DataFieldList varList = new DataFieldList();
			DataField variable = new DataField(new SimpleType("INTEGER"));
			varList.AddItem("a", variable);
			context.AddVariables(varList);
			Object result = interpreter.Interpret(context);
			System.out.println(getResultString("assignment", result.toString().compareTo("Ok") == 0));
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	public void TestExpressionWithEquals()
	{
		Oberon0Parser parser = GetParser("2 = 2");
		Interpretable interpreter = null;
		try
		{
			interpreter = parser.expression().result;
		} catch (RecognitionException e)
		{
			e.printStackTrace();
		}
		try
		{
			Object result = interpreter.Interpret(new Context());
			System.out.println(getResultString("expression with Equals", (Boolean) result));
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	public void TestExpressionWithGreater()
	{
		Oberon0Parser parser = GetParser("3 > 2");
		Interpretable interpreter = null;
		try
		{
			interpreter = parser.expression().result;
		} catch (RecognitionException e)
		{
			e.printStackTrace();
		}
		try
		{
			Object result = interpreter.Interpret(new Context());
			System.out.println(getResultString("expression with Equals", (Boolean) result));
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	public void TestSimpleExpressionBIG()
	{
		Oberon0Parser parser = GetParser("2+4*5 DIV 2 MOD 5");
		Interpretable interpreter = null;
		try
		{
			interpreter = parser.simpleExpression().result;
		} catch (RecognitionException e)
		{
			e.printStackTrace();
		}
		try
		{
			Object result = interpreter.Interpret(new Context());
			System.out.println(getResultString("BIG TEST", ((IntegerNode) result).equals(new IntegerNode(2))));
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	private String getResultString(String rule, boolean passed)
	{
		if (passed)
			return "passed test for rule " + rule + ".";
		else
			return "Failed test for rule " + rule + ".";
	}
}
