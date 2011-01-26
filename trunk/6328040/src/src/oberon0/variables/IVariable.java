package oberon0.variables;


public interface IVariable {
	public VariableTypes getType();
	public Object getValue();
	void print();
}
