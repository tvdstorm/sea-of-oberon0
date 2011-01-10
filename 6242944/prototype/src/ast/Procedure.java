package ast;

import java.util.List;

import runtime.ScriptedProcedure;

public class Procedure extends Declaration {
	protected String _name;
	protected Declarations _declarations;
	protected StatementSequence _statements;
	
	public Procedure(String name, Declarations declarations, StatementSequence statements) {
		this._name = name;
		this._declarations = declarations;
		this._statements = statements;
	}

	@Override
	public <T> T accept(Visitor<T> visitor) {
		return visitor.visit(this);
	}

	public String getName() {
		return _name;
	}

	public StatementSequence getStatements() {
		return _statements;
	}

	public Declarations getDeclarations() {
		return _declarations;
	}
}
