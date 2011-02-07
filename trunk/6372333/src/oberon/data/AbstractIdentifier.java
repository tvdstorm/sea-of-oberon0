package oberon.data;

import oberon.IDataType;
import oberon.IIdentifier;
import oberon.Scope;
import oberon.exceptions.UnsupportedException;
import oberon.exceptions.VariableNotFoundInScopeException;

/**
 * The Class AbstractIdentifier, super class for all identifiers
 */
public abstract class AbstractIdentifier implements IIdentifier {
	/* (non-Javadoc)
	 * @see oberon.data.IIdentifier#getDataTypeValue()
	 */
	@Override
	public abstract IDataType getDataTypeValue(Scope currentScope) throws UnsupportedException, VariableNotFoundInScopeException;
	/* (non-Javadoc)
	 * @see oberon.data.IIdentifier#getSelectorValue()
	 */
	@Override
	public abstract int getValue(Scope currentScope) throws UnsupportedException, VariableNotFoundInScopeException;
}
