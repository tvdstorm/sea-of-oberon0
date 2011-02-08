package nl.bve.uva.oberon.ast;

public class ArrayTypeNode implements IInterpretableNode {
	private IInterpretableNode expression;
	private IInterpretableNode arrayType;
	
	public ArrayTypeNode(IInterpretableNode expression, IInterpretableNode arrayType) {
		this.expression = expression;
		this.arrayType = arrayType;
	}
	
	@Override
	public Object interpret() {
		// TODO Auto-generated method stub
		return null;
	}
}
