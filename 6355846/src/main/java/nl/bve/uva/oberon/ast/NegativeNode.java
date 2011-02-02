package nl.bve.uva.oberon.ast;

public class NegativeNode implements IInterpretableNode {
	private IInterpretableNode negativeNode;
	
	public NegativeNode(IInterpretableNode negativeNode) {
		this.negativeNode = negativeNode;
		System.out.println("NegativeNode(" +negativeNode+ ")");
	}
	
	@Override
	public Object interpret() {
		Object o = negativeNode.interpret();
		
		assert (o instanceof Number);
		
		return new Double(((Number)o).toString());
	}
}
