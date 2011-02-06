package oberon0.identifier;

import oberon0.expression.Expression;

public class ArrayIndexSelector extends Selector {
	
	public static String TYPE = "SELECTOR_ARRAY_INDEX";
	
	private Expression indexExpression; 
	
	public ArrayIndexSelector(Expression indexExpression) {
		super(TYPE);
		this.indexExpression = indexExpression;
	}

	public Expression getIndexExpression() {
		return indexExpression;
	}
}
