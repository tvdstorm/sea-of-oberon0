package randy.oberon0.ast.statement;

import java.util.*;
import randy.oberon0.ast.datastructures.IfExpressionAndBody;
import randy.oberon0.exception.RuntimeException;
import randy.oberon0.exception.TypeCheckException;
import randy.oberon0.interpreter.runtime.environment.*;
import randy.oberon0.interpreter.typecheck.environment.*;
import randy.oberon0.value.Boolean;

public class IfStatement extends Statement
{
	private final List<IfExpressionAndBody> ifStatements;
	private final Block elseBody; // Can be null if there isn't a else part
	
	public IfStatement(List<IfExpressionAndBody> _ifStatements, Block _elseBody)
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
		for (IfExpressionAndBody curIf : ifStatements)
		{
			// Evaluate the condition and convert it to an boolean
			final Boolean conditionResult = (Boolean)curIf.getExpression().evaluate(environment).getValue();
			// Check if the condition is true
			if (conditionResult.getBoolValue())
			{
				// Run the associated body
				curIf.getBody().run(environment);
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
	public void typeCheck(TypeCheckEnvironment environment) throws TypeCheckException
	{
		assert(environment != null);
		// Loop through all if expressions until one is true
		for (IfExpressionAndBody curIf : ifStatements)
		{
			// Type check the condition and convert it to an boolean
			curIf.getExpression().typeCheck(environment).mustBe(TypeCheckType.BOOLEAN);
			// Type check the associated body
			curIf.getBody().typeCheck(environment);
		}
		// No conditions evaluated to true, if there is an else body, run it
		if (elseBody != null)
		{
			elseBody.typeCheck(environment);
		}
	}
}
