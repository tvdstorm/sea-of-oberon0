package nl.bve.uva.oberon.ast.expressions;

import nl.bve.uva.oberon.ast.IInterpretableNode;
import nl.bve.uva.oberon.env.Environment;
import nl.bve.uva.oberon.env.types.OberonInt;
import nl.bve.uva.oberon.env.types.Type;

public class OrExprNode extends ExpressionNode {
	public OrExprNode(IInterpretableNode lhn, IInterpretableNode rhn) {
		super(lhn, rhn);
		System.out.println("ORExprNode(" +lhn+ ", " +rhn+ ")");
	}
	
	@Override
	public OberonInt interpret(Environment env) {
		Object lhn = getLeftHandNode().interpret(env);
		Object rhn = getRightHandNode().interpret(env);

		assert (lhn instanceof Type);
		assert (rhn instanceof Type);
		
		int left  = ((Type)lhn).interpret(env);
		int right = ((Type)rhn).interpret(env);
		
		if ((left == OberonInt.TRUE) || (right == OberonInt.TRUE)) {
			return new OberonInt(OberonInt.TRUE);
		} else {
			return new OberonInt(OberonInt.FALSE);
		}
	}
}
