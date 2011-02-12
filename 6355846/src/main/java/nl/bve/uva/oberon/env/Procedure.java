package nl.bve.uva.oberon.env;

import java.util.List;

import nl.bve.uva.oberon.ast.IInterpretableNode;

public interface Procedure {
	public void callProcedure(Environment env, List<IInterpretableNode> ap);
}
