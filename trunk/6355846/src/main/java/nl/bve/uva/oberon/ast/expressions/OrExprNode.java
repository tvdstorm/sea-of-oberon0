package nl.bve.uva.oberon.ast.expressions;

import nl.bve.uva.oberon.ast.IInterpretableNode;
import nl.bve.uva.oberon.env.Environment;
import nl.bve.uva.oberon.env.types.OberonInt;

public class OrExprNode extends BinaryExpressionNode {
	public OrExprNode(IInterpretableNode lhn, IInterpretableNode rhn) {
		super(lhn, rhn);
	}
	
	@Override
	public OberonInt interpret(Environment env) {
		int left = evalLhs(env);
		int right = evalRhs(env);
		
		if ((left == OberonInt.TRUE) || (right == OberonInt.TRUE)) {
			return new OberonInt(OberonInt.TRUE);
		} else {
			return new OberonInt(OberonInt.FALSE);
		}
	}
}
