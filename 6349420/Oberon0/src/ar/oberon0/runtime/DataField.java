package ar.oberon0.runtime;

import junit.framework.Assert;
import ar.oberon0.ast.dataTypes.CreatableType;
import ar.oberon0.ast.dataTypes.LookupType;
import ar.oberon0.shared.Interpretable;
import ar.oberon0.shared.TechnicalException;
import ar.oberon0.values.Value;

/*
 * A DataField is used to store data. Using a DataField it becomes easy to pass parameters by reference or by value.
 * If a parameter has to be passed by value a clone of the DataField is created that points to another DataField object.
 * If the procedure eddits the value of the DataField it won't be eddited in the calling procedure. 
 * If a clone isn't made the DataField is passed by reference.
 */
public class DataField implements Interpretable {

	private CreatableType type;
	private Value value;

	public final CreatableType getType() {
		return this.type;
	}

	public DataField(final CreatableType type) {
		this(type, null);
	}

	public DataField(final Value value) {
		this(value.getType(), value);
	}

	public DataField(final CreatableType type, final Value value) {
		Assert.assertNotNull("The type parameter can't be null.", type);
		this.type = type;
		this.value = value;
	}

	@Override
	public final Object interpret(final Context context) throws TechnicalException {
		ifNotInitInit(context);
		return getValue(context);
	}

	public final void setValue(final Value value, final Context context) throws TechnicalException {
		if (value.getType().getClass() != this.type.getClass() && this.type.getClass() != LookupType.class) {
			throw new IllegalArgumentException("The value was of type " + value.getType().getClass() + " while " + this.type.getClass() + " was expected.");
		}
		ifNotInitInit(context);
		this.value = value;
	}

	public final Value getValue(final Context context) throws TechnicalException {
		ifNotInitInit(context);
		return this.value;
	}

	public final DataField clone() {
		return new DataField(this.type, this.value);
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
}
