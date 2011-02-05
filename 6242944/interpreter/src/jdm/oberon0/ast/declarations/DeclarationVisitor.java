package jdm.oberon0.ast.declarations;

public abstract class DeclarationVisitor {
	protected abstract void visitDeclarations(Declarations declarations);
	protected abstract void visitConstDeclaration(ConstDeclaration declaration);
	protected abstract void visitVarDeclaration(VarDeclaration declaration);
	protected abstract void visitTypeDeclaration(TypeDeclaration declaration);
	protected abstract void visitProcedure(Procedure procedure);
}

