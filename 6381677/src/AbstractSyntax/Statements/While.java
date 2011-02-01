package AbstractSyntax.Statements;

import org.antlr.runtime.tree.CommonTree;

import Execution.Scope;

/**
 * @author Chiel Labee
 * This class represents a While Statement.
*/
public class While extends BaseWithCondition 
{
	public While(CommonTree parserTree)
	{
		super(parserTree);
	}
	
	@Override
	public int eval(Scope scope)
	{
		while (getExpression().eval(scope) == 1)
		{
			if (getStatements().eval(scope) == 0)
				return 0;
		}
		
		return 1;
	}
}