package eu.wietsevenema.lang.oberon.ast.expressions;


abstract public class BinaryExpression extends Expression {

	private Expression left, right;
	private String token;
	
	public Expression getLeft() {
		return left;
	}

	public Expression getRight() {
		return right;
	}
	
	public String getToken(){
		return this.token;
	}

	public BinaryExpression(Expression left, Expression right, String token) {
		this.left = left; 
		this.right = right;
		this.token = token;
	}
	
}
