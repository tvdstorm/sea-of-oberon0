package oberon;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import oberon.data.IntegerArrayType;
import oberon.procedures.SystemMethodCall;

class WriteCall implements IStatement {
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
		
		final LinkedList<IStatement> statements = new LinkedList<IStatement>();
		statements.add(new WriteCall());
		
		final List<IDataType> variables = new ArrayList<IDataType>();
		final List<IProcedure> procedures = new ArrayList<IProcedure>();
		final Declaration declaration = new Declaration(variables, procedures);
		
		final ProcedureBody body = new ProcedureBody(declaration, new StatementSequence(statements));
		final SystemMethodCall procedure = new SystemMethodCall("Write", params, body);
		VariableManager.getInstance().addSystemProcedure(procedure);
	}
}
