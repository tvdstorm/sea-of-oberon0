package nl.bve.uva.oberon.ast.expressions;

import java.util.List;

import nl.bve.uva.oberon.ast.selectors.Selector;
import nl.bve.uva.oberon.env.Environment;
import nl.bve.uva.oberon.env.types.OberonValue;


public class IdentSelectorNode extends ExpressionNode {
	private String name;
	private List<Selector> selectors;
	
	public IdentSelectorNode(String name, List<Selector> selectors) {
		this.name = name;
		this.selectors = selectors;
	}
	
	@Override
	public OberonValue eval(Environment env) {
		OberonValue type = env.getVariable(name);
		
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
