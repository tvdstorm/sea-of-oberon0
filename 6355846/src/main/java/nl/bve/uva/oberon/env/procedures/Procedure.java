package nl.bve.uva.oberon.env.procedures;

import java.util.List;

import nl.bve.uva.oberon.ast.IInterpretableNode;
import nl.bve.uva.oberon.env.Environment;

public interface Procedure {
	public void callProcedure(Environment env, List<IInterpretableNode> ap);
}
