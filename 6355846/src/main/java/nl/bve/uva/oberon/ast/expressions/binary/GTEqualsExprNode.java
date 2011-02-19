package nl.bve.uva.oberon.ast.expressions.binary;

import nl.bve.uva.oberon.ast.expressions.IExpressionNode;
import nl.bve.uva.oberon.env.Environment;
import nl.bve.uva.oberon.env.values.IntValue;

public class GTEqualsExprNode extends BinaryExpressionNode {
	public GTEqualsExprNode(IExpressionNode lhn, IExpressionNode rhn) {
		super(lhn, rhn);
	}
	
	@Override
	public IntValue eval(Environment env) {
		int left = evalLhs(env);
		int right = evalRhs(env);
		
		if (left >= right) {
			return new IntValue(IntValue.TRUE);
		} else {
			return new IntValue(IntValue.FALSE);
		}	
	}
}
