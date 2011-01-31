package ar.oberon0.interpreter.Operators;

import ar.oberon0.interpreter.Helper;
import ar.oberon0.interpreter.Interpretable;
import ar.oberon0.interpreter.DataTypes.Value;
import ar.oberon0.interpreter.Memory.Context;

/*
 * The base class for binary nodes. Nodes that contain a right and left node. For example an add node.
 */
abstract class BinaryNode implements Interpretable {
	private Interpretable leftNode;
	private Interpretable rightNode;

	protected Interpretable getLeftExpression() {
		return this.leftNode;
	}

	protected Interpretable getRightExpression() {
		return this.rightNode;
	}

	protected BinaryNode(final Interpretable leftNode,
			final Interpretable rightNode) {
		this.leftNode = leftNode;
		this.rightNode = rightNode;
	}

	protected <T extends Value> T getLeftValue(final Context context) {
		return Helper.getValue(this.leftNode, context);
	}

	protected <T extends Value> T getRightValue(final Context context) {
		return Helper.getValue(this.rightNode, context);
	}

}
