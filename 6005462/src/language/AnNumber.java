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
	public AnValue eval(AnEnvironment env){
		throw new UnsupportedOperationException();
	}

	@Override
	public ValueType getType() {
		return ValueType.NUMBER;
	}

	@Override
	public AnValue operate(int op, AnValue secondVal, AnEnvironment env) throws Exception {
		if (secondVal == null) {
			return operateSingle(op);
		}
		if (secondVal.getType() != ValueType.NUMBER)  throw new Exception("Typemismatch exception");
		AnNumber secondNumber = secondVal.getNumber();
		
		switch(op){
			case oberonLexer.PLUS:
				return new AnValue(this.getValue() + secondNumber.getValue());
			case oberonLexer.MIN:
				return new AnValue(this.getValue() - secondNumber.getValue());
			case oberonLexer.MULT:
				return new AnValue(this.getValue() * secondNumber.getValue());
			case oberonLexer.DIV:
				return new AnValue(this.getValue() / secondNumber.getValue());
			case oberonLexer.MOD:
				return new AnValue(this.getValue() % secondNumber.getValue());
			case oberonLexer.AMP:
				return new AnValue(this.getValue() & secondNumber.getValue());
			case oberonLexer.EQ:
				return new AnValue(this.getValue() == secondNumber.getValue());
			case oberonLexer.GTEQ:
				return new AnValue(this.getValue() >= secondNumber.getValue());
			case oberonLexer.LTEQ:
				return new AnValue(this.getValue() <= secondNumber.getValue());
			case oberonLexer.LT:
				return new AnValue(this.getValue() < secondNumber.getValue());
			case oberonLexer.GT:
				return new AnValue(this.getValue() > secondNumber.getValue());
			case oberonLexer.HASH:
				return new AnValue(this.getValue() != secondNumber.getValue());
			default: throw new UnsupportedOperationException();
		}
	}
	
	private AnValue operateSingle(int op){
		switch(op){
			case oberonLexer.PLUS: return new AnValue(this.getValue()); 
			case oberonLexer.MIN: return new AnValue(-this.getValue());
			default: throw new UnsupportedOperationException();
		}
	}

}
