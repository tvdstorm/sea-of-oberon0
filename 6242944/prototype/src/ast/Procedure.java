package ast;

import java.util.List;

public class Procedure extends Declaration {
	protected String _name;
	protected List<Statement> _statements;
	
	public Procedure(String name, List<Statement> statements) {
		this._name = name;
		this._statements = statements;
		System.out.println(name);
	}

	@Override
	public <T> T accept(Visitor<T> visitor) {
		return null;
	}
}
