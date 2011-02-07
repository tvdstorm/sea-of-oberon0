package randy.oberon0.ast;

import java.util.*;
import randy.oberon0.exception.RuntimeException;
import randy.oberon0.interpreter.runtime.RuntimeEnvironment;

public class Block extends Statement
{
	private final List<Statement> statements;
	
	public Block(List<Statement> _statements)
	{
		assert(_statements != null);
		statements = _statements;
	}
	@Override
	public void run(RuntimeEnvironment environment) throws RuntimeException
	{
		assert(environment != null);
		// Loop through all statements and run them
		for (Statement st : statements)
		{
			st.run(environment);
		}
	}
	@Override
	public void typeCheck(RuntimeEnvironment environment) throws RuntimeException
	{
		assert(environment != null);
		// Loop through all statements and type check them
		for (Statement st : statements)
		{
			st.typeCheck(environment);
		}
	}
}
