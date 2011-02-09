package randy.oberon0.interpreter.buildinfunctions;

import randy.oberon0.exception.DuplicateFunctionException;
import randy.oberon0.interpreter.runtime.environment.*;
import randy.oberon0.interpreter.typecheck.environment.TypeCheckEnvironment;

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
	public void register(RuntimeEnvironment environment) throws DuplicateFunctionException
	{
		environment.registerFunction(read.getName(), read);
		environment.registerFunction(write.getName(), write);
		environment.registerFunction(writeLn.getName(), writeLn);
	}
	@Override
	public void typeCheckRegister(TypeCheckEnvironment environment) throws DuplicateFunctionException
	{
		environment.registerFunction(read.getName(), read);
		environment.registerFunction(write.getName(), write);
		environment.registerFunction(writeLn.getName(), writeLn);
	}
}
