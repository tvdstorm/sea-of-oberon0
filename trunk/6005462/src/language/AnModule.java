package language;
import java.util.List;

import language.IAstNode;

public class AnModule implements IAstNode{
	
	List<IStatement> statementSeq;
	AnContext ctxt;
	String name;
	
	public AnModule(String name, AnContext ctxt, List<IStatement> statementSeq){
		this.name = name;
		this.ctxt = ctxt;
		this.statementSeq = statementSeq;
	}

	@Override
	public IAstNode eval(AnEnvironment env) throws Exception {
		env.addContext(this.ctxt);
		for(IStatement statement : statementSeq){
			statement.eval(env);
		}
		env.releaseCurrentContext();
		return this;
	}

	@Override
	public void typeCheck(AnEnvironment env) throws Exception {
		env.addContext(this.ctxt);
		for (IStatement smt : statementSeq){
			smt.typeCheck(env);
		}
		ctxt.typeCheck(env);
		env.releaseCurrentContext();
	}
}
