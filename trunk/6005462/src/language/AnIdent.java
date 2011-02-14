package language;

public class AnIdent implements IType {
	protected AnValue value;
	protected String name;
	protected ValueType valType;
	private boolean isVar;
	private boolean isConst;
	
	public AnIdent(String name, ValueType valType){
		this.valType = valType;
		this.value = null;
		this.isVar = true;
		this.isConst = false;
	}
	
	public void assign(AnValue value) throws Exception{
		if (valType == ValueType.UNDETERMINED){
			this.valType = value.getType();
		} else if (value.getType() != valType) {
			throw new Exception("Cannot assign a " + value.toString() + " to a " + this.value.toString());
		}
		this.value = value;
	}
	
	public String getName(){
		return this.name;
	}
	
	@Override
	public AnValue eval(AnEnvironment env) throws Exception {
		if (value == null){
			throw new Exception("Null reference: " + name);
		} else {
			return value.eval(env);
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
	public AnValue operate(int op, AnValue secondVal, AnEnvironment env) throws Exception {
		if (value == null){
			throw new Exception("Null reference: " + name);
		} else {
			return this.value.operate(op, secondVal, env);
		}
	}
	
	public AnValue getValue(){
		return this.value;
	}

	public void setVar(boolean isVar) {
		this.isVar = isVar;
	}

	public boolean isVar() {
		return isVar;
	}
	
	public void setConst(boolean isConst){
		this.isConst = isConst;
	}
	
	public boolean isConst(){
		return this.isConst;
	}
}
