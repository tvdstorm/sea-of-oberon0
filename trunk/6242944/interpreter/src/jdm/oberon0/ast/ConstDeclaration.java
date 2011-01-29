package jdm.oberon0.ast;

public class ConstDeclaration extends Declaration {
	private String _name;
	private Expression _value;
	
	public ConstDeclaration(String name, Expression value) {
		_name = name;
		_value = value;
	}
	
	public String getName() {
		return _name;
	}

	public Expression getValue() {
		return _value;
	}

	public <T> void accept(Visitor<T> visitor) {
		visitor.visitConst(this);
	}
}
