package randy.oberon0.ast;

import java.util.*;
import randy.oberon0.ast.datastructures.Tuple;
import randy.oberon0.exception.RuntimeException;
import randy.oberon0.interpreter.runtime.RuntimeEnvironment;
import randy.oberon0.value.Boolean;
import randy.oberon0.value.Value;

public class IfStatement extends Statement
{
	private List<Tuple<Expression, Block>> ifStatements;
	private Block elseBody;
	
	public IfStatement(List<Tuple<Expression, Block>> _ifStatements, Block _elseBody)
	{
		assert(_ifStatements != null);
		ifStatements = _ifStatements;
		elseBody = _elseBody;
	}
	@Override
	public Value run(RuntimeEnvironment environment) throws RuntimeException
	{
		assert(environment != null);
		// Loop through all if expressions until one is true
		for (Tuple<Expression, Block> curIf : ifStatements)
		{
			// Run the expression and convert it to an boolean
			Boolean bExpression = curIf.getFirst().run(environment).castToBoolean();
			// If the expression is true, run the body
			if (bExpression.getBoolValue())
			{
				curIf.getSecond().run(environment);
				return null;
			}
		}
		// If there is an else body, run it
		if (elseBody != null)
			elseBody.run(environment);
		return null;
	}
}
