package nl.bve.uva.oberon.ast;

public class EqualsExprNode extends ExpressionNode {
	public EqualsExprNode(IInterpretableNode lhn, IInterpretableNode rhn) {
		super(lhn, rhn);
		System.out.println("EqualsExprNode(" +lhn+ ", " +rhn+ ")");
	}
	
	@Override
	public Boolean interpret() {
		Object lhn = getLeftHandNode().interpret();
		Object rhn = getLeftHandNode().interpret();

		assert (lhn instanceof Boolean);
		assert (rhn instanceof Boolean);
		
		return ((Boolean)lhn).equals((Boolean)rhn);
	}
}
