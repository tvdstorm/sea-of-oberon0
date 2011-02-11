package nl.bve.uva.oberon.ast;

import java.util.List;

import nl.bve.uva.oberon.env.Environment;
import nl.bve.uva.oberon.env.types.Type;

public class ValueParametersNode implements IInterpretableNode {
	private List<String> identList;
	private IInterpretableNode type;
	
	public ValueParametersNode(List<String> identList, IInterpretableNode type) {
		this.identList = identList;
		this.type = type;
	}
	
	@Override
	public Object interpret(Environment env) {
//		// TODO: copy of variable?
//		
//		Object o = type.interpret(env);
//		
//		assert o instanceof Type : "Found incorrect type for actual parameters!";
//		
//		for (String ident : identList) {
//			env.addVariable(ident, (Type)o);
//		}
//		
		return null;
	}
}
