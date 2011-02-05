package jdm.oberon0.ast.types;

public abstract class TypeVisitor<T> {
	public abstract T visitIdentifierType(IdentifierType type);
	public abstract T visitArray(ArrayType type);
	public abstract T visitRecord(RecordType type);
}
