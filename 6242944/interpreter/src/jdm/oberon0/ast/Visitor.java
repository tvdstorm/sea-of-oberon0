package jdm.oberon0.ast;

public abstract class Visitor<T> {
	
	protected abstract void visitModule(Module m);

	protected abstract void visitDeclarations(Declarations declarations);
	protected abstract void visitConst(ConstDeclaration declaration);
	protected abstract void visitVar(VarDeclaration declaration);
	protected abstract void visitType(TypeDeclaration declaration);
	
	protected abstract void visitStatements(StatementSequence sequence);

	protected abstract void visitProcedure(Procedure procedure);
	protected abstract void visitCall(ProcedureCall procedureCall);
	protected abstract void visitIf(IfStatement statement);
	protected abstract void visitWhile(WhileStatement statement);
	protected abstract void visitAssignment(Assignment assignment);

	protected abstract T visit(ArraySelector selector);
	protected abstract T visit(RecordSelector selector);
	
	protected abstract T visit(AddExpression e);
	protected abstract T visit(SubExpression e);
	protected abstract T visit(MulExpression e);
	protected abstract T visit(DivExpression e);
	protected abstract T visit(ModExpression e);
	protected abstract T visit(AndExpression e);
	protected abstract T visit(OrExpression e);

	protected abstract T visit(LtExpression e);
	protected abstract T visit(GtExpression e);
	protected abstract T visit(LeExpression e);
	protected abstract T visit(GeExpression e);
	protected abstract T visit(EqExpression e);
	protected abstract T visit(NeExpression e);
	
	protected abstract T visitInteger(IntegerLiteral e);
	protected abstract T visitIdentifier(Identifier identifier);
	
	protected abstract T visit(NegExpression e);	
	protected abstract T visit(PosExpression e);
	protected abstract T visit(NotExpression e);
}

