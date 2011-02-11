package nl.bve.uva.oberon.ast;

import java.util.List;

import nl.bve.uva.oberon.env.Environment;

public class IdentReaderNode extends IdentSelectorNode {
	public IdentReaderNode(String ident, List<IInterpretableNode> selectors) {
		super(ident, selectors);
	}
}
