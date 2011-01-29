package jdm.oberon0.ast;

public abstract class UnaryExpression extends Expression {
	protected Expression _argument;
	
	public UnaryExpression(Expression argument) {
		this._argument = argument;
	}
	public Expression getArgument() {
		return _argument;
	}
}
