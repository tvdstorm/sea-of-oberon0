package randy.ast;

import java.util.*;
import org.antlr.runtime.tree.Tree;
import randy.exception.*;
import randy.generated.Oberon0Parser;
import randy.interpreter.*;
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
	public static OProcedureCall buildProcedureCall(Tree tree) throws Oberon0Exception
	{
		assert(tree.getType() == Oberon0Parser.PROCEDURECALL);
		assert(tree.getChildCount() >= 2);
		String name = tree.getChild(0).getText();
		List<OExpression> parameters = new Vector<OExpression>();
		// TODO: PARAMETERS verwijderen of anders opbouwen
		if (tree.getChildCount() >= 2 && tree.getChild(1).getType() == Oberon0Parser.PARAMETERS)
		{
			for (int i=0;i<tree.getChild(1).getChildCount();i++)
			{
				parameters.add(OExpression.buildExpression(tree.getChild(1).getChild(i)));
			}
		}
		return new OProcedureCall(name, parameters);
	}
	@Override
	public OValue run(Oberon0VariableStack vars) throws Oberon0RuntimeException
	{
		assert(functionDeclaration != null);
		assert(parameters != null);
		// Evaluate all the parameters
		Queue<OValue> params = new LinkedList<OValue>();
		for (OExpression p : parameters)
		{
			OValue v = p.run(vars);
			params.add(v);
		}
		// Invoke the function
		return functionDeclaration.invoke(vars, params);
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
