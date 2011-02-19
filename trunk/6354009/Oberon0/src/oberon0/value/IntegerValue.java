package oberon0.value;

import oberon0.environment.Environment;
import oberon0.selector.Selector;
import oberon0.type.IntegerType;

public class IntegerValue extends Value<Integer> {

	public IntegerValue(Integer value) {
		super(value, new IntegerType());
	}

	@Override
	@SuppressWarnings("unchecked")
	public IntegerValue getValue(Selector selector, Environment env) {
		return this;
	}
	
	@Override
	public void setValue(Selector selector, Environment env, Value<?> setVal) 
	{
		assert(setVal.getClass() == IntegerValue.class):"Setting incorrect value type.";
		this.value = (Integer)setVal.getTrueValue();
	}
	
	public Boolean getBoolValue() {
		return (value > 0)?true:false;
	}
	
	public IntegerValue getCopy() {
		return new IntegerValue(this.value);
	}

}
