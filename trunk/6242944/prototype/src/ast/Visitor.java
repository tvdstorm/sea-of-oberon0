package ast;

public abstract class Visitor<T> {
	
	protected abstract T visit(Module m);

	protected abstract T visit(Declarations declarations);
	protected abstract T visit(ConstDeclaration declaration);
	protected abstract T visit(VarDeclaration declaration);
	
	protected abstract T visit(StatementSequence sequence);

	protected abstract T visit(Procedure procedure);
	protected abstract T visit(ProcedureCall procedureCall);
	protected abstract T visit(IfStatement statement);
	protected abstract T visit(WhileStatement statement);
	protected abstract T visit(Assignment assignment);

	protected abstract T visit(Selector selector);
	
	protected abstract T visit(AddExpression e);
	protected abstract T visit(SubExpression e);
	protected abstract T visit(LtExpression e);
	
	protected abstract T visit(IntegerLiteral e);
	protected abstract T visit(Identifier identifier);
	
	//XXX
	protected abstract T visit(IdentifierType type);
	protected abstract T visit(ArrayType type);
}

