package uva.oberon0.abstractsyntax;

import org.antlr.runtime.tree.CommonTree;

/**
 * @author Chiel Labee
 * This class represents the BaseNode for the Abstract Syntax Tree.
 * This class is an inheritance root for all Abstract Syntax Tree Node implementations.
 * This class is abstract.
 */
public abstract class BaseNode implements Cloneable
{	
	/**
	 * Determines if the current Abstract Syntax Tree Node is valid.
	 */
	public abstract boolean isValid();
	
	/**
	 * Determines if the current Abstract Syntax Tree Node can be split into multiple Tree Nodes.
	 */
	public boolean canSplit()
	{
		return false;
	}
	/**
	 * Splits an new Abstract Syntax Tree Node from the current.
	 */
	public BaseNode split()
	{
		return null;
	}
	
	/**
	 * Performs interpreter evaluation for the current Abstract Syntax Tree Node structure.
	 */
	public abstract int eval(uva.oberon0.runtime.Scope scope);
}
