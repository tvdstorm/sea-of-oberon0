package jdm.oberon0.ast;

public class Module extends Node {
	protected String _name;
	protected Declarations _declarations;
	protected StatementSequence _statements;
	
	public Module(String name, Declarations declarations, StatementSequence statements) {
		this._name = name;
		this._declarations = declarations;
		this._statements = statements;
	}
	
	public String getName() {
		return _name;
	}
	public Declarations getDeclarations() {
		return _declarations;
	}
	public StatementSequence getStatements() {
		return _statements;
	}

	public <T> void accept(Visitor<T> visitor) {
		visitor.visitModule(this);
	}
}
