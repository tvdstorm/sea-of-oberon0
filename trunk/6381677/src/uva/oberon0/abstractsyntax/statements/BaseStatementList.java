package uva.oberon0.abstractsyntax.statements;

import java.util.ArrayList;

import org.antlr.runtime.tree.CommonTree;

import uva.oberon0.abstractsyntax.BaseNode;
import uva.oberon0.runtime.Scope;


/**
 * @author Chiel Labee
 * This class represents a List of Statement Nodes.
*/
public class BaseStatementList extends uva.oberon0.abstractsyntax.BaseNode 
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
