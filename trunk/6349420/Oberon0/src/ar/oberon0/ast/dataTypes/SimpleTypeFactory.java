package ar.oberon0.ast.dataTypes;

/*
 * This factory is used in the grammer to create a simple type or lookup type.
 */
public class SimpleTypeFactory {
	public CreatableType getType(String name) {

		if (name.equals("INTEGER")) {
			return new IntegerType();
		} else if (name.equals("BOOLEAN")) {
			return new BooleanType();
		}
		return new LookupType(name);
	}
}
