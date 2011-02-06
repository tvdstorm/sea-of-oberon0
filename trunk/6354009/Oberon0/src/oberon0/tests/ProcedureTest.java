package oberon0.tests;

import static org.junit.Assert.assertEquals;
import oberon0.Oberon0Interpreter;
import oberon0.Oberon0Lexer;
import oberon0.Oberon0Parser;
import oberon0.Oberon0Parser.program_return;
import oberon0.interpreter.exceptions.ExecutionException;
import oberon0.interpreter.expression.IntegerExpression;
import oberon0.interpreter.identifier.Identifier;
import oberon0.interpreter.program.Program;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.junit.Test;


public class ProcedureTest {

	@Test
	public void test_procedureWithReferencedParameters() throws RecognitionException
	{
		//Test a few simple expressions.
		evaluateAssignment(	"MODULE Bla;\n" + 
							"CONST\n" + 
							"	CONSTANT_ONE = 10;\n" + 
							"VAR\n" + 
							"	x:INTEGER;\n" + 
							"	y:INTEGER;\n" + 
							"PROCEDURE Swap(VAR x, y: INTEGER);\n" + 
							"  VAR\n" + 
							"    temp: INTEGER;\n" + 
							"  BEGIN\n" + 
							"    temp := x;\n" + 
							"    x := y;\n" + 
							"    y := temp\n" + 
							"  END Swap;\n" + 
							"BEGIN\n" + 
							"	x := 0;\n" + 
							"	y := 10;\n" + 
							"	Swap(x,y);\n" + 
							"END Bla.","x",10);
	}

	
	@Test
	public void test_procedureWithComplicatedReferencedParameters() throws RecognitionException
	{
		//Test a few simple expressions.
		evaluateAssignment(	"MODULE Bla;\n" + 
							"VAR\n" + 
							"	input:ARRAY 1 OF INTEGER;\n" +
							"	i: INTEGER;" +
							"PROCEDURE Assign(VAR array: ARRAY 1 OF INTEGER);\n" + 
							"  BEGIN\n" + 
							"    array[0] := 10;\n" + 
							"  END Assign;\n" + 
							"BEGIN\n" + 
							"	input[0] := 5;\n" +
							"	Assign(input);\n" +
							"	i := input[0];\n" +
							"END Bla.","i",10);
	}

	@Test
	public void test_procedureWithComplicatedReferencedParameters2() throws RecognitionException
	{
		//When we pass by value the x value should stay the same after the method call. 
		evaluateAssignment(	"MODULE Bla;\n" + 
							"CONST\n" + 
							"	CONSTANT_ONE = 10;\n" + 
							"VAR\n" + 
							"	a, b, c:INTEGER;\n" + 
							"PROCEDURE Swap(VAR x, y, t: INTEGER);\n" + 
							"  VAR\n" + 
							"    temp: INTEGER;\n" + 
							"  BEGIN\n" + 
							"  IF t > 0 THEN \n" +
							"    temp := x;\n" + 
							"    x := y;\n" + 
							"    y := temp;\n" +
							"    t := t - 1;\n" +
							"  	 Swap(x,y,t)" +
							"  END " +
							"  END Swap;\n" + 
							"BEGIN\n" + 
							"	a := 0;\n" +
							"	b := 10;\n" + 
							"	c := 2;\n" + 
							"	Swap(a,b,c);\n" +
							"	WriteLn(a);\n" +
							"	WriteLn(b);\n" +
							"	WriteLn(c);\n" +
							"END Bla.","x",0);
	}

	
	@Test
	public void test_procedureWithNormalParameters() throws RecognitionException
	{
		//When we pass by value the x value should stay the same after the method call. 
		evaluateAssignment(	"MODULE Bla;\n" + 
							"CONST\n" + 
							"	CONSTANT_ONE = 10;\n" + 
							"VAR\n" + 
							"	a, b:INTEGER;\n" + 
							"PROCEDURE Swap(x, y: INTEGER);\n" + 
							"  VAR\n" + 
							"    temp: INTEGER;\n" + 
							"  BEGIN\n" + 
							"    temp := x;\n" + 
							"    x := y;\n" + 
							"    y := temp;\n" +
							"  END Swap;\n" + 
							"BEGIN\n" + 
							"	a := 0;\n" +
							"	b := 10;\n" + 
							"	Swap(a,b);\n" +
							"END Bla.","a",0);
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
			Program program= walker.program();
			program.start();
			
			Identifier ident = new Identifier(identifier);
			
			IntegerExpression endValue = (IntegerExpression) program.getModule().getValueForIdentifier(ident);
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
