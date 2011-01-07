package ast;

public class ConstDeclaration extends Declaration {
	private String _name;
	private Expression _value;
	
	public ConstDeclaration(String name, Expression value) {
		_name = name;
		_value = value;
	}
	
	@Override
	public <T> T accept(Visitor<T> visitor) {
		return visitor.visit(this);
	}

	public String getName() {
		return _name;
	}

	public Expression getValue() {
		return _value;
	}

}
