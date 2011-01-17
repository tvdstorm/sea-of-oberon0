package ar.oberon0.interpreter;

public class DivNode extends BinaryNode {

	public DivNode(Interpretable leftNode, Interpretable rightNode) {
		super(leftNode, rightNode);
	}

	@Override
	public Object Interpret() throws Exception {
		return (Integer)this.getLeftExpression().Interpret() / (Integer)this.getRightExpression().Interpret();
	}

}
