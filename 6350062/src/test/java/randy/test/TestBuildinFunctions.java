package randy.test;

import java.util.*;
import org.junit.Ignore;
import randy.exception.*;
import randy.interpreter.IOberon0BuildinFunctions;

@Ignore
public class TestBuildinFunctions implements IOberon0BuildinFunctions
{
	private Queue<String> input;
	private Queue<String> output;
	
	public TestBuildinFunctions()
	{
		input = new LinkedList<String>();
		output = new LinkedList<String>();
	}
	@Override
	public String read() throws Oberon0RuntimeException
	{
		String v = input.poll();
		if (v != null)
			return v;
		throw new Oberon0IOErrorException("Input stack is empty...");
	}
	@Override
	public void write(String value) throws Oberon0RuntimeException
	{
		output.add(value);
	}
	@Override
	public void writeLn() throws Oberon0RuntimeException
	{
		output.add("\r\n");
	}
	public void addInput(String value)
	{
		input.add(value);
	}
	public String popOutput()
	{
		return output.poll();
	}
	public boolean outputIsEmpty()
	{
		return output.isEmpty();
	}
}
