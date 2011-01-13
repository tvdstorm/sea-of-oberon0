package randy.interpreter;

import randy.exception.Oberon0RuntimeException;

public interface IOberon0BuildinFunctions
{
	public String read() throws Oberon0RuntimeException;
	public void write(String value) throws Oberon0RuntimeException;
	public void writeLn() throws Oberon0RuntimeException;
}
