package uva.oberon0.abstractsyntax.statements;

import org.antlr.runtime.tree.CommonTree;

import uva.oberon0.abstractsyntax.BaseNode;


/**
 * @author Chiel Labee
 * This class represents a Statement Node containing a Statements List.
 * This class is abstract.
 */
public abstract class BaseWithList extends BaseStatement {

	protected BaseWithList(CommonTree parserTree) 
	{
		super(parserTree);
		
	}

	private BaseStatementList _statements = null;
	protected BaseStatementList getStatements()
	{
		return _statements;
	}
	
	@Override
	protected boolean addChildNode(BaseNode child) 
	{
		if (_statements == null && child instanceof BaseStatementList)
		{
			_statements = (BaseStatementList)child;
			return true;
		}
		
		return false;
	}

	@Override
	public boolean isValid() 
	{
		return super.isValid()
		&& _statements != null;
	}

}
