package randy.interpreter;

import java.io.IOException;
import org.antlr.runtime.*;
import org.antlr.runtime.tree.Tree;
import com.sun.org.apache.xpath.internal.VariableStack;
import randy.generated.*;
import randy.generated.Oberon0Parser.*;
import randy.ast.OASTNode;
import randy.ast.OExpression;
import randy.exception.*;

public class Oberon0Program
{
	private OASTNode astTree;
	public Oberon0Program()
	{
		astTree = null;
	}
	public boolean loadProgram(String filename) throws Oberon0Exception
	{
		Oberon0Lexer lexer = null;
		try
		{
			// Put the file through the lexer
			lexer = new Oberon0Lexer(new ANTLRFileStream(filename));
		}
		catch (IOException e)
		{
			throw new Oberon0Exception("Problem reading or lexing file: " + e.getMessage());
		}
		CommonTokenStream tokens = new CommonTokenStream();
		tokens.setTokenSource(lexer);
		
		// Parse the program
		Oberon0Parser parser = new Oberon0Parser(tokens);
		module_return parserOutput = null;
		try
		{
			parserOutput = parser.module();
		}
		catch (RecognitionException e)
		{
			throw new Oberon0Exception("Problem parsing file: " + e.getMessage());
		}
		
		randy.main.Main.printTree((Tree)parserOutput.getTree(), "");
		
		astTree = OASTNode.buildASTTree((Tree)parserOutput.getTree());
		
		//System.out.println("Output: " + ((OExpression)astTree).run());
		astTree.print("");
		System.out.println("++++++++++++++++++++++++");
		Oberon0VariableStack vars = new Oberon0VariableStack(null);
		astTree.run(vars);
		
		return true;
	}
}
