package nl.bve.uva.oberon.env.procedures.builtins;

import java.util.List;

import nl.bve.uva.oberon.ast.TypedParameterList;
import nl.bve.uva.oberon.env.Environment;
import nl.bve.uva.oberon.env.procedures.BuiltInProcedure;

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
