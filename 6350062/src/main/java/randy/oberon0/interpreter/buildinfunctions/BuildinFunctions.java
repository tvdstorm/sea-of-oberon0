package randy.oberon0.interpreter.buildinfunctions;

import randy.oberon0.exception.DuplicateFunctionException;
import randy.oberon0.interpreter.runtime.FunctionRegistry;

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
	public void register(FunctionRegistry functionRegistry) throws DuplicateFunctionException
	{
		functionRegistry.registerFunction(read.getName(), read, 0);
		functionRegistry.registerFunction(write.getName(), write, 0);
		functionRegistry.registerFunction(writeLn.getName(), writeLn, 0);
	}
}
