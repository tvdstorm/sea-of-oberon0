package jdm.oberon0.ast;

public class IntegerLiteral extends Expression {
	protected int _value;
	
	public IntegerLiteral(int value) {
		this._value = value;
	}
	
	public int getValue() {
		return _value;
	}

	@Override
	public <T> T accept(Visitor<T> visitor) {
		return visitor.visitIntegerLiteral(this);
	}
}
