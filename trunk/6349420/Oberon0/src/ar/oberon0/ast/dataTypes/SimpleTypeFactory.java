package ar.oberon0.ast.dataTypes;

/*
 * This factory is used in the grammer to create a simple type or lookup type.
 */
public class SimpleTypeFactory {
	public CreatableType getType(String name) {

		if (PrimitiveTypes.doesPrimitiveTypeExist(name)) {
			return new SimpleType(name);
		}
		return new LookupType(name);
	}
}
