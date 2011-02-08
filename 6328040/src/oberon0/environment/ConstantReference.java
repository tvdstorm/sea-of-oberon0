package oberon0.environment;

/*
 * Behaves like a reference, but throws IllegalArgumentException when trying to change its value
 */
public class ConstantReference extends Reference {

	public ConstantReference(IValue value) {
		super(value);
	}

	@Override
	public void setValue(IValue value) {
		throw new IllegalArgumentException(
				"Not allowed to change constant reference value");
	}

}
