package oberon.expressions;

import oberon.IDataType;
import oberon.IIdentifier;

public class SelectorExpression extends AbstractExpression {
	private final IIdentifier selector;

	public SelectorExpression(final IIdentifier selectorExp) {
		selector = selectorExp;
	}
	
	public IDataType copy(final String newName) {
		return selector.getDataTypeValue().copy(newName);
	}
	
	@Override
	public int evalAsInt() {
		return selector.getValue();
	}

}
