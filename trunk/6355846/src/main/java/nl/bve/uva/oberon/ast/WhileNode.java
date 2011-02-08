package nl.bve.uva.oberon.ast;

public class WhileNode implements IInterpretableNode {
	private IInterpretableNode condition;
	private IInterpretableNode body;
	
	public WhileNode(IInterpretableNode condition, IInterpretableNode body) {
		this.condition = condition;
		this.body = body;
	}
	
	@Override
	public Object interpret() {
		if ((Boolean)condition.interpret()) {
			body.interpret();
		}
		
		return null;
	}
}
