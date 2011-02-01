package oberon;

import oberon.data.DataType;
import oberon.data.Selector;

public class SelectorExpression extends Expression {
	private Selector _selector;

	public SelectorExpression(Selector selector){
		_selector = selector;
	}
	
	public DataType performDeepCopyOfValue(String newName){
		return _selector.getDataTypeValue().DeepCopy(newName);
	}
	
	public DataType performShallowCopyOfValue(String newName){
		return _selector.getDataTypeValue().ShallowCopy(newName);
	}
	
	@Override
	public int EvalAsInt() {
		return _selector.getSelectorValue();
	}

}
