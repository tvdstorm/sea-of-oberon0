package nl.bve.uva.oberon.env.procedures;

import java.util.List;

import nl.bve.uva.oberon.env.types.Type;

public class TypedValueParameterList extends TypedParameterList {
	public TypedValueParameterList(List<String> paramList) {
		super(paramList);
	}
	
	@Override
	public Type processValue(Type value) {
		return value.clone();
	}
}
