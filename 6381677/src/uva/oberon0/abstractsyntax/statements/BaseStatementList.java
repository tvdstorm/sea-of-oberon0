package uva.oberon0.abstractsyntax.statements;

import java.util.ArrayList;

import uva.oberon0.runtime.Scope;


/**
 * @author Chiel Labee
 * This class represents a List of Statement Nodes.
*/
public class BaseStatementList extends uva.oberon0.abstractsyntax.BaseNode 
{
	public BaseStatementList()
	{
	}
	
	public void add(BaseStatement item)
	{
		assert item != null : "Item is null!";
		
		_statements.add(item);
	}
	private ArrayList<BaseStatement> _statements = new ArrayList<BaseStatement>();

	
	@Override
	public boolean isValid()
	{
		return _statements.size() > 0;
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
