package randy.interpreter;

import java.util.Random;
import randy.exception.Oberon0RuntimeException;

public class Oberon0BuildinFunctions implements IOberon0BuildinFunctions
{
	private Random random;
	
	public Oberon0BuildinFunctions()
	{
		random = new Random();
	}	
	@Override
	public String read() throws Oberon0RuntimeException
	{
		String val = "" + random.nextInt(1000);
		System.out.println("Read() <-- " + val);
		return val;
	}
	@Override
	public void write(String value) throws Oberon0RuntimeException
	{
		System.out.println("Write() --> " + value);
		System.out.println(value);		
	}
	@Override
	public void writeLn() throws Oberon0RuntimeException
	{
		System.out.println("");
	}
}
