package ar.oberon0.interpreter;

public class MinNode extends BinaryNode {

	public MinNode(Interpretable leftNode, Interpretable rightNode) {
		super(leftNode, rightNode);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Object Interpret() throws Exception {
		return (Integer)this.getLeftExpression().Interpret() - (Integer)this.getRightExpression().Interpret();
	}

}
