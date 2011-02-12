package nl.bve.uva.oberon.env.procedures.builtins;

import java.util.List;

import nl.bve.uva.oberon.env.Environment;
import nl.bve.uva.oberon.env.procedures.BuiltInProcedure;
import nl.bve.uva.oberon.env.procedures.TypedParameterList;

public class WriteLn extends BuiltInProcedure {
	@Override
	public List<TypedParameterList> getFormalParameters() {
		return null;
	}
	
	@Override
	public void execute(Environment env) {
		System.out.println();
	}
}
