package nl.bve.uva.oberon.ast.expressions;

import nl.bve.uva.oberon.env.Environment;
import nl.bve.uva.oberon.env.types.OberonValue;

public abstract class ExpressionNode {
	public abstract OberonValue eval(Environment env);
}
