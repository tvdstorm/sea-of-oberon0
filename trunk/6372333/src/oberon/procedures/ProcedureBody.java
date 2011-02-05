package oberon.procedures;

import java.io.IOException;

import oberon.StatementSequence;
import oberon.VariableManager;


public class ProcedureBody {
	private final StatementSequence body;
	private final Declaration variableDeclaration;

	public ProcedureBody(final Declaration declaration, final StatementSequence statements) {
		variableDeclaration = declaration;
		body = statements;
	}
	
	public void eval() throws IOException {
		final VariableManager variableManager = VariableManager.getInstance();
		variableManager.addNewDeclaration(variableDeclaration);
		
		body.eval();
	}
}
