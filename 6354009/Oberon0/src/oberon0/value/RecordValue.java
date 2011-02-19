package oberon0.value;

import java.util.HashMap;

import oberon0.environment.Environment;
import oberon0.selector.DotSelector;
import oberon0.selector.Selector;
import oberon0.type.Type;

public class RecordValue extends Value<HashMap<String,Value<?>>> {

	public RecordValue(HashMap<String, Value<?>> value, Type type) {
		super(value, type);
	}
	
	@Override
	@SuppressWarnings("unchecked")
	public Value<?> getValue(Selector selector, Environment env) {
		if (selector != null) {
			DotSelector dotSel = (DotSelector)selector;
			String identifier = dotSel.getIdentifier();
			Value<?> retVal = value.get(identifier);      
			return retVal.getValue(selector.getNestedSelector(), env);
		}
		else {
			return this; 
		}
	}

	@SuppressWarnings("unchecked")
	public void setValue(Selector selector, Environment env, Value<?> setVal) {	
		if (selector != null) {
			DotSelector dotSel = (DotSelector)selector;
			String identifier = dotSel.getIdentifier();
			value.put(identifier,setVal);
		}
		else {
			assert(setVal.getClass() == RecordValue.class):"Setting value to incorrect type";
			value = (HashMap<String,Value<?>>)setVal.getTrueValue(); 
		}
	}
	
	@Override
	public Value<HashMap<String, Value<?>>> getCopy() {
		HashMap<String,Value<?>> valueCopy = new HashMap<String,Value<?>>();
		for (String key : value.keySet()) {
			valueCopy.put(key, value.get(key).getCopy());
		}
		return new RecordValue(valueCopy, getType());
	}

}
