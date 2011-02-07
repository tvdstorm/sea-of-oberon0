package jdm.oberon0.ast.declarations;

import java.util.List;

import jdm.oberon0.ast.statements.StatementSequence;

public class ProcedureDeclaration extends Declaration {
	protected String _name;
	protected List<jdm.oberon0.ast.declarations.Parameter> _parameters;
	protected Declarations _declarations;
	protected StatementSequence _statements;
	
	public ProcedureDeclaration(String name, List<jdm.oberon0.ast.declarations.Parameter> parameters, Declarations declarations, StatementSequence statements) {
		this._name = name;
		this._parameters = parameters;
		this._declarations = declarations;
		this._statements = statements;
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
	
	@Override
	public void accept(DeclarationVisitor visitor) {
		visitor.visitProcedure(this);
	}
}
