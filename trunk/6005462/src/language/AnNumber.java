package language;

import language.parser.oberonLexer;

public class AnNumber implements IType {
	private int value;
	
	public AnNumber(int number){
		this.value = number;
	}
	
	public int getValue(){
		return this.value;
	}
	
	@Override
	public AnValue eval(){
		throw new UnsupportedOperationException();
	}

	@Override
	public ValueType getType() {
		return ValueType.NUMBER;
	}

	@Override
	public AnValue operate(int op, AnValue secondVal) throws Exception {
		if (secondVal == null) {
			return operateSingle(op);
		}
		if (secondVal.getType() != ValueType.NUMBER)  throw new Exception("Typemismatch exception");
		AnNumber secondNumber = secondVal.getNumber();
		
		int newval;
		switch(op){
			case oberonLexer.PLUS:
				newval = this.getValue() + secondNumber.getValue(); break;
			case oberonLexer.MIN:
				newval = this.getValue() - secondNumber.getValue(); break;
			case oberonLexer.MULT:
				newval = this.getValue() * secondNumber.getValue(); break;
			case oberonLexer.DIV:
				newval = this.getValue() / secondNumber.getValue(); break;
			case oberonLexer.MOD:
				newval = this.getValue() % secondNumber.getValue(); break;
			case oberonLexer.AMP:
				newval = this.getValue() & secondNumber.getValue(); break;
			default: throw new UnsupportedOperationException();
		}
		
		return new AnValue(newval);
	}
	
	private AnValue operateSingle(int op){
		switch(op){
			case oberonLexer.PLUS: return new AnValue(this.getValue()); 
			case oberonLexer.MIN: return new AnValue(-this.getValue());
			default: throw new UnsupportedOperationException();
		}
	}

}
