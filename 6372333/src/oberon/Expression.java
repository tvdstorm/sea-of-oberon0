package oberon;

public abstract class Expression {
	public abstract int EvalAsInt();
	
	public Boolean EvalAsBoolean()
	{
		return EvalAsInt() == 1;
	}
	
	protected int BooleanAsInt(Boolean input)
	{
		if (input)
			return 1;
		else
			return 0;
	}

}
