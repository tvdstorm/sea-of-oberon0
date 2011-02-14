package language;


public interface IAstNode {	
	public IAstNode eval(AnEnvironment env) throws Exception;
}
