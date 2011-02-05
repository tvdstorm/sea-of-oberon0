package jdm.oberon0.ast.types;


public class IdentifierType extends Type {
	private String _name;
	
	public IdentifierType(String name) {
		_name = name;
	}
	
	public String getName() {
		return _name;
	}
	
	@Override
	public <T> T accept(TypeVisitor<T> visitor) {
		return visitor.visitIdentifierType(this);
	}
}
