package nl.bve.uva.oberon.ast.expressions.binary;

import nl.bve.uva.oberon.ast.expressions.ExpressionNode;
import nl.bve.uva.oberon.env.Environment;
import nl.bve.uva.oberon.env.types.OberonInt;

public class MultExprNode extends BinaryExpressionNode {
	public MultExprNode(ExpressionNode lhn, ExpressionNode rhn) {
		super(lhn, rhn);
	}
	
	public OberonInt eval(Environment env) {
		int left = evalLhs(env);
		int right = evalRhs(env);
		
		return new OberonInt(left * right);
	}
}