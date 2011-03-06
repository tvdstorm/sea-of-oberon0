package eu.wietsevenema.lang.oberon.ast.declarations;

import eu.wietsevenema.lang.oberon.ast.expressions.Expression;
import eu.wietsevenema.lang.oberon.ast.expressions.Identifier;
import eu.wietsevenema.lang.oberon.ast.expressions.Selector;

public class RecordSelector extends Selector {

	private Expression left;
	private Identifier key;

	public RecordSelector(Expression left, Identifier key) {
		this.left = left;
		this.key = key;
		
	}

	public Expression getLeft() {
		return left;
	}

	public Identifier getKey() {
		return key;
	}

}
