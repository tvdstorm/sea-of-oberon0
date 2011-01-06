package ast;

public class IntegerLiteral extends Expression {
	protected int _value;
	
	public IntegerLiteral(int value) {
		this._value = value;
	}
}
