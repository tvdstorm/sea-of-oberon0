package nl.bve.uva.oberon.env.procedures;

import java.util.List;

import nl.bve.uva.oberon.env.types.Type;

public class TypedReferenceParameterList extends TypedParameterList {
	public TypedReferenceParameterList(List<String> paramList) {
		super(paramList);
	}
	
	@Override
	public Type processValue(Type value) {
		return value;
	}
}
