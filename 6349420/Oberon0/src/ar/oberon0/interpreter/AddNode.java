package ar.oberon0.interpreter;

public class AddNode extends BinaryNode {

	public AddNode(Interpretable leftNode, Interpretable rightNode) {
		super(leftNode, rightNode);
	}

	@Override
	public Object Interpret() throws Exception {
		return (Integer)this.getLeftExpression().Interpret() + (Integer)this.getRightExpression().Interpret();
	}

}
