package ast;

public abstract class Visitor<T> {
	
	protected abstract T visit(Module m);

	protected abstract T visit(ConstDeclaration declaration);
	
	protected abstract T visit(StatementSequence sequence);

	protected abstract T visit(ProcedureCall procedureCall);
	protected abstract T visit(IfStatement statement);
	protected abstract T visit(WhileStatement statement);

	protected abstract T visit(AddExpression e);
	protected abstract T visit(SubExpression e);
		
	protected abstract T visit(LtExpression e);
	
	protected abstract T visit(IntegerLiteral e);
	protected abstract T visit(Identifier identifier);
}

