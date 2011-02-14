package language;

public class AnConst implements IAstNode{

	@Override
	public IAstNode eval(AnEnvironment env) throws Exception {
		return null;
	}

	public void assign(AnValue value) throws Exception{
		throw new Exception("Cannot assign to a constant");
	}
}
