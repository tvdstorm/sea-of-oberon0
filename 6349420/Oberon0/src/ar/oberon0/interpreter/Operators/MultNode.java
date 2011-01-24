package ar.oberon0.interpreter.Operators;

import ar.oberon0.interpreter.Interpretable;
import ar.oberon0.interpreter.DataTypes.DataType;
import ar.oberon0.interpreter.Memory.Context;

public class MultNode extends BinaryNode {

	public MultNode(Interpretable leftExpression, Interpretable rightExpression) 
	{
		super(leftExpression, rightExpression);
	}

	@Override
	public Object Interpret(Context context) throws Exception {
		return getLeftValue(context).MultiplyBy(getRightValue(context));
	}

}
