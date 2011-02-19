package oberon0.selector;

import oberon0.expression.Expression;

public class BracketSelector extends Selector {
	
	private Expression indexExpression; 
	
	public BracketSelector(Expression indexExpression) {
		this.indexExpression = indexExpression;
	}

	public Expression getIndexExpression() {
		return indexExpression;
	}
}
