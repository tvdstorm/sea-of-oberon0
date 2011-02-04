package nl.bve.uva.oberon.ast;

public class PlusExprNode extends ExpressionNode {
	public PlusExprNode(IInterpretableNode lhn, IInterpretableNode rhn) {
		super(lhn, rhn);
		System.out.println("PlusExprNode(" +lhn+ ", " +rhn+ ")");
	}
	
	@Override
	public Integer interpret() {
		Object lhn = getLeftHandNode().interpret();
		Object rhn = getRightHandNode().interpret();

		assert (lhn instanceof Integer);
		assert (rhn instanceof Integer);

		Integer result = (Integer)lhn + (Integer)rhn;
		System.out.println("PlusExprNode.interpret(" +getLeftHandNode()+ ", " +getRightHandNode()+ "): " +result);
		return result;
	}
	
	@Override
	public String toString() {
		return getClass().getSimpleName() + "(" +getLeftHandNode()+ ", " +getRightHandNode()+ ")";
	}
}
