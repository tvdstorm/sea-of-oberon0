package language;


public interface IAstNode {	
	public IAstNode eval(AnEnvironment env) throws Exception;
	public void typeCheck(AnEnvironment env) throws Exception;
	
}
