package oberon;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import oberon.data.AbstractDataType;
import oberon.data.IntegerArrayType;
import oberon.data.VariableManager;

class WriteCall extends AbstractStatement {
	@Override
	public void eval() throws IOException {
		final VariableManager instance = VariableManager.getInstance();
		final IntegerArrayType inputArray = (IntegerArrayType) instance.getVariable("input");
		final int index = instance.getVariable("i").getValue();
		
		System.out.println(inputArray.getValueAtIndex(index));
	}

	public static void initialize() {
		final List<FormalParamSection> params = new ArrayList<FormalParamSection>();
		List<String> paramNames = new ArrayList<String>();
		paramNames.add("i");
		params.add(new FormalParamSection(paramNames, FormalParamType.Identifier, false));
		paramNames = new ArrayList<String>();
		paramNames.add("input");
		params.add(new FormalParamSection(paramNames, FormalParamType.Array, false));
		
		final LinkedList<AbstractStatement> statements = new LinkedList<AbstractStatement>();
		statements.add(new WriteCall());
		
		final List<AbstractDataType> variables = new ArrayList<AbstractDataType>();
		final List<ProcedureHeading> procedures = new ArrayList<ProcedureHeading>();
		final Declaration declaration = new Declaration(variables, procedures);
		
		final ProcedureBody body = new ProcedureBody(declaration, new StatementSequence(statements));
		final SystemMethodCall procedure = new SystemMethodCall("Write", params, body);
		VariableManager.getInstance().addSystemProcedure(procedure);
	}
}
