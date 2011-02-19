package nl.bve.uva.oberon.env.values;

import nl.bve.uva.oberon.shared.SelectorValue;

/**
 * Abstract superclass for all Oberon-types.
 * 
 * @author Bart v. Eijkelenburg
 */
public abstract class OberonValue {
	/**
	 * If the subclass is not a container type like an array or record,
	 * this method can be used to get the actual int value of the type.
	 * 
	 * @return Integer : the int value of this type
	 */
	public abstract Integer getValue();
	
	/**
	 * This method can be used to assign a new value to this type. The
	 * type should throw a RuntimeException if the actual type of the
	 * subclass is not equals to the parameters actual type, or if the
	 * parameter is not applicable.
	 * 
	 * @param value : the new value for this type 
	 */
	public abstract void setValue(OberonValue value);
	
	/**
	 * This method can be used for container types like array or record.
	 * Types that aren't container types, should throw a RuntimeException.
	 * If the container type contains a value that corresponds with the
	 * selector, it will return that value.
	 * 
	 * @param selector : the selector that has to applied to this type's value
	 * @return : the value that corresponds with the selector
	 */
	public abstract OberonValue evaluateSelector(SelectorValue selector);
	
	/**
	 * If a value is assigned to a type, the actual value can be different
	 * from the value that the type is expecting. In example; if an user-defined
	 * type-value is assigned to another user-defined type-value, it would be 
	 * nice if they belong to the same type, otherwise calls to the old type,
	 * after the new assignment, could be invalid due to different field names
	 * and so on. This method checks whether this type and the given parameter
	 * are meaningful equals.
	 * 
	 * @param obj : the type to compare to
	 * @return : true if this type is type-equals, false if otherwise
	 */
	public abstract boolean typeEquals(OberonValue obj);
	
	/* (non-Javadoc)
	 * @see java.lang.Object#clone()
	 */
	@Override
	public abstract OberonValue clone();
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public abstract String toString();
}