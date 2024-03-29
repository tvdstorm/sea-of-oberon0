package oberon.data;

import oberon.IDataType;
import oberon.Scope;

/**
 * The Class AbstractDataType.
 */
public abstract class AbstractDataType implements IDataType {
	
	/** The name. */
	private String name;
	
	/**
	 * Instantiates a new abstract data type.
	 *
	 * @param inputName the name of the instance
	 */
	public AbstractDataType(final String inputName) {
		name = inputName;
	}
	
	/* (non-Javadoc)
	 * @see oberon.data.IDataType#getValue()
	 */
	@Override
	public abstract int getValue(Scope currentScope);
	/* (non-Javadoc)
	 * @see oberon.data.IDataType#copy(java.lang.String)
	 */
	@Override
	public abstract IDataType performDeepCopy(String newName);
	
	/* (non-Javadoc)
	 * @see oberon.data.IDataType#copy(java.lang.String)
	 */
	@Override
	public IDataType performShallowCopy(String newName){
		name = newName;
		return this;
	}
	
	/* (non-Javadoc)
	 * @see oberon.data.IDataType#getName()
	 */
	@Override
	public String getName() {
		return name;
	}
	
	/* (non-Javadoc)
	 * @see oberon.data.IDataType#setValue(int)
	 */
	@Override
	public void setValue(final int value){
		//nothing to do, specific implementations will be done in derived classes
	}
	
	public void initialize(Scope currentScope){
		//nothing to do, specific implementations will be done in derived classes 
	}
}
