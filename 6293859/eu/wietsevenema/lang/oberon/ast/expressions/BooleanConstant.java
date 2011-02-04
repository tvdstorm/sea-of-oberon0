package eu.wietsevenema.lang.oberon.ast.expressions;

public class BooleanConstant extends Expression {

	Boolean value;
	
	public BooleanConstant( Boolean value ) {
		this.value = value;
	}
	
	public Boolean getValue(){
		return value;
	}

	public String toString(){
		return value.toString();
	}
	
}
