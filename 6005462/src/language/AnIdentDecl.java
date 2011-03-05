package language;

public class AnIdentDecl implements IType {
	protected AnValue value;
	protected String name;
	protected ValueType valType;
	protected boolean isVar;
	protected boolean isConst;
	
	public AnIdentDecl(String name, ValueType valType){
		this.name = name;
		this.valType = valType;
		this.value = null;
		this.isVar = true;
		this.isConst = false;
	}
	
	public void assign(AnValue value) throws Exception{
		assert(value != null);
		
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
		checkForNullReference(env);
		return value.eval(env);
	}

	@Override
	public ValueType getType() throws Exception {
		return this.valType;
	}

	private void checkForNullReference(AnEnvironment env) throws Exception{
		if (this.getValue() == null){
			throw new Exception("Null reference: " + name);
		}
	}
	
	@Override
	public AnValue operate(int op, AnValue secondVal, AnEnvironment env) throws Exception {
		checkForNullReference(env);
		return this.value.operate(op, secondVal, env);
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
	
	public boolean hasValue(){
		return (this.value != null);
	}

	@Override
	public void typeCheck(AnEnvironment env) throws Exception {
		assert (this.valType != ValueType.UNDETERMINED);
		
		if (this.value != null && this.valType != this.value.getType()) {
			throw new Exception ("Types dont match up for " + this.getName() + " " + value.toString());
		}
	}
	
	@Override
	public String toString(){
		if (this.getValue() != null){
			return this.getName() + " = " + this.getValue().toString();
		} else {
			return this.getName();
		}
		
	}
}
