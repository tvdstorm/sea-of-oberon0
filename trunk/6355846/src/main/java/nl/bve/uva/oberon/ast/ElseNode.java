package nl.bve.uva.oberon.ast;

public class ElseNode implements IInterpretableNode {
	private IInterpretableNode body;
	
	public ElseNode(IInterpretableNode body) {
		this.body = body;
	}
	
	@Override
	public Object interpret() {
		return body.interpret();
	}
	
	@Override
	public String toString() {
		return "ElseNode, body: " +body;
	}
}
