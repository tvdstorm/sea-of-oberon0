package uva.oberon0.abstractsyntax.statements;

import org.antlr.runtime.tree.CommonTree;

import uva.oberon0.runtime.Scope;


/**
 * @author Chiel Labee
 * This class represents the ElsIf part of an If-Then-ElsIf-Else Statement.
*/
public class IfPartForElsIf extends BaseWithCondition 
{
	public IfPartForElsIf()
	{
		super();
	}

	@Override
	public int eval(Scope scope) 
	{
		if (getExpression().eval(scope) == 1)
			return getStatements().eval(scope);
		
		return 0;
	}
}
