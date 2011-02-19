package nl.bve.uva.oberon.ast.declarations.values;

import nl.bve.uva.oberon.env.Environment;
import nl.bve.uva.oberon.env.values.OberonValue;

public abstract class TypeNode {
	public abstract OberonValue initializeNew(Environment env);
}
