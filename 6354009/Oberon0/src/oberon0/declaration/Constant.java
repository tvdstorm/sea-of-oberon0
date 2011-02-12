package oberon0.declaration;

import oberon0.expression.Expression;

public class Constant {
	
	private String identifier;
	private Expression expresion;
	
	public Constant(String identifier, Expression expresion) {
		this.identifier = identifier;
		this.expresion = expresion;
	}

	public String getIdentifier() {
		return identifier;
	}

	public Expression getExpression() {
		return expresion;
	}
	
}