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

}
