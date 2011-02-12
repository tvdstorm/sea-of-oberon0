package nl.bve.uva.oberon.env.procedures.builtins;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import nl.bve.uva.oberon.ast.TypedParameterList;
import nl.bve.uva.oberon.ast.TypedReferenceParameterList;
import nl.bve.uva.oberon.env.Environment;
import nl.bve.uva.oberon.env.procedures.Procedure;
import nl.bve.uva.oberon.env.types.OberonInt;
import nl.bve.uva.oberon.env.types.Type;

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
		try {
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			
			Type variable = env.getVariable(REF_VAR_STORE);
			variable.setValue(new OberonInt(Integer.parseInt(br.readLine())));
		} catch (IOException ioe) {
			throw new RuntimeException("Procedure Read: Error while reading from System.in: " +ioe.getMessage());
		}
	}
}
