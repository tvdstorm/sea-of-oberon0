package nl.bve.uva.oberon.ast.expressions;

import nl.bve.uva.oberon.ast.IInterpretableNode;

public class MultExprNode extends ExpressionNode {
	public MultExprNode(IInterpretableNode lhn, IInterpretableNode rhn) {
		super(lhn, rhn);
		System.out.println("MultExprNode(" +lhn+ ", " +rhn+ ")");
	}
	
	public Integer interpret() {
		Object lhn = getLeftHandNode().interpret();
		Object rhn = getRightHandNode().interpret();

		assert (lhn instanceof Integer);
		assert (rhn instanceof Integer);
		
		
		Integer result = ((Integer)lhn) * ((Integer)rhn);
		System.out.println("MultExprNode.interpret(): " +result);
		return result;
	}
	
	@Override
	public String toString() {
		return getClass().getSimpleName() + "(" +getLeftHandNode()+ ", " +getRightHandNode()+ ")";
	}
}
