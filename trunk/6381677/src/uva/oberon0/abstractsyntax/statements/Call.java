package uva.oberon0.abstractsyntax.statements;

import org.antlr.runtime.tree.CommonTree;

import uva.oberon0.abstractsyntax.BaseNode;
import uva.oberon0.abstractsyntax.ID;
import uva.oberon0.runtime.Scope;


/**
 * @author Chiel Labee
 * This class represents a Method Call Statement.
*/
public abstract class Call extends BaseStatement
{
	private CallVars _callVars = null;
	/**
	 * Gets all Method Call Variables.
	 */
	public CallVars getCallVars()
	{
		return _callVars;
	}
	public void setCallVars(CallVars value)
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
