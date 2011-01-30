package oberon0.variables;

public interface IVariable {
	public VariableTypes getType();
	public String getName();
	public void setName(String name);
	public String getSourceName();
	public void setSourceName(String sourceName);
	public int getSourceSelector();
	public void setSourceSelector(int sourceSelector);
	public void setSourceSelector(IntegerVar sourceSelector);
}
