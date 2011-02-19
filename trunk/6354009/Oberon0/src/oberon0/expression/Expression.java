package oberon0.expression;

import oberon0.environment.Environment;
import oberon0.value.Value;

public interface Expression {

	public <T extends Value<?>> T evaluate(Environment env);
}
