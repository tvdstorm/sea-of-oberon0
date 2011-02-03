package ar.oberon0.ast.expression;

import ar.oberon0.runtime.Context;
import ar.oberon0.runtime.DataField;
import ar.oberon0.shared.Interpretable;
import ar.oberon0.shared.TechnicalException;

/*
 * The var selector is used to select a variable, constant, etc. form the context (memory).
 */
public class VarSelectorNode extends SelectorNode implements Interpretable {
	/*
	 * The name to look for in the context (memory).
	 */
	private String identName;

	/*
	 * Create a new IdentSelector that is going to look for the variable,
	 * constant, etc. with the specified name.
	 */
	public VarSelectorNode(final String identName) {
		this.identName = identName;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ar.oberon0.interpreter.Interpretable#Interpret(ar.oberon0.interpreter
	 * .Memory.Context)
	 */
	@Override
	public final Object interpret(final Context context) throws TechnicalException {
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
	protected final DataField getItem(final DataField parent, final Context context) throws TechnicalException {

		if (parent != null) {
			throw new TechnicalException("this feature is yet supported.");
		}

		DataField currentVar = context.getVarOrConstantAsDataField(this.identName);
		if (getNextNode() == null) {
			return currentVar;
		}
		return getNextNode().getItem(currentVar, context);

	}
}
