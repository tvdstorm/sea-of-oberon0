package oberon;

public interface IDataType {

	public abstract int getValue();

	public abstract IDataType copy(String newName);

	public abstract String getName();

	public abstract void setValue(final int value);

}