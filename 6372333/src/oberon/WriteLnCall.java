package oberon;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import oberon.data.AbstractDataType;
import oberon.data.VariableManager;

class WriteLnCall extends AbstractStatement {

	@Override
	public void eval() throws IOException {
		System.out.println();
	}

	public static void initialize(){
		final List<FormalParamSection> params = new ArrayList<FormalParamSection>();
		
		final LinkedList<AbstractStatement> statements = new LinkedList<AbstractStatement>();
		statements.add(new WriteLnCall());
		
		final List<AbstractDataType> variables = new ArrayList<AbstractDataType>();
		final List<ProcedureHeading> procedures = new ArrayList<ProcedureHeading>();
		final Declaration declaration = new Declaration(variables, procedures);
		
		final ProcedureBody body = new ProcedureBody(declaration, new StatementSequence(statements));
		final SystemMethodCall procedure = new SystemMethodCall("WriteLn", params, body);
		VariableManager.getInstance().addSystemProcedure(procedure);
	}
}
