package language;

import language.parser.oberonLexer;

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
		return ValueType.BOOLEAN;
	}

	@Override
	public AnValue operate(int op, AnValue secondVal, AnEnvironment env) throws Exception {
		if (secondVal == null) {
			return operateSingle(op);
		}
		if (secondVal.getType() != ValueType.BOOLEAN)  throw new Exception("Typemismatch exception");
		AnBoolean secondBool = secondVal.getBoolean();
		
		switch(op){
			case oberonLexer.OR:
				return new AnValue(this.getValue() || secondBool.getValue());
			default: throw new UnsupportedOperationException();
		}
	}
	
	private AnValue operateSingle(int op){
		if (op == oberonLexer.TILDE) return new AnValue(!this.getValue());
		else throw new UnsupportedOperationException();
	}

	@Override
	public AnValue eval(AnEnvironment env) throws Exception {
		return new AnValue(this.value);
	}

	@Override
	public void typeCheck(AnEnvironment env) {
		return;
	}
	
	@Override
	public String toString(){
		return "Boolean: " + this.getValue();
	}

}
