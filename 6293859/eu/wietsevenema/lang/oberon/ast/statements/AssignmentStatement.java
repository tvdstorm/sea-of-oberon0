package eu.wietsevenema.lang.oberon.ast.statements;

import xtc.tree.Node;
import eu.wietsevenema.lang.oberon.ast.expressions.Expression;
import eu.wietsevenema.lang.oberon.ast.visitors.TransformGenerics;


public class AssignmentStatement extends Statement {

	Expression identifier;
	Expression expression;

	public Expression getIdentifier() {
		return identifier;
	}

	public Expression getExpression() {
		return expression;
	}

	public AssignmentStatement(Node id, Node exp) {
		TransformGenerics tg = new TransformGenerics();
		
		this.identifier = (Expression) tg.dispatch(id);
		this.expression = (Expression) tg.dispatch(exp);
	}

}
