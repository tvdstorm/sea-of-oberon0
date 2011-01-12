package randy.interpreter;

import java.util.Random;
import randy.exception.Oberon0Exception;

public class Oberon0BuildinFunctions implements IOberon0BuildinFunctions
{
	private Random random;
	
	public Oberon0BuildinFunctions()
	{
		random = new Random();
	}	
	@Override
	public String read() throws Oberon0Exception
	{
		String val = "" + random.nextInt(1000);
		System.out.println("Read() <-- " + val);
		return val;
	}
	@Override
	public void write(String value) throws Oberon0Exception
	{
		System.out.println("Write() --> " + value);
		System.out.println(value);		
	}
	@Override
	public void writeLn() throws Oberon0Exception
	{
		System.out.println("");
	}
}
