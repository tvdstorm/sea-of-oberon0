package nl.bve.uva.oberon.ast;

public class GTExprNode extends ExpressionNode {
	public GTExprNode(IInterpretableNode lhn, IInterpretableNode rhn) {
		super(lhn, rhn);
		System.out.println("GTExprNode(" +lhn+ ", " +rhn+ ")");
	}
	
	@Override
	public Boolean interpret() {
		Object lhn = getLeftHandNode().interpret();
		Object rhn = getLeftHandNode().interpret();

		assert (lhn instanceof Integer);
		assert (rhn instanceof Integer);
		
		return ((Integer)lhn) > ((Integer)rhn);
	}
}
