package oberon.typechecker;

public class InvalidConditionError extends AbstractError {

	private final String text;

	public InvalidConditionError(String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return "Conditions can only be comparisons, the following is an invalid comparison: "+ text;
	}

}
