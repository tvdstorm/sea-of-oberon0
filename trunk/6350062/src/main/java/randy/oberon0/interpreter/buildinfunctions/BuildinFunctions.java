package randy.oberon0.interpreter.buildinfunctions;

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
	public void register(FunctionRegistry functionRegistry)
	{
		functionRegistry.addFunction(read.getName(), read, 0);
		functionRegistry.addFunction(write.getName(), write, 0);
		functionRegistry.addFunction(writeLn.getName(), writeLn, 0);
	}
}