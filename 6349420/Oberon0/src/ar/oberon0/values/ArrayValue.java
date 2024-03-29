package ar.oberon0.values;

import ar.oberon0.ast.dataTypes.ArrayType;
import ar.oberon0.ast.dataTypes.CreatableType;
import ar.oberon0.runtime.Context;
import ar.oberon0.runtime.DataField;
import ar.oberon0.shared.TechnicalException;

/*
 * This class is used to store datafields in a list. Array is a default oberon 0 datastructure.
 */
public class ArrayValue extends ValueBase {
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
	private IntegerValue length;

	/*
	 * Create a new array of length length and of type childType.
	 */
	public ArrayValue(final IntegerValue length, final CreatableType childType) {
		this.childType = childType;
		this.length = length;
		initArray(length, childType);
	}

	@Override
	public Object interpret(final Context context) throws TechnicalException {
		return this;
	}

	/*
	 * When an array is created it only contains null values. When the oberon 0
	 * program tries to set a value in the array a null pointer exception will
	 * be returned if the datafields are not initialized. because of this reason
	 * every element in the array is initialized when the array is created.
	 */
	private void initArray(final IntegerValue length, final CreatableType type) {
		this.items = new DataField[length.getValueAsInt()];
		for (int i = 0; i < length.getValueAsInt(); i++) {
			this.items[i] = new DataField(type);
		}
	}

	/*
	 * Get the datafield at location the specified index.
	 */
	public final DataField getDataFieldAt(final IntegerValue index) {
		return this.items[index.getValueAsInt()];
	}

	@Override
	public CreatableType getType() {
		return new ArrayType(this.length, this.childType);
	}

}
