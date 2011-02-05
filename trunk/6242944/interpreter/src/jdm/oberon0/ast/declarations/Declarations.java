package jdm.oberon0.ast.declarations;

import java.util.List;

import jdm.oberon0.ast.Node;

public class Declarations extends Node {
	private List<Declaration> _declarations;
	
	public Declarations(List<Declaration> declarations) {
		_declarations = declarations;
	}
	
	public List<Declaration> getDeclarations() {
		return _declarations;
	}
	
	public void accept(DeclarationVisitor visitor) {
		visitor.visitDeclarations(this);
	}

}
