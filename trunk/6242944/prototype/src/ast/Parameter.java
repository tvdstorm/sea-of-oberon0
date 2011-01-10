package ast;

public class Parameter extends Node {
	private String _name;
	private Type _type;
	
	public Parameter(String name, Type type) {
		this._name = name;
		this._type = type;
	}
	
	@Override
	public <T> T accept(Visitor<T> visitor) {
		// TODO Auto-generated method stub
		return null;
	}

}
