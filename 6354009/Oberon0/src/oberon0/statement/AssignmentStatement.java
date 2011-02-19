package oberon0.statement;

import oberon0.environment.Environment;
import oberon0.expression.Expression;
import oberon0.selector.Selector;
import oberon0.value.Value;

public class AssignmentStatement  implements Statement {

	private Expression assignment;
	private String identifier;
	private Selector selector;
	
	public AssignmentStatement(String identifier, Selector selector, Expression assignment) {
		this.identifier = identifier;
		this.selector = selector;
		this.assignment = assignment;
	}
	
	@Override
	public void execute(Environment env){
		Value<?> value = assignment.evaluate(env);
		if (selector == null) {
			env.assignValue(identifier,value);
		}
		else {
			//Retrieve selected value.
			Value<?>identifiedVal = env.getValue(identifier);
			identifiedVal.setValue(selector,env,value);
		}
	}
	
}
