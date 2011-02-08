package oberon.convert;

import oberon.analysis.DepthFirstAdapter;

/**
 * The Class AbstractConverter.
 *
 * @param <TResult> the generic type
 */
public abstract class AbstractConverter<TResult> extends DepthFirstAdapter {
	
	/**
	 * Gets the interpreter result.
	 *
	 * @return the interpreter result
	 */
	protected TResult getInterpreterResult() {
		return buildInterpreterResult();
	}

	/**
	 * Builds the interpreter result.
	 *
	 * @return the t result
	 */
	public abstract TResult buildInterpreterResult();
}
