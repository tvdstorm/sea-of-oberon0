package ar.oberon0.interpreter.DataTypes;

import ar.oberon0.interpreter.Helper;
import ar.oberon0.interpreter.TechnicalException;
import ar.oberon0.interpreter.Memory.Context;

/*
 * This class is used to store oberon 0 integers.
 */
public class IntegerNode implements ArithmeticValue, ComparableValue {
	/*
	 * The value of this node.
	 */
	private int value;

	/*
	 * Create and init a new node. default value is 0;
	 */
	public IntegerNode() {
		this(0);
	}

	/*
	 * Create a new node with the value of the parameter.
	 */
	public IntegerNode(final int value) {
		this.value = value;
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
		return this;
	}

	/*
	 * Return the java int value of this node.
	 */
	public final int getValueAsInt() {
		return this.value;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see ar.oberon0.interpreter.DataTypes.DataType#getType()
	 */
	@Override
	public final CreatableType getType() {
		return new SimpleType(PrimitiveType.INTEGER);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ar.oberon0.interpreter.DataTypes.DataType#MultiplyBy(ar.oberon0.interpreter
	 * .DataTypes.DataType)
	 */
	public final Value multiplyBy(final Value value) throws TechnicalException {
		if (!Helper.areSameType(this, value)) {
			throw new TechnicalException("Could not multiply the type " + IntegerNode.class + " with a object of type " + value.getClass() + ".");
		}

		return new IntegerNode(this.value * ((IntegerNode) value).value);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ar.oberon0.interpreter.DataTypes.DataType#Add(ar.oberon0.interpreter.
	 * DataTypes.DataType)
	 */
	@Override
	public final Value add(final Value value) throws TechnicalException {
		if (!Helper.areSameType(this, value)) {
			throw new TechnicalException("Could not add the value of type " + IntegerNode.class + " with the value of type " + value.getClass() + ".");
		}

		return new IntegerNode(this.value + ((IntegerNode) value).value);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see ar.oberon0.interpreter.DataTypes.DataType#Negate()
	 */
	@Override
	public final Value negate() {
		return new IntegerNode(-this.value);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ar.oberon0.interpreter.DataTypes.DataType#Subtract(ar.oberon0.interpreter
	 * .DataTypes.DataType)
	 */
	@Override
	public final Value subtract(final Value value) throws TechnicalException {
		if (!Helper.areSameType(this, value)) {
			throw new TechnicalException("Could not subtract the value of type " + IntegerNode.class + " from the value of type " + value.getClass() + ".");
		}

		return new IntegerNode(this.value - ((IntegerNode) value).value);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public final int compareTo(final ComparableValue value) {
		if (!Helper.areSameType(this, value)) {
			return -1;
		}
		return Integer.valueOf(this.value).compareTo(((IntegerNode) value).value);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ar.oberon0.interpreter.DataTypes.DataType#Divide(ar.oberon0.interpreter
	 * .DataTypes.DataType)
	 */
	@Override
	public final Value divide(final Value value) throws TechnicalException {
		if (!Helper.areSameType(this, value)) {
			throw new TechnicalException("Could not divide the value of type " + IntegerNode.class + " from the value of type " + value.getClass() + ".");
		}

		return new IntegerNode(this.value / ((IntegerNode) value).value);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ar.oberon0.interpreter.DataTypes.DataType#Modulo(ar.oberon0.interpreter
	 * .DataTypes.DataType)
	 */
	@Override
	public final Value modulo(final Value value) throws TechnicalException {
		if (!Helper.areSameType(this, value)) {
			throw new TechnicalException("Could not modulo the value of type " + IntegerNode.class + " from the value of type " + value.getClass() + ".");
		}

		return new IntegerNode(this.value % ((IntegerNode) value).value);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public final String toString() {
		return "" + this.value;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public final int hashCode() {
		return Integer.valueOf(this.value).hashCode();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public final boolean equals(final Object obj) {
		if (obj.getClass() != IntegerNode.class) {
			return false;
		}
		return this.value == ((IntegerNode) obj).value;
	}
}
