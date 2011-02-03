package randy.oberon0.interpreter.runtime;

import java.util.LinkedList;
import randy.oberon0.interpreter.antlr.Oberon0ASTTreeGenerator;
import randy.oberon0.interpreter.buildinfunctions.*;
import randy.oberon0.value.Type;
import randy.oberon0.value.Value;
import randy.oberon0.ast.*;
import randy.oberon0.exception.RuntimeException;
import randy.oberon0.exception.Exception;

public class Program
{
	private Module module;
	private IBuildinFunctions buildinFunctions;
	
	public Program()
	{
		module = null;
		buildinFunctions = new BuildinFunctions();
	}
	public boolean loadProgram(String filename, IBuildinFunctions _buildinFunctions) throws Exception
	{
		buildinFunctions = _buildinFunctions;
		
		Oberon0ASTTreeGenerator generator = new Oberon0ASTTreeGenerator();
		module = generator.buildASTTreeFromFile(filename);
		
		return true;
	}
	public void run() throws RuntimeException
	{
		TypeRegistry typeRegistry = new TypeRegistry(null);
		// Registrate buildin primitive types
		typeRegistry.addType(Type.INTEGER.getTypeText(), new PrimitiveVariableInstantiation(Type.INTEGER));
		typeRegistry.addType(Type.BOOLEAN.getTypeText(), new PrimitiveVariableInstantiation(Type.BOOLEAN));
		
		FunctionRegistry functionRegistry = new FunctionRegistry(null);
		// Registrate buildin functions
		buildinFunctions.register(functionRegistry);
		
		RuntimeEnvironment environment = new RuntimeEnvironment(new VariableStack(null), functionRegistry, typeRegistry, null);
		RuntimeEnvironment moduleEnvironment = environment.createRuntimeEnviroment(0);
		
		module.runTypeDeclarations(moduleEnvironment);
		module.invoke(moduleEnvironment, new LinkedList<Value>());
	}
	public void setBuildinFunctions(IBuildinFunctions _buildinFunctions)
	{
		buildinFunctions = _buildinFunctions;
	}
}
