package oberon.data;

public class IntegerType extends DataType {
	private int _value;
	private Boolean _isConst;

	public IntegerType(String name, Boolean isConst) {
		super(name);
		_isConst = isConst;
	}

	public IntegerType(String name, int value, Boolean isConst) {
		this (name, isConst);
		_value = value;
	}

	@Override
	public int getValue() {
		return _value;
	}
	
	void setValueInternal(int value)
	{
		if (_isConst)
		{
			//TODO throw
			System.out.println("Const variabelen mogen niet gezet worden!!!");
		}
		_value = value;
	}

	@Override
	public DataType DeepCopy() {
		return new IntegerType(getName(), _value, _isConst);
	}

}
