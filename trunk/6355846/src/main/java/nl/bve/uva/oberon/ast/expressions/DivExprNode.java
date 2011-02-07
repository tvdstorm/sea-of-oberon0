package nl.bve.uva.oberon.ast.expressions;

import nl.bve.uva.oberon.ast.IInterpretableNode;

public class DivExprNode extends ExpressionNode {
	public DivExprNode(IInterpretableNode lhn, IInterpretableNode rhn) {
		super(lhn, rhn);
		System.out.println("DivExprNode(" +lhn+ ", " +rhn+ ")");
	}
	
	@Override
	public Integer interpret() {
		Object lhn = getLeftHandNode().interpret();
		Object rhn = getRightHandNode().interpret();

		assert (lhn instanceof Integer);
		assert (rhn instanceof Integer);
		
		return (Integer)lhn / (Integer)rhn;
	}
	
	@Override
	public String toString() {
		return getClass().getSimpleName() + "(" +getLeftHandNode()+ ", " +getRightHandNode()+ ")";
	}
}