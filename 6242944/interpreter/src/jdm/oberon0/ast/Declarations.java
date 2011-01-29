package jdm.oberon0.ast;

import java.util.List;

public class Declarations extends Node {
	private List<Declaration> _declarations;
	
	public Declarations(List<Declaration> declarations) {
		_declarations = declarations;
	}
	
	public List<Declaration> getDeclarations() {
		return _declarations;
	}
	
	public <T> void accept(Visitor<T> visitor) {
		visitor.visitDeclarations(this);
	}

}
