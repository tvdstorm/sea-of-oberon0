package randy.oberon0.interpreter.buildinprocedures;

import randy.oberon0.exception.RuntimeException;
import randy.oberon0.interpreter.runtime.environment.*;

public class BuildinProcedures implements IBuildinProcedures
{
	private DefaultReadProcedure read;
	private DefaultWriteProcedure write;
	private DefaultWriteLnProcedure writeLn;
	
	public BuildinProcedures()
	{
		read = new DefaultReadProcedure();
		write = new DefaultWriteProcedure();
		writeLn = new DefaultWriteLnProcedure();
	}
	@Override
	public void register(RuntimeEnvironment environment) throws RuntimeException
	{
		environment.registerProcedure(read.getName(), read);
		environment.registerProcedure(write.getName(), write);
		environment.registerProcedure(writeLn.getName(), writeLn);
	}
}
