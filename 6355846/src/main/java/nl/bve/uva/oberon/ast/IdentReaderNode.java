package nl.bve.uva.oberon.ast;

import java.util.List;

public class IdentReaderNode extends IdentNode {
	public IdentReaderNode(String ident, List<IInterpretableNode> selectors) {
		super(ident, selectors);
	}
	
	@Override
	public Object interpret() {
		// returns ident's value
		return null;
	}
}
