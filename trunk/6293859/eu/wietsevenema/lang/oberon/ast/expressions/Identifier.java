package eu.wietsevenema.lang.oberon.ast.expressions;


public class Identifier extends Expression {
	
	String name;
	
	public Identifier(String name) {
		this.name = name;
	}

	public String getName(){
		return name;
	}
	
	public String toString(){
		return this.name;
	}
	
}
