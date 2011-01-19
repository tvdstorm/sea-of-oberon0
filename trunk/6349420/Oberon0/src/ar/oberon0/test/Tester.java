package ar.oberon0.test;

import java.io.IOException;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;

import ar.oberon0.interpreter.Interpretable;
import ar.oberon0.parser.Oberon0Lexer;
import ar.oberon0.parser.Oberon0Parser;




public class Tester {

	private Oberon0Parser GetParser(String programText)
	{
		CharStream stream = new ANTLRStringStream(programText);
		Oberon0Lexer lexer = new Oberon0Lexer(stream);
		TokenStream tokenStream = new CommonTokenStream(lexer);
		Oberon0Parser parser = new Oberon0Parser(tokenStream);
		return parser;
	}
	
	public void TestSimpleExpressionWithNegation()
	{
		Oberon0Parser parser = GetParser("-22");
		Interpretable interpreter = null;
		try {
			interpreter = parser.simpleExpression().result;
		} catch (RecognitionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			int result = (Integer)interpreter.Interpret();
			System.out.println(getResultString("simpleExpression with negation",result == -22));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void TestSimpleExpressionWithAdd()
	{
		Oberon0Parser parser = GetParser("22+2");
		Interpretable interpreter = null;
		try {
			interpreter = parser.simpleExpression().result;
		} catch (RecognitionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			int result = (Integer)interpreter.Interpret();
			System.out.println(getResultString("simpleExpression with add",result == 24));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void TestSimpleExpressionWithMin()
	{
		Oberon0Parser parser = GetParser("22-2");
		Interpretable interpreter = null;
		try {
			interpreter = parser.simpleExpression().result;
		} catch (RecognitionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			int result = (Integer)interpreter.Interpret();
			System.out.println(getResultString("simpleExpression with min",result == 20));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void TestTerm()
	{
		Oberon0Parser parser = GetParser("22*2");
		Interpretable interpreter = null;
		try {
			interpreter = parser.term().result;
		} catch (RecognitionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			int result = (Integer)interpreter.Interpret();
			System.out.println(getResultString("term",result == 44));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void TestFactorWithInteger()
	{
		Oberon0Parser parser = GetParser("22");
		Interpretable interpreter = null;
		try {
			interpreter = parser.factor().result;
		} catch (RecognitionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			int result = (Integer)interpreter.Interpret();
			System.out.println(getResultString("factor with integer",result == 22));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void TestFactorWithSelector()
	{
		Oberon0Parser parser = GetParser("a.b[1+1]");
		Interpretable interpreter = null;
		try {
			interpreter = parser.factor().result;
		} catch (RecognitionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Object result = interpreter.Interpret();
			System.out.println(getResultString("factor with ident",result.toString().compareTo("a.b.[2]") == 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void TestAssignmentNode()
	{
		Oberon0Parser parser = GetParser("a.b := 3");
		Interpretable interpreter = null;
		try {
			interpreter = parser.assignment().result;
		} catch (RecognitionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Object result = interpreter.Interpret();
			System.out.println(getResultString("assignment",result.toString().compareTo("Ok") == 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void TestExpressionWithEquals()
	{
		Oberon0Parser parser = GetParser("2 = 2");
		Interpretable interpreter = null;
		try {
			interpreter = parser.expression().result;
		} catch (RecognitionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Object result = interpreter.Interpret();
			System.out.println(getResultString("expression with Equals",(Boolean)result));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void TestExpressionWithGreater()
	{
		Oberon0Parser parser = GetParser("3 > 2");
		Interpretable interpreter = null;
		try {
			interpreter = parser.expression().result;
		} catch (RecognitionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Object result = interpreter.Interpret();
			System.out.println(getResultString("expression with Equals",(Boolean)result));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void TestSimpleExpressionBIG()
	{
		Oberon0Parser parser = GetParser("2+4*5 DIV 2 MOD 5");
		Interpretable interpreter = null;
		try {
			interpreter = parser.simpleExpression().result;
		} catch (RecognitionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Object result = interpreter.Interpret();
			System.out.println(getResultString("BIG TEST",(Integer)result == 2));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private String getResultString(String rule,boolean passed)
	{
		if(passed)
			return "passed test for rule " + rule + ".";
		else
			return "Failed test for rule " + rule + ".";
	}
	
	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
				
		Tester tester = new Tester();
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

}
