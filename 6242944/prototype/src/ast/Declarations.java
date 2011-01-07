package ast;

import java.util.List;

public class Declarations extends Node {
	private List<Declaration> _declarations;
	
	public Declarations(List<Declaration> declarations) {
		_declarations = declarations;
	}
	
	public List<Declaration> getDeclarations() {
		return _declarations;
	}
	
	@Override
	public <T> T accept(Visitor<T> visitor) {
		return visitor.visit(this);
	}

}
