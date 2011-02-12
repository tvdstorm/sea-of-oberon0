package nl.bve.uva.oberon.ast;

import java.util.List;

import nl.bve.uva.oberon.env.Environment;
import nl.bve.uva.oberon.env.types.Type;

public interface ParametersNode extends IInterpretableNode {
	public abstract List<String> interpret(Environment env);
	public abstract Type processValue(String identName, Type value);
}
