package nl.bve.uva.oberon.ast;

public class DivExprNode extends ExpressionNode {
	public DivExprNode(IInterpretableNode lhn, IInterpretableNode rhn) {
		super(lhn, rhn);
		System.out.println("DivExprNode(" +lhn+ ", " +rhn+ ")");
	}
	
	@Override
	public Integer interpret() {
		Object lhn = getLeftHandNode().interpret();
		Object rhn = getLeftHandNode().interpret();

		assert (lhn instanceof Integer);
		assert (rhn instanceof Integer);
		
		return (Integer)lhn / (Integer)rhn;
	}
}