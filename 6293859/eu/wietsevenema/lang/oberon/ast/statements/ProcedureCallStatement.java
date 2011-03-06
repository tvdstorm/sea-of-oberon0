package eu.wietsevenema.lang.oberon.ast.statements;

import java.util.ArrayList;
import java.util.List;

import eu.wietsevenema.lang.oberon.ast.expressions.Expression;
import eu.wietsevenema.lang.oberon.ast.expressions.Identifier;

public class ProcedureCallStatement extends Statement {

	Identifier identifier;
	List<Expression> parameters;

	public ProcedureCallStatement(Identifier id, List<Expression> params) {
		this.identifier = id;
		this.parameters = (params != null) ? params : new ArrayList<Expression>();
	}

	public Identifier getIdentifier() {
		return identifier;
	}

	public List<Expression> getParameters() {
		return parameters;
	}

}
