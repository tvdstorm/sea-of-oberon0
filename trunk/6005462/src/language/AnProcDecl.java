package language;

import java.util.List;

public class AnProcDecl implements IAstNode {
	String name;
	List<AnIdentDecl> formalParams;
	List<AnExpression> actualParams;
	List<IStatement> statementSeq;
	AnContext ctxt;
	AnContext fpCtxt;
	
	public AnProcDecl(String name,
					  AnContext ctxt,
					  List<AnIdentDecl> formalParams,
					  List<IStatement> statementSeq) {
		this.name = name;
		this.formalParams = formalParams;
		this.statementSeq = statementSeq;
		this.ctxt = ctxt;
		this.fpCtxt = null;
		
		assert(this.name != null);
		assert(this.formalParams != null);
		assert(this.statementSeq != null);
		assert(this.ctxt != null);
	}
	
	public String getName(){
		return this.name;
	}

	@Override
	public IAstNode eval(AnEnvironment env) throws Exception {		
		assert(this.fpCtxt != null);
		env.addContext(this.fpCtxt);
		env.addContext(this.ctxt);
		
		bindValues(env);
		for(IStatement statement : statementSeq){
			statement.eval(env);
		}
		returnValues(env);
		env.releaseCurrentContext();
		env.releaseCurrentContext();
		
		this.fpCtxt = null; //Zorgt er voor dat je verplicht bent een fpCtxt aan te maken
		return this;
	}

	private void bindValues(AnEnvironment env) throws Exception{
		AnExpression expr;
		AnIdentDecl ident;
		for (int i = 0; i < actualParams.size(); i++){
			expr = this.actualParams.get(i);
			ident = this.formalParams.get(i);
			assert(expr != null);
			assert(ident != null);
			
			ident.assign(expr.eval(env));
			
			fpCtxt.setIdentDecl(ident);
		}
	}
	
	private void returnValues(AnEnvironment env) throws Exception{
		AnExpression expr;
		AnIdentDecl ident;
		for (int i = 0; i < actualParams.size(); i++){
			ident = this.formalParams.get(i);
			assert(ident != null);
			
			if (ident.isVar){
				expr = this.actualParams.get(i);
				assert(expr != null);
				
				AnIdent varIdent = expr.getIdent(env);
				varIdent.assign(ident.getValue());
			}
		}
	}
	
	public void setFPContext(List<AnExpression> actualParams, AnEnvironment env) throws Exception{
		this.fpCtxt = new AnContext();
		
		for (AnIdentDecl param : this.formalParams){
			this.fpCtxt.setIdentDecl(param);
		}
		
		this.actualParams = actualParams;
		checkParams(env);
	}
	
	private void checkParams(AnEnvironment env) throws Exception{
		if (this.actualParams.size() != this.formalParams.size()){
			throw new Exception("Number of parameters do not match up for " + this.name);
		}
		
		for (int i = 0; i < actualParams.size(); i++){
			AnIdentDecl fpIdentDecl = formalParams.get(i);
			AnExpression parExpr = actualParams.get(i);
			
			parExpr.typeCheck(env);
			
			if (parExpr.getType() != fpIdentDecl.getType()){
				throw new Exception("Parameter types don't match up for " + fpIdentDecl.toString());
			}
		}
	}
	

	@Override
	public void typeCheck(AnEnvironment env) throws Exception {
		assert(this.formalParams != null);
		assert(this.fpCtxt != null);
		
		env.addContext(this.fpCtxt);
		env.addContext(this.ctxt);
		
		checkParams(env);
		for (IStatement smt: statementSeq){
			smt.typeCheck(env);
		}
		
		ctxt.typeCheck(env);
		fpCtxt.typeCheck(env);
		
		env.releaseCurrentContext();
		env.releaseCurrentContext();
	}

}
