package oberon.data;

import oberon.IDataType;
import oberon.VariableManager;
import oberon.exceptions.UnsupportedException;

/**
 * The Class VariableIdentifier, a pointer to a variable value.
 */
public class VariableIdentifier extends AbstractIdentifier {
	
	/** The name. */
	private final String name;

	/**
	 * Instantiates a new variable identifier.
	 *
	 * @param inputName the name of the new instance
	 */
	public VariableIdentifier(final String inputName){
		name = inputName;
	}
	
	/* (non-Javadoc)
	 * @see oberon.data.AbstractIdentifier#getValue()
	 */
	@Override
	public int getValue() throws UnsupportedException {
		final IDataType datatype = VariableManager.getInstance().getVariable(name);
		return datatype.getValue();
	}

	/* (non-Javadoc)
	 * @see oberon.data.AbstractIdentifier#getDataTypeValue()
	 */
	@Override
	public IDataType getDataTypeValue() {
		return VariableManager.getInstance().getVariable(name);
	}

}
