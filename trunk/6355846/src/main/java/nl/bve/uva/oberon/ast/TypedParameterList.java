package nl.bve.uva.oberon.ast;

import java.util.List;

import nl.bve.uva.oberon.env.Environment;
import nl.bve.uva.oberon.env.types.Type;

public abstract class TypedParameterList {
	private List<String> parameterList;
	private IInterpretableNode type;
	
	public TypedParameterList(List<String> parametersList) {
		this.parameterList = parametersList;
	}
	
	public TypedParameterList(List<String> parameterList, IInterpretableNode type) {
		this.parameterList = parameterList;
		this.type = type;
	}
	
	public List<String> getParametersList() {
		return parameterList;
	}
	
	public IInterpretableNode getType() {
		return type;
	}
	
	public abstract Type processValue(String parameter, Type value, Environment env);
}
