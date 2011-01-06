package ast;

public abstract class Visitor<T> {
	
	public abstract T visit(Module m);
	
	public abstract T visit(AddExpression e);
	public abstract T visit(SubExpression e);
	
	public abstract T visit(IntegerLiteral e);

}

