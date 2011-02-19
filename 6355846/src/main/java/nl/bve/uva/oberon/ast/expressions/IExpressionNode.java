package nl.bve.uva.oberon.ast.expressions;

import nl.bve.uva.oberon.env.Environment;
import nl.bve.uva.oberon.env.values.OberonValue;

public interface IExpressionNode {
	public OberonValue eval(Environment env);
}
