package language;

import java.util.List;

public class AnSmtProcCall implements IStatement {

	private String procName;
	private List<AnExpression> actualParams;
	private AnProcDecl proc;
	
	@Override
	public IAstNode eval(AnEnvironment env) throws Exception {
		assert(this.proc != null);
		return proc.eval(env);
	}
	
	public AnSmtProcCall(String procName, List<AnExpression> actualParams){
		this.procName = procName;
		this.actualParams = actualParams;
		this.proc = null;
	}

	@Override
	public void typeCheck(AnEnvironment env) throws Exception {
		this.proc = env.getProc(this.procName);
		if (proc == null) {
			throw new Exception("Cannot find procedure: " + this.procName);
		}

		this.proc.setFPContext(this.actualParams, env);
		this.proc.typeCheck(env);
	}

}
