package oberon0.program;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


import oberon0.declaration.ProcedureDeclaration;
import oberon0.environment.EnvObject;
import oberon0.environment.Environment;
import oberon0.expression.Expression;
import oberon0.value.IntegerValue;

public class ReadProcedureDeclaration extends ProcedureDeclaration{

	private Queue<Integer> argumentsStack;
	
	public ReadProcedureDeclaration(String [] arguments) {
		super("Read");
		argumentsStack = new LinkedList<Integer>();
		pushArguments(arguments);
	}
	
	public void start(Environment env, List<Expression> actParams) {
		if (!actParams.isEmpty() && hasArguments()) {
			IntegerValue value = actParams.get(0).evaluate(env);
			value.setTrueValue(argumentsStack.remove());
		}
	}

	private void pushArguments(String [] arguments) {
		if (arguments != null) {
			for (String arg : arguments) {
				Integer val = Integer.parseInt(arg);
				argumentsStack.offer(val);
			}
		}
	}
	
	private boolean hasArguments() {
		return !argumentsStack.isEmpty();
	}

	@Override
	public EnvObject getEnvironmentObject(Environment env) {
		return new EnvObject(this, false);
	}
	
}
