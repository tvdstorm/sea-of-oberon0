package nl.bve.uva.oberon.ast.expressions;

import nl.bve.uva.oberon.ast.IInterpretableNode;

public class LTExprNode extends ExpressionNode {
	public LTExprNode(IInterpretableNode lhn, IInterpretableNode rhn) {
		super(lhn, rhn);
		System.out.println("LTExprNode(" +lhn+ ", " +rhn+ ")");
	}
	
	@Override
	public Boolean interpret() {
		Object lhn = getLeftHandNode().interpret();
		Object rhn = getRightHandNode().interpret();

		assert (lhn instanceof Integer);
		assert (rhn instanceof Integer);
		
		return ((Integer)lhn) < ((Integer)rhn);
	}
}
