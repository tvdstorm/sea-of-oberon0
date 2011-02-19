package nl.bve.uva.oberon.ast.expressions.binary;

import nl.bve.uva.oberon.ast.expressions.ExpressionNode;
import nl.bve.uva.oberon.env.Environment;
import nl.bve.uva.oberon.env.values.IntValue;

public class AndExprNode extends BinaryExpressionNode {
	public AndExprNode(ExpressionNode lhn, ExpressionNode rhn) {
		super(lhn, rhn);
	}
	
	@Override
	public IntValue eval(Environment env) {
		int left = evalLhs(env);
		int right = evalRhs(env);
		
		if (left == IntValue.TRUE && right == IntValue.TRUE) {
			return new IntValue(IntValue.TRUE);
		} else {
			return new IntValue(IntValue.FALSE);
		}
	}
}
