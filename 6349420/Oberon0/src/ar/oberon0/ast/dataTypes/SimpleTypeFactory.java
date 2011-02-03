package ar.oberon0.ast.dataTypes;

public class SimpleTypeFactory {
	public CreatableType getType(String name) {

		if (isPrinitiveType(name)) {
			return new SimpleType(name);
		}
		return new LookupType(name);
	}

	private static boolean isPrinitiveType(String name) {
		if (name == "INTEGER")
			return true;
		return false;
	}
}
