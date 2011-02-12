package nl.bve.uva.oberon.ast;

import java.util.List;

import nl.bve.uva.oberon.env.Environment;
import nl.bve.uva.oberon.env.types.Type;

public class ReferenceParametersNode implements ParametersNode {
	private List<String> identList;
	private IInterpretableNode type;
	
	public ReferenceParametersNode(List<String> identList, IInterpretableNode type) {
		this.identList = identList;
		this.type = type;
	}
	
	@Override
	public List<String> interpret(Environment env) {
		return identList;
	}
	
	@Override
	public Type processValue(String identName, Type value) {
		System.out.println("processing value " +identName);
		if (!identList.contains(identName)) {
			throw new RuntimeException("Parameter " +identName+ " is not in the list!");
		}
		
		return value;
	}
}
