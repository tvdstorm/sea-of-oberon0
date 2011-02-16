package oberon.typechecker;

/**
 * The Class InvalidConditionError.
 */
public class InvalidConditionError extends AbstractError {

	/** The text. */
	private final String text;

	/**
	 * Instantiates a new invalid condition error.
	 *
	 * @param text the text
	 */
	public InvalidConditionError(String text) {
		this.text = text;
	}

	/* (non-Javadoc)
	 * @see oberon.typechecker.AbstractError#toString()
	 */
	@Override
	public String toString() {
		return "Conditions can only be comparisons, the following is an invalid comparison: "+ text;
	}

}
