package nl.bve.uva.oberon.ast;

import nl.bve.uva.oberon.env.Environment;
import nl.bve.uva.oberon.env.types.OberonInt;

public class IntegerTypeNode implements IInterpretableNode {
	@Override
	public Object interpret(Environment env) {
		return new OberonInt(0);
	}
}
