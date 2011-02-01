package uva.oberon0.runtime;

import uva.oberon0.abstractsyntax.BaseNode;
import uva.oberon0.abstractsyntax.ID;

/**
 * @author Chiel Labee
 * This class represents an Execution Scope Value.
 * This class is abstract.
*/
public abstract class ScopeValueBase 
{	
	/**
	 * Gets an Integer Value from the current Execution Scope Value.
	 * @param scope The Execution Scope to retrieve the Index Value from.
	 * @param index The Index Value specification.
	 */
	public abstract int getValue(Scope scope, BaseNode index);
	/**
	 * Sets the Integer Value to the current Execution Scope Value.
	 * @param scope The Execution Scope to retrieve the Index Value from.
	 * @param index The Index Value specification.
	 */
	public abstract void setValue(Scope scope, BaseNode index, int valueNew);
	
	/**
	 * Gets the current Execution Scope Value to be passed by Reference.
	 * @param scope The Execution Scope to retrieve the Index Value from.
	 * @param id The Identifier to determine the Index Value specification.
	 */
	public abstract ScopeValueBase getValueReference(Scope scope, ID id);
}
