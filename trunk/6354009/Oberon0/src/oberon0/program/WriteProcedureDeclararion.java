package oberon0.program;

import java.io.PrintStream;
import java.util.List;

import oberon0.declaration.ProcedureDeclaration;
import oberon0.environment.EnvObject;
import oberon0.environment.Environment;
import oberon0.expression.Expression;
import oberon0.value.IntegerValue;

public class WriteProcedureDeclararion extends ProcedureDeclaration{
	
	private final PrintStream outStream;
	
	public WriteProcedureDeclararion(PrintStream outStream) {
		super("Write");
		this.outStream = outStream;
	}

	@Override
	public void start(Environment env, List<Expression> actParams) {
		if (!actParams.isEmpty()) {
			IntegerValue value = actParams.get(0).evaluate(env);
			outStream.print(value);
		}
	}
	
	@Override
	public EnvObject getEnvironmentObject(Environment env) {
		return new EnvObject(this, false);
	}
}
