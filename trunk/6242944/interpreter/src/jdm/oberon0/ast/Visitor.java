package jdm.oberon0.ast;

public abstract class Visitor<T> {
	
	protected abstract void visitModule(Module m);

	protected abstract void visitDeclarations(Declarations declarations);
	protected abstract void visitConstDeclaration(ConstDeclaration declaration);
	protected abstract void visitVarDeclaration(VarDeclaration declaration);
	protected abstract void visitTypeDeclaration(TypeDeclaration declaration);
	
	protected abstract void visitStatementSequence(StatementSequence sequence);

	protected abstract void visitProcedure(Procedure procedure);
	protected abstract void visitProcedureCall(ProcedureCall procedureCall);
	protected abstract void visitIfStatement(IfStatement statement);
	protected abstract void visitWhileStatement(WhileStatement statement);
	protected abstract void visitAssignment(Assignment assignment);

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

