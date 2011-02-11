package nl.bve.uva.oberon.ast.expressions;

import nl.bve.uva.oberon.ast.IInterpretableNode;
import nl.bve.uva.oberon.env.Environment;
import nl.bve.uva.oberon.env.types.OberonInt;
import nl.bve.uva.oberon.env.types.Type;

public class DivExprNode extends ExpressionNode {
	public DivExprNode(IInterpretableNode lhn, IInterpretableNode rhn) {
		super(lhn, rhn);
		System.out.println("DivExprNode(" +lhn+ ", " +rhn+ ")");
	}
	
	@Override
	public OberonInt interpret(Environment env) {
		Object lhn = getLeftHandNode().interpret(env);
		Object rhn = getRightHandNode().interpret(env);

		assert (lhn instanceof Type);
		assert (rhn instanceof Type);
		
		int left  = ((Type)lhn).interpret(env);
		int right = ((Type)rhn).interpret(env);
		
		return new OberonInt(left / right);
	}
	
	@Override
	public String toString() {
		return getClass().getSimpleName() + "(" +getLeftHandNode()+ ", " +getRightHandNode()+ ")";
	}
}