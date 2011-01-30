package AbstractSyntax.Statements;

import java.util.ArrayList;

import org.antlr.runtime.tree.CommonTree;

import AbstractSyntax.BaseNode;
import Execution.Scope;

/**
 * @author Chiel Labee
 * This class represents a List of Statement Nodes.
*/
public class BaseStatementList extends AbstractSyntax.BaseNode 
{
	public BaseStatementList(CommonTree parserTree)
	{
		super(parserTree);
	}
	
	private ArrayList<BaseStatement> _statements = new ArrayList<BaseStatement>();

	@Override
	protected boolean addChildNode(BaseNode child)
	{
		if (child instanceof BaseStatement)
		{
			_statements.add((BaseStatement)child);
			return true;
		}
		
		return false;
	}
	
	@Override
	public boolean isValid()
	{
		return super.isValid()
		&& _statements.size() > 0;
	}

	@Override
	public int eval(Scope scope)
	{
		//Loop all Statement Nodes.
		for (BaseStatement statement : _statements)
		{
			//Evaluate Statement Node.
			if (statement.eval(scope) == 0)
			{
				//Assert incorrect evaluation!
				assert false : "Incorrect Statement Eval!";
				return 0;
			}
		}
		
		return 1;
	}
}
