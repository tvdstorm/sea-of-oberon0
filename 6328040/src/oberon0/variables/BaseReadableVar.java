package oberon0.variables;

public abstract class BaseReadableVar implements IReadableVar{
	private String _name;
	private String _sourceName;
	private int _sourceSelector;
	
	protected BaseReadableVar(String name){
		_name = name;
		setSourceName("");
		setSourceSelector(0);
	}
	
	@Override
	abstract public VariableTypes getType();
	@Override
	abstract public Object getValue();
	
	@Override
	public String getName() {
		return _name;
	}
	
	@Override
	//TODO This is used for the assign 'factory', maybe a better construction is possible
	public void setName(String name){
		_name = name;
	}

	@Override
	public String getSourceName() {
		return _sourceName;
	}
	
	@Override
	public void setSourceName(String sourceName) {
		_sourceName = sourceName;
	}	

	@Override
	public int getSourceSelector() {
		return _sourceSelector;
	}

	@Override
	public void setSourceSelector(int sourceSelector) {
		_sourceSelector = sourceSelector;
	}
	
	@Override
	public void setSourceSelector(IntegerVar sourceSelector) {
		int sourceSelectorValue = (Integer) sourceSelector.getValue();
		setSourceSelector(sourceSelectorValue);
	}
}
