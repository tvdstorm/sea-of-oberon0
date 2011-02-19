package nl.bve.uva.oberon.shared;

import java.util.List;

import nl.bve.uva.oberon.ast.declarations.values.IValueNode;
import nl.bve.uva.oberon.env.Environment;
import nl.bve.uva.oberon.env.values.OberonValue;

public class TypedValueParameterList extends TypedParameterList {
	public TypedValueParameterList(List<String> paramList) {
		super(paramList);
	}
	
	public TypedValueParameterList(List<String> paramList, IValueNode type) {
		super(paramList, type);
	}
	
	@Override
	public OberonValue processValue(String parameter, OberonValue value, Environment env) {
		if (!parameter.contains(parameter)) {
			throw new RuntimeException("Parameter " +parameter+ " is not in the list!");
		}
		
		return value.clone();
	}
}
