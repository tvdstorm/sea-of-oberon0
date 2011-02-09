package randy.oberon0.ast.statement;

import java.util.*;
import randy.oberon0.ast.IInvokableFunction;
import randy.oberon0.ast.expression.Expression;
import randy.oberon0.exception.RuntimeException;
import randy.oberon0.interpreter.runtime.environment.*;
import randy.oberon0.interpreter.runtime.environment.Closure;
import randy.oberon0.interpreter.runtime.environment.IBindableValue;
import randy.oberon0.interpreter.typecheck.*;

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
		// Resolve the function name to a function
		Closure closure = (Closure)environment.lookup(procedureName);
		final IInvokableFunction functionDeclaration = closure.getFunction();
		// Create a new environment for the to be invoked function
		RuntimeEnvironment invokedEnvironment = new RuntimeEnvironment(closure.getEnvironment());
		// Register all declarations of the to be invoked function to it's environment 
		functionDeclaration.registerTypeDeclarations(invokedEnvironment);
		// Invoke the function
		functionDeclaration.invoke(invokedEnvironment, parameters.iterator());
	}
	@Override
	public void typeCheck(TypeCheckEnvironment environment) throws RuntimeException
	{
		assert(environment != null);
		// Evaluate all the parameters and add them to a queue
		List<ITypeCheckBindableValue> parameters = new LinkedList<ITypeCheckBindableValue>();
		for (Expression parameter : parameterExpressions)
		{
			ITypeCheckBindableValue v = parameter.typeCheck(environment);
			parameters.add(v);
		}
		// Resolve the function name to a function
		TypeCheckClosure closure = (TypeCheckClosure)environment.lookup(procedureName);
		final IInvokableFunction functionDeclaration = closure.getProcedure();
		// Create a new environment for the to be invoked function
		TypeCheckEnvironment invokedEnvironment = new TypeCheckEnvironment(closure.getEnvironment());
		// Register all declarations of the to be invoked function to it's environment 
		functionDeclaration.typeCheckRegisterTypeDeclarations(invokedEnvironment);
		// Invoke the function
		functionDeclaration.typeCheckInvoke(invokedEnvironment, parameters.iterator());
	}
}
