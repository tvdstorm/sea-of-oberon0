package nl.bve.uva.oberon.ast;

import java.util.List;

public class IdentReaderNode extends IdentNode {
	public IdentReaderNode(String ident, List<IInterpretableNode> selectors) {
		super(ident, selectors);
	}
	
	@Override
	public Integer interpret() {
		// returns ident's value
		return 9;
	}
}
