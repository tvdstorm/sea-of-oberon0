package nl.bve.uva.oberon.ast.expressions.binary;

import nl.bve.uva.oberon.ast.expressions.ExpressionNode;
import nl.bve.uva.oberon.env.Environment;
import nl.bve.uva.oberon.env.values.IntValue;

public class PlusExprNode extends BinaryExpressionNode {
	public PlusExprNode(ExpressionNode lhn, ExpressionNode rhn) {
		super(lhn, rhn);
	}
	
	@Override
	public IntValue eval(Environment env) {
		int left = evalLhs(env);
		int right = evalRhs(env);
		
		return new IntValue(left + right);
	}
}