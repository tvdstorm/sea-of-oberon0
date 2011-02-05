package jdm.oberon0.ast.declarations;

import jdm.oberon0.ast.Node;
import jdm.oberon0.ast.types.Type;

public class Parameter extends Node {
	private String _name;
	private Type _type;
	private boolean _byRef;
	
	public Parameter(String name, Type type, boolean byRef) {
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
	
	public Type getType() {
		return _type;
	}
}
