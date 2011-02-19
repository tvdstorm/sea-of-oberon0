package jdm.oberon0.types;

public class ReferenceType implements Type {
	protected Type _type;
	
	public ReferenceType(Type type) {
		_type = type;
	}

	public Type getType() {
		return _type;
	}
	
	public boolean equals(Type other) {
		return _type.equals(other);
	}

	public static ReferenceType getRef(Type type) {
		if (type instanceof ReferenceType) {
			return (ReferenceType)type;
		}
		return new ReferenceType(type);
	}
}
