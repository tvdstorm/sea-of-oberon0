package randy.oberon0.ast;

import randy.oberon0.exception.RuntimeException;
import randy.oberon0.interpreter.runtime.RuntimeEnvironment;
import randy.oberon0.value.Value;

public class AssignmentStatement extends Statement
{
	private final Selector variable;
	private final Expression expression;
	
	public AssignmentStatement(Selector _variable, Expression _expression)
	{
		assert(_variable != null);
		assert(_expression != null);
		variable = _variable;
		expression = _expression;
	}
	@Override
	public void run(RuntimeEnvironment environment) throws RuntimeException
	{
		assert(environment != null);
		// Evaluate the variable
		Value var = variable.evaluate(environment);
		assert(var != null);
		// Evaluate the expression and assign the result as the value of the variable
		var.setValue(expression.evaluate(environment));
	}
	@Override
	public void typeCheck(RuntimeEnvironment environment) throws RuntimeException
	{
		assert(environment != null);
		// Evaluate the variable
		Value var = variable.typeCheck(environment);
		assert(var != null);
		// Evaluate the expression and see if we can assign the result as the value of the variable
		var.setValue(expression.typeCheck(environment));
	}
}
