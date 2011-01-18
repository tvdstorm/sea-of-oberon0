package randy.interpreter;

import randy.exception.Oberon0Exception;

public class Oberon0BuildinFunctions implements IOberon0BuildinFunctions
{
	private Oberon0DefaultReadFunction read;
	private Oberon0DefaultWriteFunction write;
	private Oberon0DefaultWriteLnFunction writeLn;
	
	public Oberon0BuildinFunctions()
	{
		read = new Oberon0DefaultReadFunction();
		write = new Oberon0DefaultWriteFunction();
		writeLn = new Oberon0DefaultWriteLnFunction();
	}
	@Override
	public void register(FunctionTreeBuilder ftb) throws Oberon0Exception
	{
		ftb.register(read);
		ftb.register(write);
		ftb.register(writeLn);
	}
}
