package ar.oberon0.interpreter.Operators;

import ar.oberon0.interpreter.Helper;
import ar.oberon0.interpreter.Memory.*;
import ar.oberon0.interpreter.Interpretable;
import ar.oberon0.interpreter.DataTypes.DataType;

public class AddNode extends BinaryNode {

	public AddNode(Interpretable leftNode, Interpretable rightNode) {
		super(leftNode, rightNode);
	}

	@Override
	public Object Interpret(Context context) throws Exception 
	{
		return getLeftValue(context).Add(getRightValue(context));
	}

}
