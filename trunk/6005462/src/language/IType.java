package language;

public interface IType extends IAstNode{

	public ValueType getType() throws Exception;
	@Override
	public AnValue eval(AnEnvironment env)throws Exception;
	public AnValue operate(int op, AnValue secondVal, AnEnvironment env) throws Exception;
		 
}
