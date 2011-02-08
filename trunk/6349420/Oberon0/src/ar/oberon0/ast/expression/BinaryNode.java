package ar.oberon0.ast.expression;

import ar.oberon0.runtime.Context;
import ar.oberon0.shared.Helper;
import ar.oberon0.shared.Interpretable;
import ar.oberon0.values.Value;

/*
 * The base class for binary expressions. Nodes that contain a right and left node. For example an add node.
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

	protected BinaryNode(final Interpretable leftNode, final Interpretable rightNode) {
		assert leftNode != null : "the leftNode parameter can't be null.";
		assert rightNode != null : "the rightNode parameter can't be null.";
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
