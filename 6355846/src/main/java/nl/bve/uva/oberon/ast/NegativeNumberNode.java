package nl.bve.uva.oberon.ast;

import nl.bve.uva.oberon.env.Environment;

public class NegativeNumberNode implements IInterpretableNode {
	private IInterpretableNode negativeNode;
	
	public NegativeNumberNode(IInterpretableNode negativeNode) {
		this.negativeNode = negativeNode;
		System.out.println("NegativeNode(" +negativeNode+ ")");
	}
	
	@Override
	public Integer interpret(Environment env) {
		Object o = negativeNode.interpret(env);
		
		assert (o instanceof Integer);
		
		return ((Integer)o) * -1;
	}
}
