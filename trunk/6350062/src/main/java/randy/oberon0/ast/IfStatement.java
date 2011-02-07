package randy.oberon0.ast;

import java.util.*;
import randy.library.datastructures.Tuple;
import randy.oberon0.exception.RuntimeException;
import randy.oberon0.interpreter.runtime.RuntimeEnvironment;
import randy.oberon0.value.Boolean;

public class IfStatement extends Statement
{
	private final List<Tuple<Expression, Block>> ifStatements; // <condition, body>
	private final Block elseBody; // Can be null if there isn't a else part
	
	public IfStatement(List<Tuple<Expression, Block>> _ifStatements, Block _elseBody)
	{
		assert(_ifStatements != null);
		ifStatements = _ifStatements;
		elseBody = _elseBody;
	}
	@Override
	public void run(RuntimeEnvironment environment) throws RuntimeException
	{
		assert(environment != null);
		// Loop through all if expressions until one is true
		for (Tuple<Expression, Block> curIf : ifStatements)
		{
			// Evaluate the condition and convert it to an boolean
			final Boolean conditionResult = curIf.getFirst().evaluate(environment).castToBoolean();
			// Check if the condition is true
			if (conditionResult.getBoolValue())
			{
				// Run the associated body
				curIf.getSecond().run(environment);
				return;
			}
		}
		// No conditions evaluated to true, if there is an else body, run it
		if (elseBody != null)
		{
			elseBody.run(environment);
		}
	}
	@Override
	public void typeCheck(RuntimeEnvironment environment) throws RuntimeException
	{
		assert(environment != null);
		// Loop through all if expressions until one is true
		for (Tuple<Expression, Block> curIf : ifStatements)
		{
			// Type check the condition and convert it to an boolean
			curIf.getFirst().typeCheck(environment).castToBoolean();
			// Type check the associated body
			curIf.getSecond().typeCheck(environment);
		}
		// No conditions evaluated to true, if there is an else body, run it
		if (elseBody != null)
		{
			elseBody.typeCheck(environment);
		}
	}
}
