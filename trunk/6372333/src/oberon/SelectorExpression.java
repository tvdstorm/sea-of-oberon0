package oberon;

import oberon.data.AbstractDataType;
import oberon.data.AbstractSelector;

public class SelectorExpression extends AbstractExpression {
	private final AbstractSelector selector;

	public SelectorExpression(final AbstractSelector selectorExp) {
		selector = selectorExp;
	}
	
	public AbstractDataType performDeepCopyOfValue(final String newName) {
		return selector.getDataTypeValue().deepCopy(newName);
	}
	
	public AbstractDataType performShallowCopyOfValue(final String newName) {
		return selector.getDataTypeValue().shallowCopy(newName);
	}
	
	@Override
	public int evalAsInt() {
		return selector.getSelectorValue();
	}

}
