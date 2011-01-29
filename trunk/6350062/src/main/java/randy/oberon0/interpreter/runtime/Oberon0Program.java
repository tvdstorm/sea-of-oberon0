package randy.oberon0.interpreter.runtime;

import randy.oberon0.interpreter.antlr.Oberon0ASTTreeGenerator;
import randy.oberon0.interpreter.buildinfunctions.*;
import randy.oberon0.interpreter.preprocess.*;
import randy.oberon0.value.Type;
import randy.oberon0.ast.*;
import randy.oberon0.exception.*;

public class Oberon0Program
{
	private OASTNode astTree;
	private IOberon0BuildinFunctions buildinFunctions;
	private TypeRegistry typeRegistry;
	
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
		
		typeRegistry = new TypeRegistry(null);
		// Registrate buildin primitive types
		typeRegistry.addType(Type.INTEGER.getTypeText(), new OPrimitiveVariableInstantiation(Type.INTEGER));
		typeRegistry.addType(Type.BOOLEAN.getTypeText(), new OPrimitiveVariableInstantiation(Type.BOOLEAN));
		
		return true;
	}
	public void run() throws Oberon0RuntimeException
	{
		Oberon0VariableStack vars = new Oberon0VariableStack(null);
		astTree.run(vars, typeRegistry);
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
