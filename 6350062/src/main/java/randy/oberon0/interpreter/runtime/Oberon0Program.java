package randy.oberon0.interpreter.runtime;

import randy.oberon0.interpreter.antlr.Oberon0ASTTreeGenerator;
import randy.oberon0.interpreter.buildinfunctions.*;
import randy.oberon0.value.Type;
import randy.oberon0.ast.*;
import randy.oberon0.exception.*;

public class Oberon0Program
{
	private OASTNode astTree;
	private IOberon0BuildinFunctions buildinFunctions;
	
	public Oberon0Program()
	{
		astTree = null;
		buildinFunctions = new Oberon0BuildinFunctions();
	}
	public boolean loadProgram(String filename, IOberon0BuildinFunctions _buildinFunctions) throws Oberon0Exception
	{
		buildinFunctions = _buildinFunctions;
		
		Oberon0ASTTreeGenerator generator = new Oberon0ASTTreeGenerator();
		astTree = generator.generate(filename);
		
		return true;
	}
	public void run() throws Oberon0Exception // TODO: moet runtime exception worden
	{
		TypeRegistry typeRegistry = new TypeRegistry(null);
		// Registrate buildin primitive types
		typeRegistry.addType(Type.INTEGER.getTypeText(), new OPrimitiveVariableInstantiation(Type.INTEGER));
		typeRegistry.addType(Type.BOOLEAN.getTypeText(), new OPrimitiveVariableInstantiation(Type.BOOLEAN));
		
		FunctionRegistry functionRegistry = new FunctionRegistry(null);
		// Registrate buildin functions
		buildinFunctions.register(functionRegistry);
		
		RuntimeEnvironment environment = new RuntimeEnvironment(new VariableStack(null), functionRegistry, typeRegistry, null);
		
		astTree.run(environment);
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
