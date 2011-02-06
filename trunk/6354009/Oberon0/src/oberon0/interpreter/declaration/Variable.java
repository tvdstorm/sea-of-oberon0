package oberon0.interpreter.declaration;

import oberon0.interpreter.expression.Expression;
import oberon0.interpreter.identifier.Selector;
import oberon0.interpreter.module.Module;
import oberon0.interpreter.type.Type;

public class Variable {

	private String identifier;
	private Type type;

	public Variable(String identifier, Type type) {
		this.identifier = identifier;
		this.type = type;
	}

	public String getIdentifier() {
		return identifier;
	}

	public Type getType() {
		return type;
	}

	public void assignExpression(Expression expression, Selector selector,
			Module module) {
		type.assignExpression(expression, selector, module);
	}

	public Expression getExpression(Selector selector, Module module) {
		return type.getExpression(selector, module);
	}

	// NEW
	public Variable getNew() {
		return new Variable(identifier, type.getNew());
	}

}
