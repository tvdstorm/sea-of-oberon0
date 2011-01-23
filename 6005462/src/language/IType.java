package language;

public interface IType extends IAstNode{

	public ValueType getType() throws Exception;
	@Override
	public AnValue eval()throws Exception;
	//public IType getValue();
	//IType operate(int op, AnNumber secondVal) throws Exception;
	//IType operate(int op, AnBoolean secondVal) throws Exception;
	public AnValue operate(int op, AnValue secondVal) throws Exception;
		 
}
