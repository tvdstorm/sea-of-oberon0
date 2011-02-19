package oberon0.expression;

import oberon0.environment.Environment;
import oberon0.selector.Selector;
import oberon0.value.Value;

public class VariableExpression implements Expression {

	private final String identifier;
	private final Selector selector;
	
	public VariableExpression(String identifier, Selector selector) {
		this.identifier = identifier;
		this.selector = selector;
	}
		
	public String getIdentifier() {
		return identifier;
	}

	public Selector getSelector() {
		return selector;
	}
	
	@Override
	@SuppressWarnings("unchecked")
	public Value<?> evaluate(Environment env) {
		Value<?> value = env.getValue(identifier); 
		return value.getValue(selector,env);
	}

}
