package ar.oberon0.ast.dataTypes;

import java.lang.reflect.Field;

public class PrimitiveTypes {
	public static final String INTEGER = "INTEGER";

	public static boolean doesPrimitiveTypeExist(String name) {
		for (Field field : PrimitiveTypes.class.getFields()) {
			if (field.getName().equals(name)) {
				return true;
			}
		}
		return false;
	}
}
