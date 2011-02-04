package eu.wietsevenema.lang.oberon.ast.declarations;

import xtc.tree.Node;
import eu.wietsevenema.lang.oberon.ast.expressions.Expression;
import eu.wietsevenema.lang.oberon.ast.expressions.Identifier;
import eu.wietsevenema.lang.oberon.ast.visitors.TransformGenerics;

public class ConstantDecl extends Declaration {

	Identifier identifier;
	Expression expression;
	
	public ConstantDecl(Node identifier, Node expression) {
		this.identifier =(Identifier)identifier;
		TransformGenerics tg = new TransformGenerics();
		this.expression = (Expression) tg.dispatch(expression);
	}

	public Identifier getIdentifier() {
		return identifier;
	}

	public Expression getExpression() {
		return expression;
	}

}
