package randy.oberon0.ast.statement;

import java.util.*;
import randy.oberon0.exception.RuntimeException;
import randy.oberon0.exception.TypeCheckException;
import randy.oberon0.interpreter.runtime.environment.*;
import randy.oberon0.interpreter.typecheck.environment.TypeCheckEnvironment;

public class Block extends Statement
{
	private final List<Statement> statements;
	
	public Block(List<Statement> _statements)
	{
		assert(_statements != null);
		statements = new ArrayList<Statement>(_statements);
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
	public void typeCheck(TypeCheckEnvironment environment) throws TypeCheckException
	{
		assert(environment != null);
		// Loop through all statements and type check them
		for (Statement st : statements)
		{
			st.typeCheck(environment);
		}
	}
}
