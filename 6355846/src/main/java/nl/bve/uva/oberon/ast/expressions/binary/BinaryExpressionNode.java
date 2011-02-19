package nl.bve.uva.oberon.ast.expressions.binary;

import nl.bve.uva.oberon.ast.expressions.IExpressionNode;

public abstract class BinaryExpressionNode implements IExpressionNode {
	protected IExpressionNode lhn;
	protected IExpressionNode rhn;
	
	public BinaryExpressionNode(IExpressionNode lhn, IExpressionNode rhn) {
		this.lhn = lhn;
		this.rhn = rhn;
	}
}
