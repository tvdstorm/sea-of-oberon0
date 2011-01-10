package ast;

public class Parameter extends Node {
	private String _name;
	private Type _type;
	private boolean _byRef;
	
	public Parameter(String name, Type type, boolean byRef) {
		this._name = name;
		this._type = type;
		this._byRef = byRef;
	}
	
	@Override
	public <T> T accept(Visitor<T> visitor) {
		// TODO Auto-generated method stub
		return null;
	}

	public String getName() {
		return _name;
	}
	
	public boolean isByRef() {
		return _byRef;
	}
}
