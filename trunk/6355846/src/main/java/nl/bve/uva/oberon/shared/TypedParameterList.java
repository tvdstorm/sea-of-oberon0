package nl.bve.uva.oberon.shared;

import java.util.List;

import nl.bve.uva.oberon.ast.declarations.values.ITypeNode;
import nl.bve.uva.oberon.env.Environment;
import nl.bve.uva.oberon.env.values.OberonValue;

public abstract class TypedParameterList {
	private List<String> parameterList;
	private ITypeNode type;
	
	public TypedParameterList(List<String> parametersList) {
		this.parameterList = parametersList;
	}
	
	public TypedParameterList(List<String> parameterList, ITypeNode type) {
		this.parameterList = parameterList;
		this.type = type;
	}
	
	public List<String> getParametersList() {
		return parameterList;
	}
	
	public ITypeNode getType() {
		return type;
	}
	
	public abstract OberonValue processValue(String parameter, OberonValue value, Environment env);
}
