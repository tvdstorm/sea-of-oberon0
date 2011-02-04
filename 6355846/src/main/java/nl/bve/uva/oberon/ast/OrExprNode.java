package nl.bve.uva.oberon.ast;

public class OrExprNode extends ExpressionNode {
	public OrExprNode(IInterpretableNode lhn, IInterpretableNode rhn) {
		super(lhn, rhn);
		System.out.println("ORExprNode(" +lhn+ ", " +rhn+ ")");
	}
	
	@Override
	public Boolean interpret() {
		Object lhn = getLeftHandNode().interpret();
		Object rhn = getRightHandNode().interpret();

		assert (lhn instanceof IInterpretableNode);
		assert (rhn instanceof IInterpretableNode);
		
		return ((Boolean)getLeftHandNode().interpret()) || ((Boolean)getRightHandNode().interpret());
	}
}
