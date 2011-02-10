package randy.oberon0.ast.statement;

import randy.oberon0.ast.expression.Expression;
import randy.oberon0.ast.selector.Selector;
import randy.oberon0.exception.RuntimeException;
import randy.oberon0.interpreter.runtime.environment.*;
import randy.oberon0.interpreter.typecheck.environment.*;

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
		Reference var = variable.evaluate(environment);
		assert(var != null);
		// Evaluate the expression and assign the result as the value of the variable
		var.setValue(expression.evaluate(environment).getValue());
	}
	@Override
	public void typeCheck(TypeCheckEnvironment environment) throws RuntimeException
	{
		assert(environment != null);
		// Evaluate the variable
		TypeCheckReference var = variable.typeCheck(environment);
		assert(var != null);
		// Evaluate the expression and see if we can assign the result as the value of the variable
		ITypeCheckType expressionValue = expression.typeCheck(environment).getValue();
		expressionValue.mustBe(var.getValue());
		var.setValue(expressionValue);
	}
}
