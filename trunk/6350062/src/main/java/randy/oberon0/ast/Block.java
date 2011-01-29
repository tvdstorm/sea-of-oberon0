package randy.oberon0.ast;

import java.util.*;
import randy.oberon0.exception.RuntimeException;
import randy.oberon0.interpreter.runtime.RuntimeEnvironment;
import randy.oberon0.value.Value;

public class Block extends Statement
{
	private List<Statement> statements;
	
	public Block(List<Statement> _statements)
	{
		assert(_statements != null);
		statements = _statements;
	}
	@Override
	public Value run(RuntimeEnvironment environment) throws RuntimeException
	{
		assert(environment != null);
		// Loop through all statements and run them
		for (Statement st : statements)
		{
			st.run(environment);
		}
		return null;
	}
}
