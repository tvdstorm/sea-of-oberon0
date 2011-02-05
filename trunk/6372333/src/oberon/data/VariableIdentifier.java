package oberon.data;

public class VariableIdentifier extends AbstractIdentifier {
	private final String name;

	public VariableIdentifier(final String inputName){
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
