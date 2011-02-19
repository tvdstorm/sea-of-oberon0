package nl.bve.uva.oberon.ast.expressions.binary;

import nl.bve.uva.oberon.ast.expressions.IExpressionNode;
import nl.bve.uva.oberon.env.Environment;
import nl.bve.uva.oberon.env.values.BooleanValue;
import nl.bve.uva.oberon.env.values.IntValue;
import nl.bve.uva.oberon.env.values.OberonValue;

public class LTEqualsExprNode extends BinaryExpressionNode {
	public LTEqualsExprNode(IExpressionNode lhn, IExpressionNode rhn) {
		super(lhn, rhn);
	}
	
	@Override
	public OberonValue eval(Environment env) {
		IntValue left  = (IntValue)lhn.eval(env);
		IntValue right = (IntValue)rhn.eval(env);
		
		return new BooleanValue(left.getValue() <= right.getValue());
	}
}
