package jdm.oberon0.ast.expressions;


public abstract class ExpressionVisitor<T> {
	protected abstract T visitArraySelector(ArraySelector selector);
	protected abstract T visitRecordSelector(RecordSelector selector);
	
	protected abstract T visitAddExpression(AddExpression e);
	protected abstract T visitSubExpression(SubExpression e);
	protected abstract T visitMulExpression(MulExpression e);
	protected abstract T visitDivExpression(DivExpression e);
	protected abstract T visitModExpression(ModExpression e);
	protected abstract T visitAndExpression(AndExpression e);
	protected abstract T visitOrExpression(OrExpression e);

	protected abstract T visitLtExpression(LtExpression e);
	protected abstract T visitGtExpression(GtExpression e);
	protected abstract T visitLeExpression(LeExpression e);
	protected abstract T visitGeExpression(GeExpression e);
	protected abstract T visitEqExpression(EqExpression e);
	protected abstract T visitNeExpression(NeExpression e);
	
	protected abstract T visitIntegerLiteral(IntegerLiteral e);
	protected abstract T visitIdentifier(Identifier identifier);
	
	protected abstract T visitNegExpression(NegExpression e);	
	protected abstract T visitPosExpression(PosExpression e);
	protected abstract T visitNotExpression(NotExpression e);
}

