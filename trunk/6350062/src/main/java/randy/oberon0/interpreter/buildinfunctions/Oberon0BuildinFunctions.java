package randy.oberon0.interpreter.buildinfunctions;

import randy.oberon0.exception.Oberon0Exception;
import randy.oberon0.interpreter.preprocess.FunctionTreeBuilder;

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
	public void register(FunctionTreeBuilder ftb) throws Oberon0Exception
	{
		ftb.register(read);
		ftb.register(write);
		ftb.register(writeLn);
		ftb.register(newFunction);
	}
}
