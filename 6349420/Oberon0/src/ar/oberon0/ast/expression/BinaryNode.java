package ar.oberon0.ast.expression;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import ar.oberon0.ast.dataTypes.CreatableType;
import ar.oberon0.runtime.Context;
import ar.oberon0.shared.CheckViolation;
import ar.oberon0.shared.Helper;
import ar.oberon0.shared.Interpretable;
import ar.oberon0.values.Value;

/*
 * The base class for binary expressions. Nodes that contain a right and left node. For example an add node.
 */
abstract class BinaryNode implements Interpretable {
	private Interpretable leftNode;
	private Interpretable rightNode;

	/*
	 * The list of types that can be used for the BinaryNode. For example
	 * ArithmeticType for the Add operation.
	 */
	abstract List<Type> getAcceptedTypes();

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

	@Override
	public List<CheckViolation> check(Context context) {
		assert getAcceptedTypes() != null : "the getAcceptedTypes getter can't return a null reference.";

		List<CheckViolation> violations = new ArrayList<CheckViolation>();
		violations.addAll(leftNode.check(context));
		violations.addAll(rightNode.check(context));

		// if the left or the right node contains violations the result can't be
		// processed and type checked.
		if (violations.size() > 0) {
			return violations;
		}

		CreatableType leftType = Helper.getValue(leftNode, context).getType();
		CreatableType rightType = Helper.getValue(rightNode, context).getType();

		if (!isAcceptedType(leftType)) {
			violations.add(new CheckViolation("The left node is not an accepted type.", this.getClass()));
		}

		if (!isAcceptedType(rightType)) {
			violations.add(new CheckViolation("The right node is not an accepted type.", this.getClass()));
		}

		if (!(leftType.equals(rightType))) {
			violations.add(new CheckViolation("The left and right hand side of the expression are not of the same type.", this.getClass()));
		}
		return violations;
	}

	private boolean isAcceptedType(CreatableType type) {
		for (Type acceptedType : getAcceptedTypes()) {
			if (((Class) acceptedType).isInstance(type)) {
				return true;
			}
		}
		return false;
	}
}
