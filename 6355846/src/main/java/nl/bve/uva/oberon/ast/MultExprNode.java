package nl.bve.uva.oberon.ast;

public class MultExprNode extends ExpressionNode {
	public MultExprNode(IInterpretableNode lhn, IInterpretableNode rhn) {
		super(lhn, rhn);
		System.out.println("MultExprNode(" +lhn+ ", " +rhn+ ")");
	}
	
	public Double interpret() {
		Object lhn = getLeftHandNode().interpret();
		Object rhn = getLeftHandNode().interpret();

		assert (lhn instanceof Integer);
		assert (rhn instanceof Integer);
		
		return ((Integer)lhn * 1.0) * ((Integer)rhn * 1.0);
	}
}
