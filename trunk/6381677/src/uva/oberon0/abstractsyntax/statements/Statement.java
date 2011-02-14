package uva.oberon0.abstractsyntax.statements;

import uva.oberon0.abstractsyntax.BaseNode;
import uva.oberon0.runtime.Scope;

/**
 * @author Chiel Labee
 * This class represents a Statement Node.
 * This class is abstract.
*/
public abstract class Statement extends BaseNode 
{
	public abstract boolean checkTypes(Scope scope);
}
