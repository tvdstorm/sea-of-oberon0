package nl.bve.uva.oberon.ast;

public class MinusExprNode extends ExpressionNode {
	public MinusExprNode(IInterpretableNode lhn, IInterpretableNode rhn) {
		super(lhn, rhn);
		System.out.println("MinusExprNode(" +lhn+ ", " +rhn+ ")");
	}
	
	@Override
	public Integer interpret() {
		Object lhn = getLeftHandNode().interpret();
		Object rhn = getRightHandNode().interpret();

		assert (lhn instanceof Integer);
		assert (rhn instanceof Integer);
		
		Integer result = (Integer)lhn - (Integer)rhn;
		System.out.println("MinusExprNode.interpret(" +getLeftHandNode()+ ", " +getRightHandNode()+ "): " +result);
		return result;
	}
	
	@Override
	public String toString() {
		return getClass().getSimpleName() + "(" +getLeftHandNode()+ ", " +getRightHandNode()+ ")";
	}
}
