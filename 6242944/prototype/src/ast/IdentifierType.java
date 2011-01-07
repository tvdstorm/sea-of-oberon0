package ast;

public class IdentifierType extends Type {
	private String _name;
	
	public IdentifierType(String name) {
		_name = name;
	}
	
	public String getName() {
		return _name;
	}

	@Override
	public <T> T accept(Visitor<T> visitor) {
		return visitor.visit(this);
	}
}
