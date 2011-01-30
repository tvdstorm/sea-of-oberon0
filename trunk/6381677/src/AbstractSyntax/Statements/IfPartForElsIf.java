package AbstractSyntax.Statements;

import org.antlr.runtime.tree.CommonTree;

import Execution.Scope;

/**
 * @author Chiel Labee
 * This class represents the ElsIf part of an If-Then-ElsIf-Else Statement.
*/
public class IfPartForElsIf extends BaseWithCondition 
{
	public IfPartForElsIf(CommonTree parserTree)
	{
		super(parserTree);
	}

	@Override
	public int eval(Scope scope) 
	{
		if (getExpression().eval(scope) == 1)
			return getStatements().eval(scope);
		
		return 0;
	}
}
