package nl.bve.uva.oberon.shared;

import java.util.List;

import nl.bve.uva.oberon.ast.IInterpretableNode;
import nl.bve.uva.oberon.env.Environment;
import nl.bve.uva.oberon.env.types.OberonValue;

public class TypedReferenceParameterList extends TypedParameterList {
	public TypedReferenceParameterList(List<String> paramList) {
		super(paramList);
	}
	
	public TypedReferenceParameterList(List<String> paramList, IInterpretableNode type) {
		super(paramList, type);
	}
	
	@Override
	public OberonValue processValue(String parameter, OberonValue value, Environment env) {
		if (!parameter.contains(parameter)) {
			throw new RuntimeException("Parameter " +parameter+ " is not in the list!");
		}
		
		return value;
	}
}
