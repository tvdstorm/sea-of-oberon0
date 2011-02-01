package uva.oberon0.abstractsyntax.declarations;

import org.antlr.runtime.tree.CommonTree;

import uva.oberon0.abstractsyntax.BaseNode;
import uva.oberon0.abstractsyntax.declarations.Body;
import uva.oberon0.runtime.Scope;


/**
 * @author Chiel Labee
 * This class represents a Procedure Structure.
*/
public class Procedure extends BaseDeclaration 
{
	public Procedure(CommonTree parserTree)
	{
		super(parserTree);
	}
	
	private BaseDeclarationList _inputVars = null;
	/**
	 * Gets a specific Declaration from the Input Variables List based on the index number value.
	 */
	public BaseDeclaration getInputVar(int index)
	{
		return _inputVars.getItem(index);
	}
	private Body _body = null;
	/**
	 * Gets the Body Structure of the current Procedure.
	 */
	public Body getBody()
	{
		return _body;
	}

	@Override
	protected boolean addChildNode(BaseNode child)
	{
		if (super.addChildNode(child))
			return true;
		
		if (child instanceof BaseDeclarationList)
		{
			_inputVars = (BaseDeclarationList)child;
			return true;
		}
		if (child instanceof Body)
		{
			_body = (Body)child;
			return true;
		}
		
		return false;
	}
	
	@Override
	public boolean isValid()
	{
		return super.isValid()
		&& _body != null;
	}
	
	@Override
	public int eval(Scope scope)
	{
		return _body.eval(scope);
	}
}
