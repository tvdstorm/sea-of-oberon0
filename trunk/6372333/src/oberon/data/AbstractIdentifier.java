package oberon.data;

import oberon.IDataType;
import oberon.IIdentifier;
import oberon.Scope;

/**
 * The Class AbstractIdentifier, super class for all identifiers
 */
public abstract class AbstractIdentifier implements IIdentifier {
	/* (non-Javadoc)
	 * @see oberon.data.IIdentifier#getDataTypeValue()
	 */
	@Override
	public abstract IDataType getDataTypeValue(Scope currentScope);
	/* (non-Javadoc)
	 * @see oberon.data.IIdentifier#getSelectorValue()
	 */
	@Override
	public abstract int getValue(Scope currentScope);
	
	/* (non-Javadoc)
	 * @see oberon.IIdentifier#getText()
	 */
	@Override
	public abstract String getText();
}
