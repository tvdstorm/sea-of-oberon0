package uva.oberon0.abstractsyntax.statements;

import uva.oberon0.abstractsyntax.BaseNode;

/**
 * @author Chiel Labee
 * This class represents a Method Call Implementaion.
 * This class is abstract.
*/
public abstract class CallConcrete extends BaseNode 
{
	protected CallConcrete() 
	{
		super(null);
	}
	
	protected BaseNode getCallVar(int index)
	{
		return _call.getCallVar(index);
	}
	protected CallVars getCallVars()
	{
		return _call.getCallVars();
	}
	
	private Call _call;
	/**
	 * Sets the overarching Method Call to the current concrete Method Call implementation.
	 */
	public void setCall(Call call)
	{
		_call = call;
	}
	
	@Override
	protected boolean addChildNode(BaseNode child) 
	{
		return false;
	}
}
