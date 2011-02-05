package ar.oberon0.ast.dataTypes;

import java.lang.reflect.Field;

/*
 * This class contains all the primitive types and functions to check if a
 * primitive type exists.
 */
public class PrimitiveTypes {
	public static final String INTEGER = "INTEGER";
	public static final String BOOLEAN = "BOOLEAN";

	protected static boolean doesPrimitiveTypeExist(final String name) {
		for (Field field : PrimitiveTypes.class.getFields()) {
			if (field.getName().equals(name)) {
				return true;
			}
		}
		return false;
	}
}
