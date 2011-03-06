package eu.wietsevenema.lang.oberon.ast.types;

import eu.wietsevenema.lang.oberon.ast.expressions.Expression;

public class ArrayType extends VarType {

	private Expression expression;
	private VarType type;

	public ArrayType(Expression exp, VarType type) {
		this.expression = exp;
		this.type = type;
	}

	public Expression getExpression() {
		return expression;
	}

	public VarType getType() {
		return type;
	}

	@Override
	public boolean equals(Object that) {
		if(that instanceof ArrayType){
			ArrayType arrayType = (ArrayType) that; 
			if(arrayType.getType().equals(this.getType()) ){
				return true;
			}
		}
		return false;
	}
	
	

}
