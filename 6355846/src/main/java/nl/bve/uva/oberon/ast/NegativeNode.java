package nl.bve.uva.oberon.ast;

import nl.bve.uva.oberon.env.Environment;

public class NegativeNode implements IInterpretableNode {
	private IInterpretableNode negativeNode;
	
	public NegativeNode(IInterpretableNode negativeNode) {
		this.negativeNode = negativeNode;
		System.out.println("NegativeNode(" +negativeNode+ ")");
	}
	
	@Override
	public Object interpret(Environment env) {
		Object o = negativeNode.interpret(env);
		
		assert (o instanceof Number);
		
		return new Double(((Number)o).toString());
	}
}
