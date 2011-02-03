package uva.oberon0.abstractsyntax.statements;

import uva.oberon0.abstractsyntax.BaseNode;


/**
 * @author Chiel Labee
 * This class represents a Method Call Statement.
*/
public abstract class Call extends BaseStatement
{
	private final CallActualParameterList _actualParameterList;
	
	protected Call(CallActualParameterList actualParameterList)
	{
		_actualParameterList = actualParameterList;
	}
	
	/**
	 * Gets all Method Call Actual Parameters.
	 */
	public CallActualParameterList getCallVars()
	{
		return _actualParameterList;
	}
	/**
	 * Gets a specific Method Call Actual Parameter based on its list Index value.
	 */
	public BaseNode getActualParameter(int index)
	{
		return _actualParameterList.get(index);
	}

}
