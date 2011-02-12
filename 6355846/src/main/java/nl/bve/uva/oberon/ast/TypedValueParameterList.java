package nl.bve.uva.oberon.ast;

import java.util.List;

import nl.bve.uva.oberon.env.Environment;
import nl.bve.uva.oberon.env.types.Type;

public class TypedValueParameterList extends TypedParameterList {
	public TypedValueParameterList(List<String> paramList) {
		super(paramList);
	}
	
	public TypedValueParameterList(List<String> paramList, IInterpretableNode type) {
		super(paramList, type);
	}
	
	@Override
	public Type processValue(String parameter, Type value, Environment env) {
		if (!parameter.contains(parameter)) {
			throw new RuntimeException("Parameter " +parameter+ " is not in the list!");
		}
		
		return value.clone();
	}
}
