package ar.oberon0.interpreter.Memory;

import ar.oberon0.interpreter.Interpretable;
import ar.oberon0.interpreter.TechnicalException;
import ar.oberon0.interpreter.DataTypes.CreatableType;
import ar.oberon0.interpreter.DataTypes.Value;

/*
 * A DataField is used to store data. Using a DataField it becomes easy to pass parameters by reference or by value.
 * If a parameter has to be passed by value a clone of the DataField is created that points to another DataField object.
 * If the procedure eddits the value of the DataField it won't be eddited in the calling procedure. 
 * If a clone isn't made the DataField is passed by reference.
 */
public class DataField implements Interpretable {
	/*
	 * The type of the item stored in the DataField.
	 */
	private CreatableType type;
	/*
	 * The actual value.
	 */
	private Value value;

	public final CreatableType getType() {
		return this.type;
	}

	/*
	 * Get the value of this DataField.
	 */
	public final Value getValue(final Context context)
			throws TechnicalException {
		ifNotInitInit(context);
		return this.value;
	}

	/*
	 * Set the value of the DataField.
	 */
	public final void setValue(final Value value, final Context context)
			throws TechnicalException {
		if (value.getType().getClass() != this.type.getClass()) {
			throw new IllegalArgumentException("The value was of type "
					+ value.getType().getClass() + " while "
					+ this.type.getClass() + " was expected.");
		}
		ifNotInitInit(context);
		this.value = value;
	}

	/*
	 * Create a new DataField of the specified type.
	 */
	public DataField(final CreatableType type) {
		this(type, null);
	}

	/*
	 * Create a new DataField of the specified type and with the specified
	 * value.
	 */
	public DataField(final CreatableType type, final Value value) {
		this.type = type;
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
	public final Object interpret(final Context context)
			throws TechnicalException {
		ifNotInitInit(context);
		return getValue(context);
	}

	/*
	 * If the DataField isn't initialized then initialize the DataField. This is
	 * needed else a null pointer exception will be thrown when an assignment is
	 * done.
	 */
	private void ifNotInitInit(final Context context) throws TechnicalException {
		if (this.value == null) {
			this.value = type.createInstance(context);
		}
	}

	/*
	 * Create a new DataField with the same value.
	 */
	public final DataField clone() {
		return new DataField(this.type, this.value);
	}

}
