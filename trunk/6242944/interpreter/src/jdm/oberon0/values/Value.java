package jdm.oberon0.values;

import jdm.oberon0.exceptions.InvalidTypeException;
import jdm.oberon0.types.PrimitiveType;
import jdm.oberon0.types.Type;

/**
 * Base class for values used by the Oberon interpreter and runtime.
 */
public abstract class Value {

	public abstract Value clone();
	public abstract Type getType();
	
	public abstract String toNativeString();
	public abstract boolean valueEquals(Value other);
	
	public IntegerValue toInteger() {
		throw new InvalidTypeException("integer");
	}
	
	public BooleanValue toBoolean() {
		throw new InvalidTypeException("boolean");
	}
	
	public ArrayValue toArray() {
		throw new InvalidTypeException("array");
	}
	
	public RecordValue toRecord() {
		throw new InvalidTypeException("record");
	}

	public ReferenceValue toReference() {
		throw new InvalidTypeException("reference");
	}

	public static Value fromType(jdm.oberon0.types.Type type) {
		if (type == PrimitiveType.Integer) {
			return new IntegerValue(0);
		}
		if (type == PrimitiveType.Boolean) {
			return new BooleanValue(false);
		}
		if (type instanceof jdm.oberon0.types.RecordType) {
			return new RecordValue((jdm.oberon0.types.RecordType)type);
		}
		if (type instanceof jdm.oberon0.types.ArrayType) {
			return new ArrayValue((jdm.oberon0.types.ArrayType)type);
		}
		throw new UnsupportedOperationException();
	}
}
