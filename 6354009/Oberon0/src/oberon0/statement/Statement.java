package oberon0.statement;

import oberon0.exception.ExecutionException;
import oberon0.module.Module;

public interface Statement {
	public void execute(Module module);
}