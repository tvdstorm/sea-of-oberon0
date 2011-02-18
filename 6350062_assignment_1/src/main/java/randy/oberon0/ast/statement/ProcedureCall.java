package randy.oberon0.ast.statement;

import java.util.*;
import randy.oberon0.interpreter.runtime.IInvokableProcedure;
import randy.oberon0.ast.expression.Expression;
import randy.oberon0.exception.RuntimeException;
import randy.oberon0.interpreter.runtime.environment.*;

public class ProcedureCall extends Statement
{
	private final String procedureName;
	private final List<Expression> parameterExpressions;
	
	public ProcedureCall(String _procedureName, List<Expression> _parameterExpressions)
	{
		assert(_procedureName != null);
		assert(_parameterExpressions != null);
		procedureName = _procedureName;
		parameterExpressions = _parameterExpressions;
	}
	@Override
	public void run(RuntimeEnvironment environment) throws RuntimeException
	{
		assert(environment != null);
		// Evaluate all the parameters and add them to a queue
		List<IBindableValue> parameters = new LinkedList<IBindableValue>();
		for (Expression parameter : parameterExpressions)
		{
			IBindableValue v = parameter.evaluate(environment);
			parameters.add(v);
		}
		// Resolve the procedure name to a procedure
		Closure closure = (Closure)environment.lookup(procedureName);
		final IInvokableProcedure procedureDeclaration = closure.getProcedure();
		// Create a new environment for the to be invoked procedure
		RuntimeEnvironment invokedEnvironment = new RuntimeEnvironment(closure.getEnvironment());
		// Register all declarations of the to be invoked procedure to it's environment 
		procedureDeclaration.registerTypeDeclarations(invokedEnvironment);
		// Invoke the procedure
		procedureDeclaration.invoke(invokedEnvironment, parameters.iterator());
	}
}
