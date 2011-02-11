package nl.bve.uva.oberon.env;

import java.util.List;

import nl.bve.uva.oberon.ast.IInterpretableNode;

public interface Procedure extends IInterpretableNode {
	public void setActualParameters(List<IInterpretableNode> fp);
}
