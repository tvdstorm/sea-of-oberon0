package nl.bve.uva.oberon.ast;

import java.util.List;

public class IdentChangerNode extends IdentSelectorNode {
	public IdentChangerNode(String ident, List<IInterpretableNode> selectors ) {
		super(ident, selectors);
	}
}
