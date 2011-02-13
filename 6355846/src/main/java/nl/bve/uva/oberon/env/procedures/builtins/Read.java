package nl.bve.uva.oberon.env.procedures.builtins;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import nl.bve.uva.oberon.ast.TypedParameterList;
import nl.bve.uva.oberon.ast.TypedReferenceParameterList;
import nl.bve.uva.oberon.env.Environment;
import nl.bve.uva.oberon.env.procedures.Procedure;
import nl.bve.uva.oberon.env.types.OberonInt;
import nl.bve.uva.oberon.env.types.OberonType;

public class Read extends Procedure {
	private final String REF_VAR_STORE = "var_storage";
	
	@Override
	public List<TypedParameterList> getFormalParameters() {
		ArrayList<TypedParameterList> parameters = new ArrayList<TypedParameterList>();
		parameters.add(new TypedReferenceParameterList(Arrays.asList(new String[] {REF_VAR_STORE}) ));
		
		return parameters;
	}
	
	@Override
	public void execute(Environment env) {
		Scanner s = new Scanner(System.in);
		OberonType variable = env.getVariable(REF_VAR_STORE);
		variable.setValue(new OberonInt(s.nextInt()));
	}
}
