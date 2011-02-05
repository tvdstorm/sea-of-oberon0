package jdm.oberon0.values;

import jdm.oberon0.exceptions.InvalidTypeException;
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
}
