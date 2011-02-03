package ar.oberon0.interpreter.DataTypes;

import java.lang.reflect.Field;

public class PrimitiveType {
	public static final String INTEGER = "INTEGER";

	public static boolean doesPrimitiveTypeExist(String name) {
		for (Field field : PrimitiveType.class.getFields()) {
			if (field.getName().equals(name)) {
				return true;
			}
		}
		return false;
	}
}
