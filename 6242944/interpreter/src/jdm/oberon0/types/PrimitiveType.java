package jdm.oberon0.types;

/**
 * Primitive types are types which need no additional data like
 * length or element type.
 */
public enum PrimitiveType implements Type {
	Integer,
	Boolean;

	@Override
	public boolean equals(Type other) {
		if (other instanceof ReferenceType) {
			other = ((ReferenceType)other).getType();
		}
		if (!(other instanceof PrimitiveType)) {
			return false;
		}
		return this == (PrimitiveType)other;
	}
}
