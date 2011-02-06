package oberon0.interpreter.type;

import oberon0.interpreter.expression.Expression;
import oberon0.interpreter.identifier.Selector;
import oberon0.interpreter.module.Module;

public abstract class Type {
	
	public static String INTEGER_TYPE = "TYPE_INTEGER";
	public static String ARRAY_TYPE = "TYPE_ARRAY";
	
	private String typeName;
	
	public Type(String typeName) {
		this.typeName = typeName;
	}

	public String getTypeName() {
		return typeName;
	}
	
	public abstract Expression getExpression(Selector selector, Module module);
	
	public abstract void assignExpression(Expression expression, Selector selector, Module module);

	public abstract Type getNew();
	
	public abstract Type getCopy(Module module);
}
