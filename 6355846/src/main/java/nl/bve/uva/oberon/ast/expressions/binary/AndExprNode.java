package nl.bve.uva.oberon.ast.expressions.binary;

import nl.bve.uva.oberon.ast.expressions.IExpressionNode;
import nl.bve.uva.oberon.env.Environment;
import nl.bve.uva.oberon.env.values.BooleanValue;
import nl.bve.uva.oberon.env.values.OberonValue;

public class AndExprNode extends BinaryExpressionNode {
	public AndExprNode(IExpressionNode lhn, IExpressionNode rhn) {
		super(lhn, rhn);
	}
	
	@Override
	public OberonValue eval(Environment env) {
		BooleanValue left  = (BooleanValue)lhn.eval(env);
		BooleanValue right = (BooleanValue)rhn.eval(env);
		
		return new BooleanValue(left.getValue() && right.getValue());
	}
}
