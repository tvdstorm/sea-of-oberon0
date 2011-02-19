package nl.bve.uva.oberon.ast.declarations.values;

import nl.bve.uva.oberon.env.Environment;
import nl.bve.uva.oberon.env.values.IntValue;
import nl.bve.uva.oberon.env.values.OberonValue;

public class IntegerTypeNode implements ITypeNode {
	@Override
	public OberonValue initializeNew(Environment env) {
		return new IntValue(0);
	}
}
