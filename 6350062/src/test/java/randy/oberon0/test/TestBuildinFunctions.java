package randy.oberon0.test;

import java.util.*;
import org.junit.Ignore;
import randy.oberon0.exception.*;
import randy.oberon0.interpreter.buildinfunctions.*;
import randy.oberon0.interpreter.runtime.FunctionRegistry;

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
	@Override
	public void register(FunctionRegistry functionRegistry) throws Oberon0Exception
	{
		functionRegistry.addFunction(read.getName(), read, 0);
		functionRegistry.addFunction(write.getName(), write, 0);
		functionRegistry.addFunction(writeLn.getName(), writeLn, 0);
		functionRegistry.addFunction(newFunction.getName(), newFunction, 0);
	}
}
