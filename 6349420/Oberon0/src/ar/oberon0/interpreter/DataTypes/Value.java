package ar.oberon0.interpreter.DataTypes;

import ar.oberon0.interpreter.Interpretable;

/*
 * A Value object is used to store data. for example an integer node.
 */
public interface Value extends Interpretable {
	/*
	 * Return the Type of the current object.
	 */
	public CreatableType getType();
}
