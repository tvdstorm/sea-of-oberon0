package randy.oberon0.test;

import java.util.*;
import org.junit.Ignore;
import randy.oberon0.exception.DuplicateFunctionException;
import randy.oberon0.interpreter.buildinfunctions.*;
import randy.oberon0.interpreter.runtime.environment.*;

@Ignore
public class TestBuildinFunctions implements IBuildinFunctions
{
	private Queue<String> input;
	private Queue<String> output;
	private TestReadFunction read;
	private TestWriteFunction write;
	private TestWriteLnFunction writeLn;
		
	public TestBuildinFunctions()
	{
		input = new LinkedList<String>();
		output = new LinkedList<String>();
		read = new TestReadFunction(input);
		write = new TestWriteFunction(output);
		writeLn = new TestWriteLnFunction(output);
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
	public void register(RuntimeEnvironment environment) throws DuplicateFunctionException
	{
		environment.registerFunction(read.getName(), read);
		environment.registerFunction(write.getName(), write);
		environment.registerFunction(writeLn.getName(), writeLn);
	}
}
