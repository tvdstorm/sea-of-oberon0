package randy.interpreter;

import randy.exception.Oberon0RuntimeException;

public interface IOberon0BuildinFunctions
{
	// TODO: build in functions toevoegen aan minterne oberon0 functie tree zodat deze geshadowed kunnen worden
	public String read() throws Oberon0RuntimeException;
	public void write(String value) throws Oberon0RuntimeException;
	public void writeLn() throws Oberon0RuntimeException;
}
