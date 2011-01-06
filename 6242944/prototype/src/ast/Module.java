package ast;

import java.util.List;

public class Module extends Node {
	protected String _name;
	protected List<Declaration> _declarations;
	protected List<Expression> _statements;
	
	public Module(String name, List<Declaration> declarations, List<Expression> statements) {
		this._name = name;
		this._declarations = declarations;
		this._statements = statements;
	}
	
	public String getName() {
		return _name;
	}
	public List<Declaration> getDeclarations() {
		return _declarations;
	}
	public List<Expression> getStatements() {
		return _statements;
	}

	@Override
	public <T> T accept(Visitor<T> visitor) {
		return visitor.visit(this);
	}
}
