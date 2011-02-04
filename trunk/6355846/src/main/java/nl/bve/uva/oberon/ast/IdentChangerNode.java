package nl.bve.uva.oberon.ast;

import java.util.List;

public class IdentChangerNode extends IdentNode {
	public IdentChangerNode(String ident, List<IInterpretableNode> selectors ) {
		super(ident, selectors);
	}
	
	@Override
	public Object interpret() {
		// returns a unique reference to ident?!
		return null;
	}
}
