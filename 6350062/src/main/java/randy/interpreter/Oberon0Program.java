package randy.interpreter;

import java.io.IOException;
import org.antlr.runtime.*;
import org.antlr.runtime.tree.Tree;
import randy.generated.*;
import randy.generated.Oberon0Parser.*;
import randy.ast.OASTNode;
import randy.exception.*;

public class Oberon0Program
{
	private OASTNode astTree;
	private IOberon0BuildinFunctions buildinFunctions;
	
	public Oberon0Program()
	{
		astTree = null;
		buildinFunctions = new Oberon0BuildinFunctions();
	}
	public boolean loadProgram(String filename, IOberon0BuildinFunctions buildinFunctions) throws Oberon0Exception
	{
		Oberon0Lexer lexer = null;
		try
		{
			// Put the file through the lexer
			lexer = new Oberon0Lexer(new ANTLRFileStream(filename));
		}
		catch (IOException e)
		{
			throw new Oberon0ASTTreeBuildException("Problem reading or lexing file: " + e.getMessage());
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
			throw new Oberon0ASTTreeBuildException("Problem parsing file: " + e.getMessage());
		}
		
		astTree = OASTNode.buildASTTree((Tree)parserOutput.getTree());
		
		FunctionTreeBuilder ftb = new FunctionTreeBuilder();
		buildinFunctions.register(ftb);
		astTree.accept(ftb);
		ftb.resolveAllFunctionCalls();
		return true;
	}
	public void run() throws Oberon0RuntimeException
	{
		Oberon0VariableStack vars = new Oberon0VariableStack(null);
		astTree.run(vars);
	}
	public void setBuildinFunctions(IOberon0BuildinFunctions _buildinFunctions)
	{
		buildinFunctions = _buildinFunctions;
	}
	public IOberon0BuildinFunctions getBuildinFunctions()
	{
		return buildinFunctions;
	}
}
