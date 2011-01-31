package ar.oberon0.interpreter.DataTypes;

import ar.oberon0.interpreter.TechnicalException;
import ar.oberon0.interpreter.Memory.Context;
import ar.oberon0.interpreter.Memory.DataField;

/*
 * This class is used to store datafields in a list. Array is a default oberon 0 datastructure.
 */
public class Array implements Value {
	/*
	 * The java aray containing the DataFields (variables).
	 */
	private DataField[] items;
	/*
	 * The type of the elements in the array.
	 */
	private CreatableType childType;
	/*
	 * The length of the array.
	 */
	private IntegerNode length;

	/*
	 * Create a new array of length length and of type childType.
	 */
	protected Array(IntegerNode length, CreatableType childType) {
		this.childType = childType;
		this.length = length;
		initArray(length, childType);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ar.oberon0.interpreter.Interpretable#Interpret(ar.oberon0.interpreter
	 * .Memory.Context)
	 */
	@Override
	public Object interpret(Context context) throws TechnicalException {
		return this;
	}

	/*
	 * When an array is created it only contains null values. When the oberon 0
	 * program tries to set a value in the array a null pointer exception will
	 * be returned if the datafields are not initialized. because of this reason
	 * every element in the array is initialized when the array is created.
	 */
	private void initArray(IntegerNode length, CreatableType type) {
		this.items = new DataField[length.getValueAsInt()];
		for (int i = 0; i < length.getValueAsInt(); i++) {
			this.items[i] = new DataField(type);
		}
	}

	/*
	 * Get the datafield at location the specified index.
	 */
	public DataField getDataFieldAt(IntegerNode index) {
		return this.items[index.getValueAsInt()];
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see ar.oberon0.interpreter.DataTypes.DataType#getType()
	 */
	@Override
	public CreatableType getType() {
		return new ArrayType(this.length, this.childType);
	}

}
