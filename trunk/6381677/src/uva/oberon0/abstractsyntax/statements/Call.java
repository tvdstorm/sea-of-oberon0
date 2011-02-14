package uva.oberon0.abstractsyntax.statements;

import uva.oberon0.abstractsyntax.expressions.Expression;
import uva.oberon0.abstractsyntax.expressions.ExpressionList;


/**
 * @author Chiel Labee
 * This class represents a Method Call Statement.
*/
public abstract class Call extends Statement
{
	private final ExpressionList _actualParameterList;
	
	protected Call(ExpressionList actualParameterList)
	{
		_actualParameterList = actualParameterList;
	}
	
	/**
	 * Gets all Method Call Actual Parameters.
	 */
	public ExpressionList getActualParameterList()
	{
		return _actualParameterList;
	}
	public int getActualParameterCount()
	{
		return _actualParameterList.size();
	}
	/**
	 * Gets a specific Method Call Actual Parameter based on its list Index value.
	 */
	public Expression getActualParameter(int index)
	{
		return _actualParameterList.get(index);
	}

}
