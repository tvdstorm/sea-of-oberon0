package language;

import java.util.List;

public class AnProcDecl implements IAstNode {
	String name;
	/*List<AnIdentConst> constDecls;
	List<AnTypeDecl> typeDecls; 
	List<AnIdent> varDecls;
	List<AnProcDecl> procDecls;*/ 
	List<AnIdent> formalParams;
	List<IStatement> statementSeq;
	
	public AnProcDecl(String name,
					  AnContext ctxt,
					  List<AnIdent> formalParams,
					  List<IStatement> statementSeq) {
		this.name = name;
		this.formalParams = formalParams;
		this.statementSeq = statementSeq;
		
		assert(this.name != null);
		assert(this.formalParams != null);
		assert(this.statementSeq != null);
		
	}
	
	public String getName(){
		return this.name;
	}

	@Override
	public IAstNode eval(AnEnvironment env) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
