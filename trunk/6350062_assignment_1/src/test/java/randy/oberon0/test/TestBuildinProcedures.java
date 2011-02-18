package randy.oberon0.test;

import java.util.*;
import org.junit.Ignore;
import randy.oberon0.exception.RuntimeException;
import randy.oberon0.interpreter.buildinprocedures.*;
import randy.oberon0.interpreter.runtime.environment.*;

@Ignore
public class TestBuildinProcedures implements IBuildinProcedures
{
	private Queue<String> input;
	private Queue<String> output;
	private TestReadProcedure read;
	private TestWriteProcedure write;
	private TestWriteLnProcedure writeLn;
		
	public TestBuildinProcedures()
	{
		input = new LinkedList<String>();
		output = new LinkedList<String>();
		read = new TestReadProcedure(input);
		write = new TestWriteProcedure(output);
		writeLn = new TestWriteLnProcedure(output);
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
	public void register(RuntimeEnvironment environment) throws RuntimeException
	{
		environment.registerProcedure(read.getName(), read);
		environment.registerProcedure(write.getName(), write);
		environment.registerProcedure(writeLn.getName(), writeLn);
	}
}
