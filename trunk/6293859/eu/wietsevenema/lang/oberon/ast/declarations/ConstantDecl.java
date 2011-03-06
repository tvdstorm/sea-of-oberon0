package eu.wietsevenema.lang.oberon.ast.declarations;

import eu.wietsevenema.lang.oberon.ast.expressions.Expression;
import eu.wietsevenema.lang.oberon.ast.expressions.Identifier;

public class ConstantDecl extends Declaration {

	Identifier identifier;
	Expression expression;

	public ConstantDecl(Identifier identifier, Expression expression) {
		this.identifier = identifier;
		this.expression = expression;
	}

	public Identifier getIdentifier() {
		return identifier;
	}

	public Expression getExpression() {
		return expression;
	}

}
