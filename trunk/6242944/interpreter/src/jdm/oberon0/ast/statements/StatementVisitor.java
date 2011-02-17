package jdm.oberon0.ast.statements;


public abstract class StatementVisitor {
	
	protected abstract void visitStatementSequence(StatementSequence sequence);
	
	protected abstract void visitAssignment(Assignment assignment);
	protected abstract void visitProcedureCall(ProcedureCall procedureCall);
	protected abstract void visitIfStatement(IfStatement statement);
	protected abstract void visitWhileStatement(WhileStatement statement);
	protected abstract void visitWithStatement(WithStatement statement);
}

