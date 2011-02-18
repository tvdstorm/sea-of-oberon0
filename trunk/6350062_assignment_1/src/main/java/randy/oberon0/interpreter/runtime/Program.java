package randy.oberon0.interpreter.runtime;

import java.util.LinkedList;
import randy.oberon0.interpreter.antlr.Oberon0ASTTreeGenerator;
import randy.oberon0.interpreter.buildinfunctions.*;
import randy.oberon0.interpreter.runtime.environment.IValue;
import randy.oberon0.value.Type;
import randy.oberon0.ast.module.Module;
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
		// Create a global environment
		RuntimeEnvironment globalEnvironment = new RuntimeEnvironment();
		
		// Registrate buildin primitive types
		globalEnvironment.registerType(Type.INTEGER.getTypeText(), new PrimitiveVariableInstantiation(Type.INTEGER));
		globalEnvironment.registerType(Type.BOOLEAN.getTypeText(), new PrimitiveVariableInstantiation(Type.BOOLEAN));
		
		// Registrate buildin functions
		buildinFunctions.register(globalEnvironment);
		
		// Create a module environment on top of the global environment
		RuntimeEnvironment moduleEnvironment = new RuntimeEnvironment(globalEnvironment);
	
		// Registrate the modules type declarations in the modole environment
		module.registerTypeDeclarations(moduleEnvironment);
		// Invoke the module
		module.invoke(moduleEnvironment, (new LinkedList<IValue>()).iterator());
	}
	public void setBuildinFunctions(IBuildinFunctions _buildinFunctions)
	{
		buildinFunctions = _buildinFunctions;
	}
}
