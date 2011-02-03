package uva.oberon0.abstractsyntax;

/**
 * @author Chiel Labee
 * This class represents the BaseNode for the Abstract Syntax Tree.
 * This class is an inheritance root for all Abstract Syntax Tree Node implementations.
 * This class is abstract.
 */
public abstract class BaseNode
{	
	/**
	 * Performs interpreter evaluation for the current Abstract Syntax Tree Node structure.
	 */
	public abstract int eval(uva.oberon0.runtime.Scope scope);
}
