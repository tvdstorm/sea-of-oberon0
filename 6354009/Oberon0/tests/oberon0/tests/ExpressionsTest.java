package oberon0.tests;

import static org.junit.Assert.assertEquals;
import oberon0.Oberon0Interpreter;
import oberon0.Oberon0Lexer;
import oberon0.Oberon0Parser;
import oberon0.Oberon0Parser.expression_return;
import oberon0.expression.IntegerExpression;
import oberon0.module.Module;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.junit.Test;


public class ExpressionsTest {
	
	@Test
	public void test_SimpleExpressions() throws RecognitionException
	{
		//Test a few simple expressions.
		evaluateExpression("-1 + 1",0);
		evaluateExpression("2 * 3 + 1",7);
		evaluateExpression("3 * 7 + 2 * 10 DIV 5",25);
		evaluateExpression("3 * (7 + 2) *10 DIV 5",54);
	}
	
	@Test
	public void test_Expressions() throws RecognitionException
	{
		//Test equals
		evaluateExpression("1 = 1",1);
		evaluateExpression("0 = 1",0);
		
		//Test not equals
		evaluateExpression("1 # 0",1);
		evaluateExpression("1 # 1",0);
		
		//Test greater than
		evaluateExpression("1 > 0",1);
		evaluateExpression("0 > 1",0);
		
		//Test greater or equals than
		evaluateExpression("1 >= 0",1);
		evaluateExpression("1 >= 1",1);
		evaluateExpression("0 >= 1",0);
		
		//Test smaller than
		evaluateExpression("0 < 1",1);
		evaluateExpression("1 < 0",0);
		
		//Test smaller or equals than
		evaluateExpression("0 <= 1",1);
		evaluateExpression("1 <= 1",1);
		evaluateExpression("1 <= 0",0);
		
		//And
		evaluateExpression("1 & 1", 1);
		evaluateExpression("1 & 0", 0);
	}
	
	private void evaluateExpression(String input, int answer) throws RecognitionException
	{
		//Get the generated expressions
		Oberon0Parser parser = createParserForInputString(input);
		expression_return expression = parser.expression();
		
		//Create a tree walker from the tree (as node stream).
		CommonTreeNodeStream nodeStream = new CommonTreeNodeStream(expression.getTree());
		Oberon0Interpreter walker = new Oberon0Interpreter(nodeStream);
		
		//Finally evaluate the expression.
		
		IntegerExpression endValue =  (IntegerExpression) walker.expression().evaluate(new Module("Test"));
		assertEquals(endValue.getIntegerTypeValue(), answer);
	}
	
	
	private Oberon0Parser createParserForInputString(String input)
	{ 
		//Create a lexer from the input (as string stream).
		ANTLRStringStream simpleExpr = new ANTLRStringStream(input);
		Oberon0Lexer lex = new Oberon0Lexer(simpleExpr);
		
		//Finally create a parser from the stream of tokens.
		CommonTokenStream tokens = new CommonTokenStream(lex);
		return new Oberon0Parser(tokens);
	}
	
}
