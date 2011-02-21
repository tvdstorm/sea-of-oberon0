package ar.oberon0.ast.expression;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import ar.oberon0.ast.dataTypes.ArithmeticType;
import ar.oberon0.runtime.Context;
import ar.oberon0.shared.Interpretable;
import ar.oberon0.shared.TechnicalException;
import ar.oberon0.values.ArithmeticValue;

public class ModNode extends BinaryNode {
	public ModNode(final Interpretable leftNode, final Interpretable rightNode) {
		super(leftNode, rightNode);
	}

	@Override
	public final Object interpret(final Context context) throws TechnicalException {
		return this.<ArithmeticValue> getLeftValue(context).modulo(this.<ArithmeticValue> getRightValue(context));
	}

	@Override
	List<Type> getAcceptedTypes() {
		List<Type> acceptedTypes = new ArrayList<Type>();
		acceptedTypes.add(ArithmeticType.class);
		return acceptedTypes;
	}

}
