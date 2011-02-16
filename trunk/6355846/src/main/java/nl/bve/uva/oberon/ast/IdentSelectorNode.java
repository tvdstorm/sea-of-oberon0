package nl.bve.uva.oberon.ast;

import java.util.List;

import nl.bve.uva.oberon.env.Environment;
import nl.bve.uva.oberon.env.types.OberonType;


public class IdentSelectorNode implements IInterpretableNode {
	private String name;
	private List<Selector> selectors;
	
	public IdentSelectorNode(String name, List<Selector> selectors) {
		this.name = name;
		this.selectors = selectors;
	}
	
	@Override
	public Object interpret(Environment env) {
		OberonType type = env.getVariable(name);
		
		if (selectors != null) {
			for (Selector s : selectors) {
				type = type.evaluateSelector(s.evaluate(env));
			}
		}
		
		return type;
	}
	
	@Override
	public String toString() {
		return name+ "(" +selectors+ ")";
	}
}
