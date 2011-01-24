package randy.interpreter;

import randy.interpreter.antlr.Oberon0ASTTreeGenerator;
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
		Oberon0ASTTreeGenerator generator = new Oberon0ASTTreeGenerator();
		astTree = generator.generate(filename);
		
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
