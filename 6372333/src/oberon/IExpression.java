package oberon;

public interface IExpression {

	public abstract int evalAsInt();

	public abstract Boolean evalAsBoolean();

	public abstract IDataType copy(String newName);

}