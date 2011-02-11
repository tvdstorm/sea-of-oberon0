package nl.bve.uva.oberon.ast.expressions;

import nl.bve.uva.oberon.ast.IInterpretableNode;
import nl.bve.uva.oberon.env.Environment;
import nl.bve.uva.oberon.env.types.OberonInt;

public abstract class ExpressionNode implements IInterpretableNode {
	private IInterpretableNode lhn;
	private IInterpretableNode rhn;
	
	public ExpressionNode(IInterpretableNode lhn, IInterpretableNode rhn) {
		this.lhn = lhn;
		this.rhn = rhn;
	}
	
	public IInterpretableNode getLeftHandNode() {
		return lhn;
	}
	
	public IInterpretableNode getRightHandNode() {
		return rhn;
	}
	
	@Override
	public abstract OberonInt interpret(Environment env);
}
