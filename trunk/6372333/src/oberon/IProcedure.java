package oberon;

import java.io.IOException;
import java.util.Queue;

/**
 * The Interface IProcedure, interfaces all procedures.
 */
public interface IProcedure {

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public abstract String getName();

	/**
	 * Call.
	 *
	 * @param localQueue Queue with the actual parameters
	 * @throws IOException When reading from the command line fails.
	 */
	public abstract void call(Queue<IExpression> localQueue) throws IOException;

}