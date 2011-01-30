package AbstractSyntax.Statements;

import org.antlr.runtime.tree.CommonTree;

import AbstractSyntax.BaseNode;
import AbstractSyntax.ID;
import Execution.Scope;

/**
 * @author Chiel Labee
 * This class represents a Method Call Statement.
*/
public class Call extends BaseStatement
{
	public Call(CommonTree parserTree)
	{
		super(parserTree);
	}
	
	private CallVars _callVars = null;
	/**
	 * Gets all Method Call Variables.
	 */
	public CallVars getCallVars()
	{
		return _callVars;
	}
	/**
	 * Gets a specific Method Call Variable based on its list Index value.
	 */
	public BaseNode getCallVar(int index)
	{
		return _callVars.getItem(index);
	}
	
	private CallConcrete _callConcrete = null;
	private void setCallConcrete(CallConcrete callConcrete)
	{
		_callConcrete = callConcrete;
		_callConcrete.setCall(this);
	}
	
	@Override
	protected boolean addChildNode(BaseNode child)
	{
		//Determine if child node is an Identifier specifying the Method Call.
		if (child instanceof ID)
		{
			ID childID = (ID)child;
			
			//Specially Buildin Method Call for Testing purposes.
			if (childID.getValue().startsWith("Assert"))
				setCallConcrete(new CallConcreteAssert(childID.getValue().endsWith("False") == false));
			
			//Map the default Method Call implementation.
			else
				setCallConcrete(new CallConcreteDefault((ID)child));
			return true;
		}
		
		//Map the Buildin Method Call implementation.
		if (child instanceof CallConcrete)
		{
			setCallConcrete((CallConcrete)child);
			return true;
		}
		
		//Map the Method Call Variables.
		if (child instanceof CallVars)
		{
			_callVars = (CallVars)child;
			return true;
		}
		
		return false;
	}
	
	@Override
	public boolean isValid()
	{
		return super.isValid()
		&& _callConcrete != null;
	}

	@Override
	public int eval(Scope scope)
	{
		return _callConcrete.eval(scope);
	}
}
