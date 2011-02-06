package oberon0.tests;

import static org.junit.Assert.assertEquals;
import oberon0.Oberon0Interpreter;
import oberon0.Oberon0Lexer;
import oberon0.Oberon0Parser;
import oberon0.Oberon0Parser.program_return;
import oberon0.interpreter.exceptions.ExecutionException;
import oberon0.interpreter.expression.IntegerExpression;
import oberon0.interpreter.identifier.ArrayIndexSelector;
import oberon0.interpreter.identifier.Identifier;
import oberon0.interpreter.module.Module;
import oberon0.interpreter.type.IntegerType;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.junit.Test;


public class PrimitiveTypeTests {
	
	@Test
	public void test_integerTypeTest() throws RecognitionException
	{
		//Test a few simple expressions.
		evaluateAssignment(	"MODULE Bla;\n" + 
							"VAR\n" + 
							"	x:INTEGER;\n" +  
							"BEGIN\n" + 
						
							"	x := 1;\n" +   
							"END Bla.","x",1);
	}
	
	@Test
	public void test_arrayTypeTest() throws RecognitionException
	{
		//Test a few simple expressions.
		evaluateArrayAssignment(	"MODULE Bla;\n" + 
							"VAR\n" + 
							"	x: ARRAY 5 OF INTEGER;" + 
							"BEGIN\n" + 
							"	x[0] := 5;\n" +
							"	x[1] := 10;\n" +  
							"END Bla.","x",1,10);
	}
	
	@Test
	public void test_complexArrayTypeTest() throws RecognitionException
	{
		//Test a few simple expressions.
		evaluateArrayAssignment(	"MODULE Bla;\n" + 
							"VAR\n" + 
							"	x: ARRAY 5 OF INTEGER;" +
							"	y: ARRAY 5 OF INTEGER;" +
							"BEGIN\n" + 
							"	x[0] := 5;\n" +
							"	x[1] := 10;\n" +
							"	y := x;\n" +
							"END Bla.","y",1,10);
	}
	
	private void evaluateAssignment(String input, String identifier,int checkValue) throws RecognitionException
	{
		//Get the generated expressions
		Oberon0Parser parser = createParserForInputString(input);
		program_return r = parser.program();
		
		//Create a tree walker from the tree (as node stream).
		CommonTreeNodeStream nodeStream = new CommonTreeNodeStream(r.getTree());
		Oberon0Interpreter walker = new Oberon0Interpreter(nodeStream);
		
		try {
			//Finally evaluate the expression.
			Module module= walker.module();
			module.start();
			
			Identifier ident = new Identifier(identifier);
			
			IntegerExpression endValue = (IntegerExpression) module.getValueForIdentifier(ident);
			assertEquals(endValue.getIntegerTypeValue(), checkValue);
		
		} catch (ExecutionException e) {
			//Failed!
			throw new AssertionError();
		}
	}
	
	private void evaluateArrayAssignment(String input, String identifier,int index, int checkValue) throws RecognitionException
	{
		//Get the generated expressions
		Oberon0Parser parser = createParserForInputString(input);
		program_return r = parser.program();
		
		//Create a tree walker from the tree (as node stream).
		CommonTreeNodeStream nodeStream = new CommonTreeNodeStream(r.getTree());
		Oberon0Interpreter walker = new Oberon0Interpreter(nodeStream);
		
		try {
			//Finally evaluate the expression.
			Module module= walker.module();
			module.start();
			
			ArrayIndexSelector selector = new ArrayIndexSelector(new IntegerExpression(new IntegerType(index)));
			
			Identifier ident = new Identifier(identifier);
			ident.addSelector(selector);
			
			IntegerExpression endValue = (IntegerExpression) module.getValueForIdentifier(ident);
			assertEquals(endValue.getIntegerTypeValue(), checkValue);
		
		} catch (ExecutionException e) {
			//Failed!
			throw new AssertionError();
		}
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
