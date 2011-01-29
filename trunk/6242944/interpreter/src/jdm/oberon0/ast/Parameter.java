package jdm.oberon0.ast;

public class Parameter extends Node {
	private String _name;
	private AbstractType _type;
	private boolean _byRef;
	
	public Parameter(String name, AbstractType type, boolean byRef) {
		this._name = name;
		this._type = type;
		this._byRef = byRef;
	}
	
	public String getName() {
		return _name;
	}
	
	public boolean isByRef() {
		return _byRef;
	}
	
	public AbstractType getType() {
		return _type;
	}
}
