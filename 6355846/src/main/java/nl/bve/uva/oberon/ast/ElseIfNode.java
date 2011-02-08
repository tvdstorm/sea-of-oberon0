package nl.bve.uva.oberon.ast;

public class ElseIfNode implements IInterpretableNode {
	private IInterpretableNode condition;
	private IInterpretableNode body;
	private IInterpretableNode nextElse;
	
	public ElseIfNode(IInterpretableNode condition, IInterpretableNode body, IInterpretableNode nextElse) {
		this.condition = condition;
		this.body = body;
		this.nextElse = nextElse;
	}
	
	@Override
	public Object interpret() {
		if ((Boolean)condition.interpret()) {
			return body.interpret();
		} else if (nextElse != null) {
			nextElse.interpret();
		}
		
		return null;
	}
	
	@Override
	public String toString() {
		return "ElseIfNode, condition: " +condition+ ", body: " +body+ ", nextElse: " +nextElse;
	}
}
