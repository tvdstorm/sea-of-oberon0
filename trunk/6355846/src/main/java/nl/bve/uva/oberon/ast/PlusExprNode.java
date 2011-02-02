package nl.bve.uva.oberon.ast;

public class PlusExprNode extends ExpressionNode {
	public PlusExprNode(IInterpretableNode lhn, IInterpretableNode rhn) {
		super(lhn, rhn);
		System.out.println("PlusExprNode(" +lhn+ ", " +rhn+ ")");
	}
	
	@Override
	public Integer interpret() {
		Object lhn = getLeftHandNode().interpret();
		Object rhn = getLeftHandNode().interpret();

		assert (lhn instanceof Integer);
		assert (rhn instanceof Integer);
		
		return (Integer)lhn + (Integer)rhn;
	}
}
