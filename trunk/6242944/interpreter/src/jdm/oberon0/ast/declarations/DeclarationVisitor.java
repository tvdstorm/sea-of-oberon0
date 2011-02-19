package jdm.oberon0.ast.declarations;

public abstract class DeclarationVisitor {
	protected abstract void visitConstDeclaration(ConstDeclaration declaration);
	protected abstract void visitVarDeclaration(VarDeclaration declaration);
	protected abstract void visitTypeDeclaration(TypeDeclaration declaration);
	protected abstract void visitProcedure(ProcedureDeclaration procedure);
	
	protected void visitDeclarations(Declarations declarations) {
		for(Declaration decl : declarations.getDeclarations()) {
			decl.accept(this);
		}
	}
}

