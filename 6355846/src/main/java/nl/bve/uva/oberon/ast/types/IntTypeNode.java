package nl.bve.uva.oberon.ast.types;

import nl.bve.uva.oberon.env.Environment;
import nl.bve.uva.oberon.env.values.IntValue;
import nl.bve.uva.oberon.env.values.OberonValue;

public class IntTypeNode implements IOberonTypeNode {
	@Override
	public OberonValue initializeNew(Environment env) {
		return new IntValue(0);
	}
}
