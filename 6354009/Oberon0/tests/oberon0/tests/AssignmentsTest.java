package oberon0.tests;

import static org.junit.Assert.assertEquals;
import oberon0.Oberon0Interpreter;
import oberon0.Oberon0Lexer;
import oberon0.Oberon0Parser;
import oberon0.Oberon0Parser.program_return;
import oberon0.exception.ExecutionException;
import oberon0.expression.IntegerExpression;
import oberon0.identifier.Identifier;
import oberon0.module.Module;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.junit.Test;


public class AssignmentsTest {
	
	@Test
	public void test_simpleAssigment() throws RecognitionException
	{
		//Test a few simple expressions.
		evaluateAssignment(	"MODULE Bla;\n" + 
							"VAR\n" + 
							"	i:INTEGER;\n" +  
							"BEGIN\n" + 
							"	i := 10;\n" + 
							"END Bla.","i",10);
	}
	
	@Test
	public void test_complexAssigment() throws RecognitionException
	{
		//Test a few simple expressions.
		evaluateAssignment(	"MODULE Bla;\n" +
							"CONST\n" + 
							"	CONSTANT_ONE = 10;\n" +
							"VAR\n" + 
							"	i:INTEGER;\n" +  
							"BEGIN\n" + 
							"	i := 10;\n" +
							"	i := i + CONSTANT_ONE;\n" +
							"END Bla.","i",20);
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
			
			IntegerExpression endValue = (IntegerExpression)module.getValueForIdentifier(ident);
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
