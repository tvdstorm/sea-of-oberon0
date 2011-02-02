package nl.bve.uva.oberon.ast;

public class ModExprNode extends ExpressionNode {
	public ModExprNode(IInterpretableNode lhn, IInterpretableNode rhn) {
		super(lhn, rhn);
		System.out.println("ModExprNode(" +lhn+ ", " +rhn+ ")");
	}
	
	public Integer interpret() {
		Object lhn = getLeftHandNode().interpret();
		Object rhn = getLeftHandNode().interpret();

		assert (lhn instanceof Integer);
		assert (rhn instanceof Integer);
		
		return ((Integer)lhn) % ((Integer)rhn);
	}
}
