package oberon.data;

public class IdentifierSelector extends Selector {
	private String _name;

	public IdentifierSelector(String name){
		_name = name;
	}
	
	@Override
	public int getSelectorValue() {
		DataType datatype = VariableManager.getInstance().getVariable(_name);
		return datatype.getValue();
	}

	@Override
	public DataType getDataTypeValue() {
		return VariableManager.getInstance().getVariable(_name);
	}

}
