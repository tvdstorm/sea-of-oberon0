package nl.bve.uva.oberon.ast.expressions;

import nl.bve.uva.oberon.ast.IInterpretableNode;
import nl.bve.uva.oberon.env.Environment;
import nl.bve.uva.oberon.env.types.OberonInt;
import nl.bve.uva.oberon.env.types.OberonType;

public class LTEqualsExprNode extends ExpressionNode {
	public LTEqualsExprNode(IInterpretableNode lhn, IInterpretableNode rhn) {
		super(lhn, rhn);
	}
	
	@Override
	public OberonInt interpret(Environment env) {
		int left = getLeftHandValue(env);
		int right = getRightHandValue(env);
		
		if (left <= right) {
			return new OberonInt(OberonInt.TRUE);
		} else {
			return new OberonInt(OberonInt.FALSE);
		}
	}
}
