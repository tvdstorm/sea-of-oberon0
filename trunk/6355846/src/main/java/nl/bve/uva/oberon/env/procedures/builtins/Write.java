package nl.bve.uva.oberon.env.procedures.builtins;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import nl.bve.uva.oberon.ast.TypedParameterList;
import nl.bve.uva.oberon.ast.TypedValueParameterList;
import nl.bve.uva.oberon.env.Environment;
import nl.bve.uva.oberon.env.procedures.Procedure;
import nl.bve.uva.oberon.env.types.OberonType;

public class Write extends Procedure {
	private final String VAL_VAR_STORE = "var_read";
	
	@Override
	public List<TypedParameterList> getFormalParameters() {
		ArrayList<TypedParameterList> parameters = new ArrayList<TypedParameterList>();
		parameters.add(new TypedValueParameterList(Arrays.asList(new String[] {VAL_VAR_STORE}) ));
		
		return parameters;
	}
	
	@Override
	public void execute(Environment env) {
		OberonType variable = env.getVariable(VAL_VAR_STORE);
		System.out.print(variable.getValue());
		System.out.flush();
	}
}
