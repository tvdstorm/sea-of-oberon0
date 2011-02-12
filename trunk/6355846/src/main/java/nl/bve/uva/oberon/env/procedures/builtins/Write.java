package nl.bve.uva.oberon.env.procedures.builtins;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import nl.bve.uva.oberon.env.Environment;
import nl.bve.uva.oberon.env.procedures.BuiltIn;
import nl.bve.uva.oberon.env.procedures.TypedParameterList;
import nl.bve.uva.oberon.env.procedures.TypedValueParameterList;
import nl.bve.uva.oberon.env.types.Type;

public class Write extends BuiltIn {
	private final String VAL_VAR_STORE = "var_read";
	
	@Override
	public List<TypedParameterList> getFormalParameters() {
		ArrayList<TypedParameterList> parameters = new ArrayList<TypedParameterList>();
		parameters.add(new TypedValueParameterList(Arrays.asList(new String[] {VAL_VAR_STORE}) ));
		
		return parameters;
	}
	
	@Override
	public void execute(Environment env) {
		Type variable = env.getVariable(VAL_VAR_STORE);
		System.out.print(variable.interpret(env));
		System.out.flush();
	}
}
