package ast;

import java.util.List;

public class Procedure extends Declaration {
	protected String _name;
	protected List<ast.Parameter> _parameters;
	protected Declarations _declarations;
	protected StatementSequence _statements;
	
	public Procedure(String name, List<ast.Parameter> parameters, Declarations declarations, StatementSequence statements) {
		this._name = name;
		this._parameters = parameters;
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

	public List<Parameter> getParameters() {
		return _parameters;
	}
}
