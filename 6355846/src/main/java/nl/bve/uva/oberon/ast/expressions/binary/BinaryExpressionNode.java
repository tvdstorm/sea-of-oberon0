package nl.bve.uva.oberon.ast.expressions.binary;

import nl.bve.uva.oberon.ast.expressions.ExpressionNode;
import nl.bve.uva.oberon.env.Environment;
import nl.bve.uva.oberon.env.types.OberonValue;

public abstract class BinaryExpressionNode extends ExpressionNode {
	private ExpressionNode lhn;
	private ExpressionNode rhn;
	
	public BinaryExpressionNode(ExpressionNode lhn, ExpressionNode rhn) {
		this.lhn = lhn;
		this.rhn = rhn;
	}
	
	public Integer evalLhs(Environment env) {
		return lhn.eval(env).getValue();
	}
	
	public Integer evalRhs(Environment env) {
		return rhn.eval(env).getValue();
	}
	
	@Override
	public abstract OberonValue eval(Environment env);
	
	@Override
	public String toString() {
		return getClass().getSimpleName() + "(" +lhn+ ", " +rhn+ ")";
	}
}
