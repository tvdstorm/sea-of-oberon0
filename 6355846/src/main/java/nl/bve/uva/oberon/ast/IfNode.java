package nl.bve.uva.oberon.ast;

public class IfNode implements IInterpretableNode {
	private IInterpretableNode condition;
	private IInterpretableNode body;
	private IInterpretableNode ifelse;
	
	public IfNode(IInterpretableNode condition, IInterpretableNode body, IInterpretableNode ifelse) {
		System.out.println("IF-node");
		this.condition = condition;
		this.body = body;
		this.ifelse = ifelse;
	}
	
	@Override
	public Object interpret() {
		if ((Boolean)condition.interpret()) {
			body.interpret();
		} else if (ifelse != null) {
			ifelse.interpret();
		}
		
		return null;
	}

	
	@Override
	public String toString() {
		return "IfNode, condition: " +condition+ ", body: " +body+ ", else: " +ifelse;
	}
}
