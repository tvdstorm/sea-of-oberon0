package oberon0.tests;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import oberon0.Oberon0Interpreter;
import oberon0.Oberon0Lexer;
import oberon0.Oberon0Parser;
import oberon0.Oberon0Parser.program_return;
import oberon0.exception.ExecutionException;
import oberon0.program.Program;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ReseverProcedureTest {
	
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

	@Before
	public void setUpStreams() {
	    System.setOut(new PrintStream(outContent));
	}

	@After
	public void cleanUpStreams() {
		System.setOut(null);
	}
	
	@Test
	public void test_writeReserverdProcedureCall() throws RecognitionException
	{
		evaluateOutput(	"MODULE Bla;\n" + 
							"VAR\n" + 
							"	i:INTEGER;\n" +  
							"BEGIN\n" + 
							"	i := 10;\n" + 
							"	Write(i)" + 
							"END Bla.","10", null);
	}
	
	@Test
	public void test_readReserverdProcedureCall() throws RecognitionException
	{
		
		String []args = {"10"};
		
		evaluateOutput(	"MODULE Bla;\n" + 
							"VAR\n" + 
							"	i:INTEGER;\n" +  
							"BEGIN\n" + 
							"	Read(i);\n" + 
							"	Write(i)" + 
							"END Bla.","10",args);
	}
	
	private void evaluateOutput(String input, String checkValue, String [] args) throws RecognitionException
	{
		//Get the generated expressions
		Oberon0Parser parser = createParserForInputString(input);
		program_return r = parser.program();
		
		//Create a tree walker from the tree (as node stream).
		CommonTreeNodeStream nodeStream = new CommonTreeNodeStream(r.getTree());
		Oberon0Interpreter walker = new Oberon0Interpreter(nodeStream);
		
		try {
			//Finally evaluate the expression.
			Program program= walker.program();
			program.addArguments(args);
			program.start();

			
		   assertEquals(checkValue, outContent.toString());
		
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
