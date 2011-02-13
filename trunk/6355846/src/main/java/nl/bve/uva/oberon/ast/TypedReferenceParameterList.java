package nl.bve.uva.oberon.ast;

import java.util.List;

import nl.bve.uva.oberon.env.Environment;
import nl.bve.uva.oberon.env.types.OberonType;

public class TypedReferenceParameterList extends TypedParameterList {
	public TypedReferenceParameterList(List<String> paramList) {
		super(paramList);
	}
	
	public TypedReferenceParameterList(List<String> paramList, IInterpretableNode type) {
		super(paramList, type);
	}
	
	@Override
	public OberonType processValue(String parameter, OberonType value, Environment env) {
		if (!parameter.contains(parameter)) {
			throw new RuntimeException("Parameter " +parameter+ " is not in the list!");
		}
		
		return value;
	}
}
