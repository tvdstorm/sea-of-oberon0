package oberon0.interpreter.procedure;

import oberon0.interpreter.declaration.Variable;
import oberon0.interpreter.expression.Expression;
import oberon0.interpreter.expression.IdentifierExpression;
import oberon0.interpreter.identifier.Identifier;
import oberon0.interpreter.identifier.Selector;
import oberon0.interpreter.module.Module;
import oberon0.interpreter.type.Type;

public class Parameter extends Variable{
	
	private boolean referenced;
	private Identifier higherModuleIdentifier;
	
	public Parameter(String identifier, Type type, boolean referenced) {
		super(identifier,type);
		this.referenced = referenced;
		higherModuleIdentifier = null;
	}
	
	//REFERENCE
	public boolean isReferenced() {
		return referenced;
	}

	//HIGHER MODULE IDENTIFIER
	public Identifier getHigherModuleIdentifier() {
		return higherModuleIdentifier;
	}
	
	public boolean hasHigherModuleIdentifier() {
		return (higherModuleIdentifier != null);
	}
	
	
	public void assignExpression(Expression expression, Selector selector, Module module) {
		
		if (expression.getType() == IdentifierExpression.TYPE) {
			//Mark the higher module identifier and selector.
			IdentifierExpression identExp = (IdentifierExpression) expression;
			higherModuleIdentifier = identExp.getIdentifier();
			//Also pass the selector of the higher module identifier.
			super.assignExpression(expression, higherModuleIdentifier.getSelector(), module);
		}
		else {
			super.assignExpression(expression, selector, module);
		}
	}
	
	//NEW
	public Parameter getNew() {
		String ident = getIdentifier();
		Type type = getType().getNew();
		Boolean isRef = isReferenced();
		return new Parameter(ident,type, isRef);
	}

}
