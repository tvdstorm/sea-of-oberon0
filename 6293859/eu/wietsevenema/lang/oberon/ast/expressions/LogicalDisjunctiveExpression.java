package eu.wietsevenema.lang.oberon.ast.expressions;

public class LogicalDisjunctiveExpression extends BinaryExpression {

	public LogicalDisjunctiveExpression(Expression left, Expression right,
			String token) {
		super(left, right, token);
	}

}
