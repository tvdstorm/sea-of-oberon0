package uva.oberon0.abstractsyntax.expressions;

import uva.oberon0.abstractsyntax.BaseNode;
import uva.oberon0.runtime.Scope;

/**
 * This class represents a Multiplication Binary Expression (x * y).
 * @author Chiel Labee
 */
public class Multiplication extends BaseExpressionBinary {

	public Multiplication(BaseNode left, BaseNode right) {
		super(left, right);
	}

	@Override
	public int eval(Scope scope) 
	{
		return getLeft().eval(scope) * getRight().eval(scope);
	}

}
