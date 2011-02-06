package oberon0.tests;

import static org.junit.Assert.assertEquals;
import oberon0.Oberon0Interpreter;
import oberon0.Oberon0Lexer;
import oberon0.Oberon0Parser;
import oberon0.Oberon0Parser.program_return;
import oberon0.interpreter.exceptions.ExecutionException;
import oberon0.interpreter.expression.IntegerExpression;
import oberon0.interpreter.identifier.Identifier;
import oberon0.interpreter.module.Module;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.junit.Test;


public class StamentsTest {
	
	@Test
	public void test_simpleIfStatement() throws RecognitionException
	{
		//Test a few simple expressions.
		evaluateAssignment(	"MODULE QuickSort;\n" + 
							"VAR\n" + 
							"	i : INTEGER;\n" + 
							"BEGIN\n" + 
							"i := 10;\n" + 
							"IF 1 THEN\n" + 
							"	i := 20;	   	\n" + 
							"END\n" + 
							"END QuickSort."
						  ,"i",20);
	}
	
	@Test
	public void test_complexIfStatement1() throws RecognitionException
	{
		//Test a few simple expressions.
		evaluateAssignment(	"MODULE QuickSort;\n" + 
							"VAR\n" + 
							"	i : INTEGER;\n" + 
							"BEGIN\n" + 
							"i := 10;\n" + 
							"IF 1 THEN\n" + 
							"	i := 20;	   	\n" + 
							"END\n" + 
							"END QuickSort."
						  ,"i",20);
	}
	
	@Test
	public void test_complexIfStatement2() throws RecognitionException
	{
		//Test a few simple expressions.
		evaluateAssignment(	"MODULE QuickSort;\n" + 
							"VAR\n" + 
							"	left : INTEGER;\n" +
							"	right : INTEGER;\n" +
							"	i : INTEGER;\n" +
							"BEGIN\n" + 
							"i := 0;\n" +
							"left := 0;\n" +
							"right := 4;\n" +
							"IF right - left > 0 THEN\n" + 
							"	i := 20;	   	\n" + 
							"END\n" + 
							"END QuickSort."
						  ,"i",20);
	}
	
	@Test
	public void test_whileStatement() throws RecognitionException
	{
		//Test a few simple expressions.
		evaluateAssignment(	"MODULE QuickSort;\n" + 
							"VAR\n" + 
							"	i : INTEGER;\n" + 
							"BEGIN\n" + 
							"i := 0;\n" + 
							"WHILE i < 10 DO\n" + 
							"	i := i + 1;	   	\n" + 
							"END\n" + 
							"END QuickSort."
						  ,"i",10);
	}
	
	private void evaluateAssignment(String input, String identifier, int checkValue) throws RecognitionException
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
