package randy.oberon0.ast;

import randy.oberon0.exception.RuntimeException;
import randy.oberon0.interpreter.runtime.RuntimeEnvironment;
import randy.oberon0.value.Value;

public class AssignmentStatement extends Statement
{
	private Selector lhs;
	private Expression rhs;
	
	public AssignmentStatement(Selector _lhs, Expression _rhs)
	{
		assert(_lhs != null);
		assert(_rhs != null);
		lhs = _lhs;
		rhs = _rhs;
	}
	@Override
	public Value run(RuntimeEnvironment environment) throws RuntimeException
	{
		assert(environment != null);
		// Evaluate the left hand side and right hand side and assign the value of the right hand side to the left hand side
		Value var = lhs.run(environment);
		assert(var != null);
		var.setValue(rhs.run(environment));
		return null;
	}
}
