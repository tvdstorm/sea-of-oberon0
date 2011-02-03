package ar.oberon0.interpreter.Operators;

import ar.oberon0.interpreter.Interpretable;
import ar.oberon0.interpreter.TechnicalException;
import ar.oberon0.interpreter.DataTypes.ArithmeticValue;
import ar.oberon0.interpreter.Memory.Context;

public class MultNode extends BinaryNode {
	public MultNode(final Interpretable leftExpression, final Interpretable rightExpression) {
		super(leftExpression, rightExpression);
	}

	@Override
	public final Object interpret(final Context context) throws TechnicalException {
		return this.<ArithmeticValue> getLeftValue(context).multiplyBy(this.<ArithmeticValue> getRightValue(context));
	}

}
