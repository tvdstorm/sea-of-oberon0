package randy.ast;

import java.util.*;
import randy.ast.visitor.OASTNodeVisitor;
import randy.exception.*;
import randy.interpreter.preprocess.TypeRegistry;
import randy.interpreter.runtime.Oberon0VariableStack;
import randy.value.*;

public class OProcedureCall extends OExpression
{
	private String name;
	private List<OExpression> parameters;
	private OInvokableFunction functionDeclaration;
	
	public OProcedureCall(String _name, List<OExpression> _parameters)
	{
		assert(_name != null);
		assert(_parameters != null);
		name = _name;
		parameters = _parameters;
		functionDeclaration = null;
	}
	public String getName()
	{
		assert(name != null);
		return name;
	}
	public void setFunctionDeclaration(OInvokableFunction _functionDeclaration)
	{
		assert(_functionDeclaration != null);
		functionDeclaration = _functionDeclaration;
	}
	@Override
	public OValue run(Oberon0VariableStack vars, TypeRegistry typeRegistry) throws Oberon0RuntimeException
	{
		assert(functionDeclaration != null);
		assert(parameters != null);
		// Evaluate all the parameters
		Queue<OValue> params = new LinkedList<OValue>();
		for (OExpression p : parameters)
		{
			OValue v = p.run(vars, typeRegistry);
			params.add(v);
		}
		// Invoke the function
		return functionDeclaration.invoke(vars, params, typeRegistry);
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
