package randy.oberon0.interpreter.buildinfunctions;

import randy.oberon0.exception.DuplicateFunctionException;
import randy.oberon0.interpreter.runtime.FunctionRegistry;
import randy.oberon0.interpreter.runtime.RuntimeEnvironment;

public class BuildinFunctions implements IBuildinFunctions
{
	private DefaultReadFunction read;
	private DefaultWriteFunction write;
	private DefaultWriteLnFunction writeLn;
	
	public BuildinFunctions()
	{
		read = new DefaultReadFunction();
		write = new DefaultWriteFunction();
		writeLn = new DefaultWriteLnFunction();
	}
	@Override
	public void register(FunctionRegistry functionRegistry, RuntimeEnvironment environment) throws DuplicateFunctionException
	{
		functionRegistry.registerFunction(read.getName(), read, environment);
		functionRegistry.registerFunction(write.getName(), write, environment);
		functionRegistry.registerFunction(writeLn.getName(), writeLn, environment);
	}
}
