package ast;

import java.util.List;

public class Module extends Node {
	protected String _name;
	protected List<Declaration> _declarations;
	
	public Module(String name, List<Declaration> declarations) {
		this._name = name;
		this._declarations = declarations;
	}
	
	public String getName() {
		return _name;
	}
	public List<Declaration> getDeclarations() {
		return _declarations;
	}
}
