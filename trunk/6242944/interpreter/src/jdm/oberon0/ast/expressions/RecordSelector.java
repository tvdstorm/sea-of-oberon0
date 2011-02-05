package jdm.oberon0.ast.expressions;


public class RecordSelector extends Expression {
	private Expression _base;
	private String _name;
	
	public RecordSelector(Expression base, String name) {
		_base = base;
		_name = name;
	}
	
	public Expression getBase() {
		return _base;
	}

	public String getName() {
		return _name;
	}

	@Override
	public <T> T accept(ExpressionVisitor<T> visitor) {
		return visitor.visitRecordSelector(this);
	}
}
