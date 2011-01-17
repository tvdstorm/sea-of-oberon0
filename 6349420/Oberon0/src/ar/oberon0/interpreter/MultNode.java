package ar.oberon0.interpreter;

public class MultNode extends BinaryNode {

	public MultNode(Interpretable leftExpression,
			Interpretable rightExpression) {
		super(leftExpression, rightExpression);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Object Interpret() throws Exception {
		// TODO Auto-generated method stub
		return (Integer)this.getLeftExpression().Interpret() * (Integer)this.getRightExpression().Interpret();
	}

}
