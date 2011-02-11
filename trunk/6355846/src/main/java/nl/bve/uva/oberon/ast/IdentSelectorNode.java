package nl.bve.uva.oberon.ast;

import java.util.List;

import nl.bve.uva.oberon.env.Environment;
import nl.bve.uva.oberon.env.types.Type;


public class IdentSelectorNode implements IInterpretableNode {
	private String name;
	private List<IInterpretableNode> selectors;
	
	public IdentSelectorNode(String name, List<IInterpretableNode> selectors) {
		this.name = name;
		this.selectors = selectors;
		System.out.println("IdentNode(" +name+ ", " +selectors+ ")");
	}
	
	@Override
	public Object interpret(Environment env) {
		Type type = env.getVariable(name);
		
		if (selectors != null) {
			for (IInterpretableNode selector : selectors) {
				type = type.evaluateSelector(selector);
			}
		}
		
		return type;
	}
}
