package nl.bve.uva.oberon.ast.expressions;

import nl.bve.uva.oberon.ast.IInterpretableNode;

public class ModExprNode extends ExpressionNode {
	public ModExprNode(IInterpretableNode lhn, IInterpretableNode rhn) {
		super(lhn, rhn);
		System.out.println("ModExprNode(" +lhn+ ", " +rhn+ ")");
	}
	
	public Integer interpret() {
		Object lhn = getLeftHandNode().interpret();
		Object rhn = getRightHandNode().interpret();

		assert (lhn instanceof Integer);
		assert (rhn instanceof Integer);
		
		return ((Integer)lhn) % ((Integer)rhn);
	}
}
