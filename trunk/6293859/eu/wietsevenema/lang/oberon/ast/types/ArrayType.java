package eu.wietsevenema.lang.oberon.ast.types;

import eu.wietsevenema.lang.oberon.ast.expressions.Expression;
import eu.wietsevenema.lang.oberon.ast.visitors.TransformGenerics;
import xtc.tree.Node;

public class ArrayType extends VarType {

	private Expression expression;
	private VarType type;

	public ArrayType(Node exp, VarType type) {
		TransformGenerics tg = new TransformGenerics();
		this.expression = (Expression) tg.dispatch(exp);
		this.type = type;
	}

	public Expression getExpression() {
		return expression;
	}

	public VarType getType() {
		return type;
	}

	@Override
	public String toString() {
		//FIXME
		// Auto-generated method stub
		return null;
	}

}
