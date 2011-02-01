package uva.oberon0.abstractsyntax.statements;

import java.util.ArrayList;

import org.antlr.runtime.tree.CommonTree;

import uva.oberon0.abstractsyntax.BaseNode;
import uva.oberon0.runtime.Scope;


/**
 * @author Chiel Labee
 * This class represents an If-Then-ElsIf-Else Statement.
*/
public class If extends BaseWithCondition
{
	public If(CommonTree parserTree)
	{
		super(parserTree);
	}

	private ArrayList<IfPartForElsIf> _elsIfs = new ArrayList<IfPartForElsIf>(0);
	public ArrayList<IfPartForElsIf> getElsIfs()
	{
		return _elsIfs;
	}
	
	private IfPartForElse _elseStatement = null;
	public IfPartForElse getElseStatement()
	{
		return _elseStatement;
	}

	@Override
	protected boolean addChildNode(BaseNode child)
	{
		if (super.addChildNode(child))
			return true;
		
		if (child instanceof IfPartForElsIf)
		{
			_elsIfs.add((IfPartForElsIf)child);
			return true;
		}
		
		if (child instanceof IfPartForElse)
		{
			_elseStatement = (IfPartForElse)child;
			return true;
		}
		
		return false;
	}

	@Override
	public int eval(Scope scope)
	{
		if (getExpression().eval(scope) == 1)
			return getStatements().eval(scope);
		
		for (IfPartForElsIf elsIf : _elsIfs)
		{
			if (elsIf.getExpression().eval(scope) == 1)
				return elsIf.getStatements().eval(scope);
		}
		
		if (_elseStatement != null)
			return _elseStatement.eval(scope);
		
		return 1;
	}
}
