package nl.bve.uva.oberon.ast.expressions.binary;

import nl.bve.uva.oberon.ast.expressions.IExpressionNode;
import nl.bve.uva.oberon.env.Environment;
import nl.bve.uva.oberon.env.values.IntValue;
import nl.bve.uva.oberon.env.values.OberonValue;

public class MultExprNode extends BinaryExpressionNode {
	public MultExprNode(IExpressionNode lhn, IExpressionNode rhn) {
		super(lhn, rhn);
	}
	
	@Override
	public OberonValue eval(Environment env) {
		IntValue left  = (IntValue)lhn.eval(env);
		IntValue right = (IntValue)rhn.eval(env);
		
		return new IntValue(left.getValue() * right.getValue());
	}
}