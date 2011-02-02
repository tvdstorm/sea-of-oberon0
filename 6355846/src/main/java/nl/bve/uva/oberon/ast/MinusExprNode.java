package nl.bve.uva.oberon.ast;

public class MinusExprNode extends ExpressionNode {
	public MinusExprNode(IInterpretableNode lhn, IInterpretableNode rhn) {
		super(lhn, rhn);
		System.out.println("MinusExprNode(" +lhn+ ", " +rhn+ ")");
	}
	
	@Override
	public Integer interpret() {
		Object lhn = getLeftHandNode().interpret();
		Object rhn = getLeftHandNode().interpret();

		assert (lhn instanceof Integer);
		assert (rhn instanceof Integer);
		
		return (Integer)lhn - (Integer)rhn;
	}
}
