package oberon0.variables;
/**
* A variable that can be called by a selector (i.e. an array)
*/
public interface ISelectorableVar extends IReadableVar{

	public IReadableVar getValueAtSelector(IntegerVar selector);
	public IReadableVar getValueAtSelector(int selector);
	public void setValueAtSelector(IReadableVar selector, IReadableVar newValue);
	public void setValueAtSelector(int selector, IReadableVar newValue);
}
