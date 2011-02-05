package oberon.data;

import oberon.IDataType;
import oberon.IIdentifier;

public abstract class AbstractIdentifier implements IIdentifier {
	/* (non-Javadoc)
	 * @see oberon.data.IIdentifier#getDataTypeValue()
	 */
	@Override
	public abstract IDataType getDataTypeValue();
	/* (non-Javadoc)
	 * @see oberon.data.IIdentifier#getSelectorValue()
	 */
	@Override
	public abstract int getSelectorValue();
}
