package nl.bve.uva.oberon.ast.expressions;

import nl.bve.uva.oberon.ast.IInterpretableNode;

public class EqualsExprNode extends ExpressionNode {
	public EqualsExprNode(IInterpretableNode lhn, IInterpretableNode rhn) {
		super(lhn, rhn);
		System.out.println("EqualsExprNode(" +lhn+ ", " +rhn+ ")");
	}
	
	@Override
	public Boolean interpret() {
		Object lhn = getLeftHandNode().interpret();
		Object rhn = getRightHandNode().interpret();

		boolean result = lhn.equals(rhn);
		System.out.println("Equals.interpret("+lhn+", "+rhn+"): " +result);
		return result;
	}
}
