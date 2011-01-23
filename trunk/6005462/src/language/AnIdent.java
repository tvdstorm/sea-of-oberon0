package language;

public class AnIdent implements IType {
	private AnValue value;
	private String ident;
	
	public AnIdent(String ident){
		value = null;
	}
	
	public void assign(AnValue value){
		this.value = value;
	}
	
	@Override
	public AnValue eval() throws Exception {
		if (value == null){
			throw new Exception("Null reference: " + ident);
		} else {
			return value.eval();
		}
	}

	@Override
	public ValueType getType() throws Exception {
		if (value == null){
			throw new Exception("Null reference: " + ident);
		} else {
			return value.getType();
		}
	}

	@Override
	public AnValue operate(int op, AnValue secondVal) throws Exception {
		if (value == null){
			throw new Exception("Null reference: " + ident);
		} else {
			return this.value.operate(op, secondVal);
		}
	}


}
