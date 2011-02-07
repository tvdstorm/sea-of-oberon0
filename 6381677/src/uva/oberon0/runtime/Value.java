package uva.oberon0.runtime;

import uva.oberon0.abstractsyntax.BaseNode;

/**
 * @author Chiel Labee This class represents an Execution Scope Value. This
 *         class is abstract.
 */
public abstract class Value  implements IBindable
{
	public abstract Value getValueBySelector(Scope scope, BaseNode selector);
}
