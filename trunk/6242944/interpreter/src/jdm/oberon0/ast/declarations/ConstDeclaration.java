package jdm.oberon0.ast.declarations;

import jdm.oberon0.ast.expressions.Expression;

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

	public void accept(DeclarationVisitor visitor) {
		visitor.visitConstDeclaration(this);
	}
}
