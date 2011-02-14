package language;

import java.util.List;

public class AnSmtProcCall implements IStatement {

	private AnIdent ident;
	private List<AnValue> actualParams;
	
	@Override
	public IAstNode eval(AnEnvironment env) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
	public AnSmtProcCall(AnIdent ident, List<AnValue> actualParams){
		this.ident = ident;
		this.actualParams = actualParams;
	}

}
