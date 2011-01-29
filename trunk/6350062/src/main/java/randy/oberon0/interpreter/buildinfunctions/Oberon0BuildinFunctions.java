package randy.oberon0.interpreter.buildinfunctions;

import randy.oberon0.exception.Oberon0Exception;
import randy.oberon0.interpreter.runtime.FunctionRegistry;

public class Oberon0BuildinFunctions implements IOberon0BuildinFunctions
{
	private Oberon0DefaultReadFunction read;
	private Oberon0DefaultWriteFunction write;
	private Oberon0DefaultWriteLnFunction writeLn;
	private Oberon0DefaultNEWFunction newFunction;
	
	public Oberon0BuildinFunctions()
	{
		read = new Oberon0DefaultReadFunction();
		write = new Oberon0DefaultWriteFunction();
		writeLn = new Oberon0DefaultWriteLnFunction();
		newFunction = new Oberon0DefaultNEWFunction();
	}
	@Override
	public void register(FunctionRegistry functionRegistry) throws Oberon0Exception
	{
		functionRegistry.addFunction(read.getName(), read, 0);
		functionRegistry.addFunction(write.getName(), write, 0);
		functionRegistry.addFunction(writeLn.getName(), writeLn, 0);
		functionRegistry.addFunction(newFunction.getName(), newFunction, 0);
	}
}
