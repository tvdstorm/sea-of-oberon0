package randy.test;

import java.util.*;
import org.junit.Ignore;
import randy.exception.*;
import randy.interpreter.buildinfunctions.IOberon0BuildinFunctions;
import randy.interpreter.buildinfunctions.Oberon0DefaultNEWFunction;
import randy.interpreter.preprocess.FunctionTreeBuilder;

@Ignore
public class TestBuildinFunctions implements IOberon0BuildinFunctions
{
	private Queue<String> input;
	private Queue<String> output;
	private TestReadFunction read;
	private TestWriteFunction write;
	private TestWriteLnFunction writeLn;
	private Oberon0DefaultNEWFunction newFunction;
	
	public TestBuildinFunctions()
	{
		input = new LinkedList<String>();
		output = new LinkedList<String>();
		read = new TestReadFunction(input);
		write = new TestWriteFunction(output);
		writeLn = new TestWriteLnFunction(output);
		newFunction = new Oberon0DefaultNEWFunction();
	}
	public void register(FunctionTreeBuilder ftb) throws Oberon0Exception
	{
		ftb.register(read);
		ftb.register(write);
		ftb.register(writeLn);
		ftb.register(newFunction);
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
