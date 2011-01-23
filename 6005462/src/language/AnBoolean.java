package language;

public class AnBoolean implements IType {

	private boolean value; 
	
	public AnBoolean(boolean value){
		this.value = value;
	}
	
	public boolean getValue(){
		return this.value;
	}

	@Override
	public ValueType getType() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AnValue operate(int op, AnValue secondVal) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AnValue eval() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	

}
