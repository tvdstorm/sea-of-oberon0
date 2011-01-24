package language;

public class AnIdent implements IType {
	protected AnValue value;
	protected String name;
	protected ValueType valType;
	
	public AnIdent(String name, ValueType valType){
		this.valType = valType;
		this.value = null;
	}
	
	public void assign(AnValue value) throws Exception{
		this.value = value;
	}
	
	public String getName(){
		return this.name;
	}
	
	@Override
	public AnValue eval() throws Exception {
		if (value == null){
			throw new Exception("Null reference: " + name);
		} else {
			return value.eval();
		}
	}

	@Override
	public ValueType getType() throws Exception {
		/*if (value == null){
			throw new Exception("Null reference: " + name);
		} else {
			return value.getType();
		}*/
		return this.valType;
	}

	@Override
	public AnValue operate(int op, AnValue secondVal) throws Exception {
		if (value == null){
			throw new Exception("Null reference: " + name);
		} else {
			return this.value.operate(op, secondVal);
		}
	}
}
