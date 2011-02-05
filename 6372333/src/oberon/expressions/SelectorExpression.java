package oberon.expressions;

import oberon.data.AbstractDataType;
import oberon.data.AbstractIdentifier;

public class SelectorExpression extends AbstractExpression {
	private final AbstractIdentifier selector;

	public SelectorExpression(final AbstractIdentifier selectorExp) {
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
