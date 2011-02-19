package oberon0.value;

import oberon0.environment.Environment;
import oberon0.selector.BracketSelector;
import oberon0.selector.Selector;
import oberon0.type.Type;
import oberon0.value.Value;

public class ArrayValue extends Value<Value<?> []> {

	public ArrayValue(Value<?>[] array, Type type) {
		super(array, type);
	}

	@Override
	@SuppressWarnings("unchecked")
	public Value<?> getValue(Selector selector, Environment env) {
		if (selector != null) {
			BracketSelector brackSel = (BracketSelector)selector;
			IntegerValue index = brackSel.getIndexExpression().evaluate(env);
			Value<?> retVal = value[index.getTrueValue()];      
			return retVal.getValue(selector.getNestedSelector(), env);
		}
		else {
			return this; 
		}
	}
	
	public void setValue(Selector selector, Environment env, Value<?> setVal) {
		if (selector != null) {
			BracketSelector brackSel = (BracketSelector)selector;
			IntegerValue index = brackSel.getIndexExpression().evaluate(env);
			value[index.getTrueValue()] = setVal;
		}
		else {
			assert(setVal.getClass() == ArrayValue.class):"Setting value to incorrect type";
			value = (Value<?>[])setVal.getTrueValue(); 
		}
	}
	
	public ArrayValue getCopy() {
		Value<?>[] valueCopy = new Value<?>[value.length];
		for (int i = 0; i < value.length; i++) {
			valueCopy[i] = value[i].getCopy();
		}
		return new ArrayValue(valueCopy,type);
	}
}
