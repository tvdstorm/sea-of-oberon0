package nl.bve.uva.oberon.ast;

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
}
