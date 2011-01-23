package ar.oberon0.interpreter.Operators;

import ar.oberon0.interpreter.BinaryNode;
import ar.oberon0.interpreter.Memory.*;
import ar.oberon0.interpreter.Interpretable;
import ar.oberon0.interpreter.DataTypes.DataType;

public class MinNode extends BinaryNode {

	public MinNode(Interpretable leftNode, Interpretable rightNode) {
		super(leftNode, rightNode);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Object Interpret(Context context) throws Exception {
		return ((DataType)this.getLeftExpression().Interpret(context)).Subtract((DataType)this.getRightExpression().Interpret(context));
	}

}
