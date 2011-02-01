package oberon;

import java.io.IOException;

import oberon.data.VariableManager;

public class ProcedureBody {
	private StatementSequence _statements;
	private Declaration _declaration;

	public ProcedureBody(Declaration declaration, StatementSequence statements)
	{
		_declaration = declaration;
		_statements = statements;
	}
	
	public void Eval() throws IOException
	{
		VariableManager variableManager = VariableManager.getInstance();
		variableManager.AddNewDeclaration(_declaration);
		
		_statements.Eval();
	}
}
