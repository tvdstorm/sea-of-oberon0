package oberon0.statement;

import oberon0.environment.Environment;

public interface Statement {
	
	public void execute(Environment env);
	
}
