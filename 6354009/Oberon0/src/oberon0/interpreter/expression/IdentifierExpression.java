package oberon0.interpreter.expression;

import oberon0.interpreter.identifier.Identifier;
import oberon0.interpreter.module.Module;

public class IdentifierExpression implements Expression {

	public static String TYPE = "IDENTIFIER_EXPRESSION";
	
	private Identifier identifier; 
	
	//Constructor
	public IdentifierExpression(Identifier identifier) {
		this.identifier = identifier;
	}
	
	public Identifier getIdentifier() {
		return identifier;
	}

	@Override
	public Expression evaluate(Module module) {
		return module.getValueForIdentifier(identifier);
	}
	
	public String getType() {
		return TYPE;
	}
}
