package nl.bve.uva.oberon.ast;

import nl.bve.uva.oberon.ast.expressions.ExpressionNode;
import nl.bve.uva.oberon.env.Environment;
import nl.bve.uva.oberon.shared.SelectorValue;

public class ElementSelectorNode extends Selector {
	private ExpressionNode expression;
	
	public ElementSelectorNode(ExpressionNode expression) {
		this.expression = expression;
	}
	
	@Override
	public SelectorValue evaluate(Environment env) {
		return new SelectorValue(expression.eval(env));
	}
}
