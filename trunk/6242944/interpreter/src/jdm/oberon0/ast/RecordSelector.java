package jdm.oberon0.ast;

public class RecordSelector extends Expression {
	private Expression _base;
	private String _name;
	
	public RecordSelector(Expression base, String name) {
		_base = base;
		_name = name;
	}
	
	@Override
	public <T> T accept(Visitor<T> visitor) {
		return visitor.visit(this);
	}

	public Expression getBase() {
		return _base;
	}

	public String getName() {
		return _name;
	}

}
