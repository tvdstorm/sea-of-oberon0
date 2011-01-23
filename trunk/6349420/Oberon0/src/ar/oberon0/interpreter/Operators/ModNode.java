package ar.oberon0.interpreter.Operators;

import ar.oberon0.interpreter.BinaryNode;
import ar.oberon0.interpreter.Memory.*;
import ar.oberon0.interpreter.Interpretable;
import ar.oberon0.interpreter.DataTypes.DataType;

public class ModNode extends BinaryNode {

	public ModNode(Interpretable leftNode, Interpretable rightNode) {
		super(leftNode, rightNode);
	}

	@Override
	public Object Interpret(Context context) throws Exception {
		return ((DataType)this.getLeftExpression().Interpret(context)).Modulo((DataType)this.getRightExpression().Interpret(context));
	}

}
