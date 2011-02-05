package oberon.data;

import oberon.IDataType;
import oberon.IIdentifier;
import oberon.exceptions.UnsupportedException;

/**
 * The Class AbstractIdentifier, super class for all identifiers
 */
public abstract class AbstractIdentifier implements IIdentifier {
	/* (non-Javadoc)
	 * @see oberon.data.IIdentifier#getDataTypeValue()
	 */
	@Override
	public abstract IDataType getDataTypeValue() throws UnsupportedException;
	/* (non-Javadoc)
	 * @see oberon.data.IIdentifier#getSelectorValue()
	 */
	@Override
	public abstract int getValue() throws UnsupportedException;
}
