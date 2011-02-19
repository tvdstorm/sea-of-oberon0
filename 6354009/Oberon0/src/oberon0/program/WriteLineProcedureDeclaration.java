package oberon0.program;

import java.io.PrintStream;
import java.util.List;

import oberon0.declaration.ProcedureDeclaration;
import oberon0.environment.EnvObject;
import oberon0.environment.Environment;
import oberon0.expression.Expression;
import oberon0.value.Value;

public class WriteLineProcedureDeclaration extends ProcedureDeclaration{

	private final PrintStream outStream;
	
	public WriteLineProcedureDeclaration(PrintStream outStream) {
		super("WriteLn");
		this.outStream = outStream;
	}

	@Override
	public void start(Environment env, List<Expression> actParams) {
		if (actParams != null && !actParams.isEmpty()) {
			Value<?> value = actParams.get(0).evaluate(env);
			outStream.println(value);
		}
		else {
			//Print empty line.
			outStream.println();
		}
	}

	@Override
	public EnvObject getEnvironmentObject(Environment env) {
		return new EnvObject(this, false);
	}
	
}
