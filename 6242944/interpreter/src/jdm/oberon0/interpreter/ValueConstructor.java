package jdm.oberon0.interpreter;

import jdm.oberon0.types.ArrayType;
import jdm.oberon0.types.PrimitiveType;
import jdm.oberon0.types.RecordType;
import jdm.oberon0.types.Type;
import jdm.oberon0.values.ArrayValue;
import jdm.oberon0.values.BooleanValue;
import jdm.oberon0.values.IntegerValue;
import jdm.oberon0.values.RecordValue;
import jdm.oberon0.values.Value;

public class ValueConstructor {

	public static Value fromType(Type type) {
		if (type == PrimitiveType.Integer) {
			return new IntegerValue(0);
		}
		if (type == PrimitiveType.Boolean) {
			return new BooleanValue(false);
		}
		if (type instanceof RecordType) {
			return new RecordValue((RecordType)type);
		}
		if (type instanceof ArrayType) {
			return new ArrayValue((ArrayType)type);
		}
		throw new UnsupportedOperationException();
	}
}
