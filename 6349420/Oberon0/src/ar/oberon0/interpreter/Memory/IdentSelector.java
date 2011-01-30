package ar.oberon0.interpreter.Memory;

import ar.oberon0.interpreter.Interpretable;
import ar.oberon0.interpreter.TechnicalException;

/*
 * The ident selector is used to select a variable, constant, etc. form the context (memory).
 */
public class IdentSelector extends Selector implements Interpretable
{
	/*
	 * The name to look for in the context (memory).
	 */
	private String _identName;

	/*
	 * Create a new IdentSelector that is going to look for the variable,
	 * constant, etc. with the specified name.
	 */
	public IdentSelector(String identName)
	{
		_identName = identName;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ar.oberon0.interpreter.Interpretable#Interpret(ar.oberon0.interpreter
	 * .Memory.Context)
	 */
	@Override
	public Object Interpret(Context context) throws TechnicalException
	{
		return getItem(null, context);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ar.oberon0.interpreter.Memory.Selector#getItem(ar.oberon0.interpreter
	 * .Memory.DataField, ar.oberon0.interpreter.Memory.Context)
	 */
	@Override
	protected DataField getItem(DataField parent, Context context) throws TechnicalException
	{
		if (parent == null)
		{
			DataField currentVar = context.getVarOrConstantAsDataField(_identName);
			if (getNextNode() == null)
				return currentVar;
			else
				return getNextNode().getItem(currentVar, context);
		} else
		{
			throw new TechnicalException("this feature is yet supported.");
		}
	}
}
