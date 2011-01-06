package ast;

public class IntegerLiteral extends Expression {
	protected int _value;
	
	public IntegerLiteral(int value) {
		this._value = value;
	}

	@Override
	public <T> T accept(Visitor<T> visitor) {
		return visitor.visit(this);
	}
	
	public int getValue() {
		return _value;
	}
}
