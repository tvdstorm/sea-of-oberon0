package ar.oberon0.interpreter;

public class ModNode extends BinaryNode {

	public ModNode(Interpretable leftNode, Interpretable rightNode) {
		super(leftNode, rightNode);
	}

	@Override
	public Object Interpret() throws Exception {
		return (Integer)this.getLeftExpression().Interpret() % (Integer)this.getRightExpression().Interpret();
	}

}
