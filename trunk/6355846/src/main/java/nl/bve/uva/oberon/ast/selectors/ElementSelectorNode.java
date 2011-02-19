package nl.bve.uva.oberon.ast.selectors;

import nl.bve.uva.oberon.ast.expressions.IExpressionNode;
import nl.bve.uva.oberon.env.Environment;
import nl.bve.uva.oberon.shared.SelectorValue;

public class ElementSelectorNode implements ISelectorNode {
	private IExpressionNode expression;
	
	public ElementSelectorNode(IExpressionNode expression) {
		this.expression = expression;
	}
	
	@Override
	public SelectorValue evaluate(Environment env) {
		return new SelectorValue(expression.eval(env));
	}
}
