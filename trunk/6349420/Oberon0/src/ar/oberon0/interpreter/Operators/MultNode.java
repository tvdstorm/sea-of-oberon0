package ar.oberon0.interpreter.Operators;

import ar.oberon0.interpreter.BinaryNode;
import ar.oberon0.interpreter.Interpretable;
import ar.oberon0.interpreter.DataTypes.DataType;
import ar.oberon0.interpreter.Memory.Context;

public class MultNode extends BinaryNode {

	public MultNode(Interpretable leftExpression,
			Interpretable rightExpression) {
		super(leftExpression, rightExpression);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Object Interpret(Context context) throws Exception {
		// TODO Auto-generated method stub
		return ((DataType)this.getLeftExpression().Interpret(context)).MultiplyBy((DataType)this.getRightExpression().Interpret(context));
	}

}
