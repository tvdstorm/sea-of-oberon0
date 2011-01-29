package jdm.oberon0.ast;

public class Identifier extends Expression {
	private String _name;
	
	public Identifier(String name) {
		_name = name;
	}
	
	public String getName() {
		return _name;
	}
	
	@Override
	public <T> T accept(Visitor<T> visitor) {
		return visitor.visitIdentifier(this);
	}

}
