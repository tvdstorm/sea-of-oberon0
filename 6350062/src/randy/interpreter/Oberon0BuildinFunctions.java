package randy.interpreter;

import randy.exception.Oberon0Exception;

public class Oberon0BuildinFunctions implements IOberon0BuildinFunctions
{
	private int curNumber;
	public Oberon0BuildinFunctions()
	{
		curNumber = 10;
	}	
	@Override
	public String read() throws Oberon0Exception
	{
		return "" + (curNumber++);
	}
	@Override
	public void write(String value) throws Oberon0Exception
	{
		System.out.println(value);		
	}
	@Override
	public void writeLn() throws Oberon0Exception
	{
		System.out.println("");
	}
}
