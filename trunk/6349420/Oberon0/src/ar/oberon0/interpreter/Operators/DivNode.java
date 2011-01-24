package ar.oberon0.interpreter.Operators;

import ar.oberon0.interpreter.Memory.*;
import ar.oberon0.interpreter.Interpretable;
import ar.oberon0.interpreter.DataTypes.DataType;

public class DivNode extends BinaryNode {

	public DivNode(Interpretable leftNode, Interpretable rightNode) {
		super(leftNode, rightNode);
	}

	@Override
	public Object Interpret(Context context) throws Exception {
		return getLeftValue(context).Divide(getRightValue(context));
	}

}
