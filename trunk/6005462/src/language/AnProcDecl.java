package language;

import java.util.List;

public class AnProcDecl implements IAstNode {
	String name;
	List<AnIdentConst> constDecls;
	List<AnTypeDecl> typeDecls; 
	List<AnIdent> varDecls;
	List<AnProcDecl> procDecls; 
	List<AnIdentParam> formalParams;
	List<IStatement> statementSeq;
	
	public AnProcDecl(String name,
					  List<AnIdentConst> constDecls,
					  List<AnTypeDecl> typeDecls, 
					  List<AnIdent> varDecls,
					  List<AnProcDecl> procDecls, 
					  List<AnIdentParam> formalParams,
					  List<IStatement> statementSeq) {
		this.name = name;
		this.constDecls = constDecls;
		this.typeDecls = typeDecls;
		this.varDecls = varDecls;
		this.procDecls = procDecls;
		this.formalParams = formalParams;
		this.statementSeq = statementSeq;
		
		assert(this.name != null);
		assert(this.constDecls != null);
		assert(this.typeDecls != null);
		assert(this.varDecls != null);
		assert(this.procDecls != null);
		assert(this.formalParams != null);
		assert(this.statementSeq != null);
		
	}

	@Override
	public IAstNode eval() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
