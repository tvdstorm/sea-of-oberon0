package nl.bve.uva.oberon.ast.expressions.binary;

import nl.bve.uva.oberon.ast.expressions.IExpressionNode;
import nl.bve.uva.oberon.env.Environment;
import nl.bve.uva.oberon.env.values.OberonValue;

public abstract class BinaryExpressionNode implements IExpressionNode {
	private IExpressionNode lhn;
	private IExpressionNode rhn;
	
	public BinaryExpressionNode(IExpressionNode lhn, IExpressionNode rhn) {
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
