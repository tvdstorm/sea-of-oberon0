package language;

//import language.parser.oberonLexer;

public class AnValue implements IType {

	private IType value;
	
	public AnValue(int number){
		this.value = new AnNumber(number);
	}
	
	public AnValue(boolean bool){
		this.value = new AnBoolean(bool);
	}
	
	@Override
	public AnValue eval(AnEnvironment env) throws Exception {
		return this;
	}

	@Override
	public ValueType getType() throws Exception {
		return this.value.getType();
	}

	@Override
	public AnValue operate(int op, AnValue secondVal, AnEnvironment env) throws Exception {
		return this.value.operate(op, secondVal, env);
	}

	public AnNumber getNumber() throws Exception{
		if (this.value.getType() == ValueType.NUMBER){
			return (AnNumber) value;
		} else {
			throw new Exception("Type Mismatch exception: Expected number");
		}
	}

	public AnBoolean getBoolean() throws Exception{
		if (this.value.getType() == ValueType.BOOLEAN){
			return (AnBoolean) value;
		} else {
			throw new Exception("Type Mismatch exception: Expected boolean");
		}
	}

}
