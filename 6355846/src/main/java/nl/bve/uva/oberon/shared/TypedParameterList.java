package nl.bve.uva.oberon.shared;

import java.util.List;

import nl.bve.uva.oberon.ast.types.IOberonTypeNode;
import nl.bve.uva.oberon.env.Environment;
import nl.bve.uva.oberon.env.values.OberonValue;

public abstract class TypedParameterList {
	private List<String> parameterList;
	private IOberonTypeNode type;
	
	public TypedParameterList(List<String> parameterList, IOberonTypeNode type) {
		this.parameterList = parameterList;
		this.type = type;
	}
	
	public List<String> getParametersList() {
		return parameterList;
	}
	
	public IOberonTypeNode getType() {
		return type;
	}
	
	public abstract OberonValue processValue(String parameter, OberonValue value, Environment env);
}
