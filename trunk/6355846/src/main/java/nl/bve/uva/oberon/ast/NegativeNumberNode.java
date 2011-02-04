package nl.bve.uva.oberon.ast;

public class NegativeNumberNode implements IInterpretableNode {
	private IInterpretableNode negativeNode;
	
	public NegativeNumberNode(IInterpretableNode negativeNode) {
		this.negativeNode = negativeNode;
		System.out.println("NegativeNode(" +negativeNode+ ")");
	}
	
	@Override
	public Integer interpret() {
		Object o = negativeNode.interpret();
		
		assert (o instanceof Integer);
		
		return ((Integer)o) * -1;
	}
}
