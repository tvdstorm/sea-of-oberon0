package nl.bve.uva.oberon.env.procedures;

import java.util.List;

import nl.bve.uva.oberon.env.types.Type;

public abstract class TypedParameterList {
	private List<String> parametersList;
	
	public TypedParameterList(List<String> parametersList) {
		this.parametersList = parametersList;
	}
	
	public List<String> getParametersList() {
		return parametersList;
	}
	
	public abstract Type processValue(Type value);
}
