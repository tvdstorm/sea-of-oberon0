package oberon0.interpreter.statement;

import oberon0.interpreter.exceptions.ExecutionException;
import oberon0.interpreter.module.Module;

public interface Statement {
	public void execute(Module module) throws ExecutionException;
}
