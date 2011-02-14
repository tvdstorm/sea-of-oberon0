package nl.bve.uva.oberon.env.procedures.builtins;

import java.util.List;

import nl.bve.uva.oberon.env.Environment;
import nl.bve.uva.oberon.env.procedures.Procedure;
import nl.bve.uva.oberon.shared.TypedParameterList;

public class WriteLn extends Procedure {
	@Override
	public List<TypedParameterList> getFormalParameters() {
		return null;
	}
	
	@Override
	public void execute(Environment env) {
		System.out.println();
	}
}
