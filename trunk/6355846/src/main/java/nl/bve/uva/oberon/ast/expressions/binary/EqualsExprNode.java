package nl.bve.uva.oberon.ast.expressions.binary;

import nl.bve.uva.oberon.ast.expressions.IExpressionNode;
import nl.bve.uva.oberon.env.Environment;
import nl.bve.uva.oberon.env.values.BooleanValue;
import nl.bve.uva.oberon.env.values.OberonValue;

public class EqualsExprNode extends BinaryExpressionNode {
	public EqualsExprNode(IExpressionNode lhn, IExpressionNode rhn) {
		super(lhn, rhn);
	}
	
	@Override
	public BooleanValue eval(Environment env) {
		OberonValue left  = lhn.eval(env);
		OberonValue right = rhn.eval(env);
		
		return new BooleanValue(left.getValue().equals(right.getValue()));
	}
}
