package ar.oberon0.ast.expression;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import ar.oberon0.ast.dataTypes.BooleanType;
import ar.oberon0.runtime.Context;
import ar.oberon0.shared.Interpretable;
import ar.oberon0.shared.TechnicalException;
import ar.oberon0.values.BooleanValue;

public class OrNode extends BinaryNode {
	public OrNode(final Interpretable leftNode, final Interpretable rightNode) {
		super(leftNode, rightNode);
	}

	@Override
	public final Object interpret(final Context context) throws TechnicalException {
		Boolean rawResult = ((BooleanValue) this.getLeftExpression().interpret(context)).getValueAsBoolean() || ((BooleanValue) this.getRightExpression().interpret(context)).getValueAsBoolean();
		return new BooleanValue(rawResult);
	}

	@Override
	List<Type> getAcceptedTypes() {
		List<Type> acceptedTypes = new ArrayList<Type>();
		acceptedTypes.add(BooleanType.class);
		return acceptedTypes;
	}
}
