package uva.oberon0.abstractsyntax.statements;

import uva.oberon0.abstractsyntax.BaseNode;


/**
 * @author Chiel Labee
 * This class represents a Method Call Statement.
*/
public abstract class Call extends BaseStatement
{
	private CallActualParameters _callVars = null;
	/**
	 * Gets all Method Call Variables.
	 */
	public CallActualParameters getCallVars()
	{
		return _callVars;
	}
	public void setCallActualParameters(CallActualParameters value)
	{
		_callVars = value;
	}
	/**
	 * Gets a specific Method Call Variable based on its list Index value.
	 */
	public BaseNode getCallVar(int index)
	{
		return _callVars.getItem(index);
	}
	
	
	@Override
	public boolean isValid()
	{
		return _callVars != null;
	}

}
