package oberon.data;

import oberon.IDataType;
import oberon.VariableManager;

public class VariableIdentifier extends AbstractIdentifier {
	private final String name;

	public VariableIdentifier(final String inputName){
		name = inputName;
	}
	
	@Override
	public int getSelectorValue() {
		final IDataType datatype = VariableManager.getInstance().getVariable(name);
		return datatype.getValue();
	}

	@Override
	public IDataType getDataTypeValue() {
		return VariableManager.getInstance().getVariable(name);
	}

}
