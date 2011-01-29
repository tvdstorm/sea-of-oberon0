package randy.oberon0.ast;

import java.util.*;
import randy.oberon0.ast.visitor.OASTNodeVisitor;
import randy.oberon0.exception.*;
import randy.oberon0.interpreter.runtime.RuntimeEnvironment;
import randy.oberon0.value.*;

public class OProcedureCall extends OExpression
{
	private String name;
	private List<OExpression> parameters;
	
	public OProcedureCall(String _name, List<OExpression> _parameters)
	{
		assert(_name != null);
		assert(_parameters != null);
		name = _name;
		parameters = _parameters;
	}
	@Override
	public OValue run(RuntimeEnvironment environment) throws Oberon0RuntimeException
	{
		assert(environment != null);
		assert(parameters != null);
		// Evaluate all the parameters
		Queue<OValue> params = new LinkedList<OValue>();
		for (OExpression p : parameters)
		{
			OValue v = p.run(environment);
			params.add(v);
		}
		RuntimeEnvironment invokedEnvironment = environment.createRuntimeEnviroment(environment.getDepth()+1);
		OInvokableFunction functionDeclaration = environment.resolveFunction(name).getSecond();
		functionDeclaration.runTypeDeclarations(invokedEnvironment);
		// Invoke the function
		return functionDeclaration.invoke(invokedEnvironment, params);
	}
	@Override
	public void accept(OASTNodeVisitor visitor) throws Oberon0Exception
	{
		visitor.visitBefore(this);
		visitor.visit(this);
		for (OExpression p : parameters)
		{
			p.accept(visitor);
		}
		visitor.visitAfter(this);
	}
}
