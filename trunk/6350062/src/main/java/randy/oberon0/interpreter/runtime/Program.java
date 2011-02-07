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
	public void loadProgram(String filename, IBuildinFunctions _buildinFunctions) throws Exception
	{
		buildinFunctions = _buildinFunctions;

		// Build the AST tree from a oberon 0 script
		Oberon0ASTTreeGenerator generator = new Oberon0ASTTreeGenerator();
		module = generator.buildASTTreeFromFile(filename);
	}
	public void run() throws RuntimeException
	{
		// Registrate buildin primitive types
		TypeRegistry typeRegistry = new TypeRegistry(null);
		typeRegistry.registerType(Type.INTEGER.getTypeText(), new PrimitiveVariableInstantiation(Type.INTEGER));
		typeRegistry.registerType(Type.BOOLEAN.getTypeText(), new PrimitiveVariableInstantiation(Type.BOOLEAN));
		
		FunctionRegistry functionRegistry = new FunctionRegistry(null);
		
		// Create a global environment
		RuntimeEnvironment globalEnvironment = new RuntimeEnvironment(new VariableStack(null), functionRegistry, typeRegistry);
		// Registrate buildin functions
		buildinFunctions.register(functionRegistry, globalEnvironment);
		
		// Create a module environment on top of the global environment
		RuntimeEnvironment moduleEnvironment = new RuntimeEnvironment(globalEnvironment);
	
		// Registrate the modules type declarations in the modole environment
		module.registerTypeDeclarations(moduleEnvironment);
		// Invoke the module
		module.invoke(moduleEnvironment, new LinkedList<Value>());
	}
	public void typeCheck() throws RuntimeException
	{
		// Registrate buildin primitive types
		TypeRegistry typeRegistry = new TypeRegistry(null);
		typeRegistry.registerType(Type.INTEGER.getTypeText(), new PrimitiveVariableInstantiation(Type.INTEGER));
		typeRegistry.registerType(Type.BOOLEAN.getTypeText(), new PrimitiveVariableInstantiation(Type.BOOLEAN));
		
		FunctionRegistry functionRegistry = new FunctionRegistry(null);
		
		// Create a global environment
		RuntimeEnvironment globalEnvironment = new RuntimeEnvironment(new VariableStack(null), functionRegistry, typeRegistry);
		// Registrate buildin functions
		buildinFunctions.register(functionRegistry, globalEnvironment);
		
		// Create a module environment on top of the global environment
		RuntimeEnvironment moduleEnvironment = new RuntimeEnvironment(globalEnvironment);
	
		// Registrate the modules type declarations in the modole environment
		module.registerTypeDeclarations(moduleEnvironment);
		// Invoke the module
		module.typeCheckInvoke(moduleEnvironment, new LinkedList<Value>());
		// Refresh the module environment and invoke the body
		moduleEnvironment = new RuntimeEnvironment(globalEnvironment);
		module.typeCheckBody(moduleEnvironment);
	}
	public void setBuildinFunctions(IBuildinFunctions _buildinFunctions)
	{
		buildinFunctions = _buildinFunctions;
	}
}
