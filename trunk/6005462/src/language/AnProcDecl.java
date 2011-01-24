package language;

import java.util.List;

public class AnProcDecl implements IAstNode {
	String name;
	AnConstDelcs constDecls; 
	AnTypeDecls typeDecls; 
	AnVarDecls varDecls; 
	List<AnProcDecl> procDecls;
	AnFormalParams formalParams;
	AnStatementSeq statementSeq;
	
	public AnProcDecl(String name, 
					  AnConstDelcs constDecls, 
					  AnTypeDecls typeDecls, 
					  AnVarDecls varDecls, 
					  List<AnProcDecl> procDecls,
					  AnFormalParams formalParams,
					  AnStatementSeq statementSeq){
		assert(procDecls != null);
		this.name = name;
		this.constDecls = constDecls;
		this.typeDecls = typeDecls;
		this.varDecls = varDecls;
		this.procDecls = procDecls;
		this.formalParams = formalParams;
		this.statementSeq = statementSeq;
	}
	
	@Override
	public IAstNode eval() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
