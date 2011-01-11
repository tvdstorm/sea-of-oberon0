package randy.interpreter;

import randy.exception.Oberon0Exception;

public interface IOberon0BuildinFunctions
{
	public String read() throws Oberon0Exception;
	public void write(String value) throws Oberon0Exception;
	public void writeLn() throws Oberon0Exception;
}
