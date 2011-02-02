package nl.bve.uva.oberon.ast;

public class AndExprNode extends ExpressionNode {
	public AndExprNode(IInterpretableNode lhn, IInterpretableNode rhn) {
		super(lhn, rhn);
		System.out.println("AndExprNode(" +lhn+ ", " +rhn+ ")");
	}
	
	@Override
	public Boolean interpret() {
		Object lhn = getLeftHandNode().interpret();
		Object rhn = getLeftHandNode().interpret();

		assert (lhn instanceof Boolean);
		assert (rhn instanceof Boolean);
		
		return ((Boolean)lhn) && ((Boolean)rhn);
	}
}
