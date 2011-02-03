package oberon.data;

public class IdentifierSelector extends AbstractSelector {
	private final String name;

	public IdentifierSelector(final String inputName){
		name = inputName;
	}
	
	@Override
	public int getSelectorValue() {
		final AbstractDataType datatype = VariableManager.getInstance().getVariable(name);
		return datatype.getValue();
	}

	@Override
	public AbstractDataType getDataTypeValue() {
		return VariableManager.getInstance().getVariable(name);
	}

}
