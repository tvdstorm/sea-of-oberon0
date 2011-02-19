package nl.bve.uva.oberon.ast.expressions;

import nl.bve.uva.oberon.env.Environment;
import nl.bve.uva.oberon.env.types.OberonType;

public abstract class ExpressionNode {
	public abstract OberonType eval(Environment env);
}
