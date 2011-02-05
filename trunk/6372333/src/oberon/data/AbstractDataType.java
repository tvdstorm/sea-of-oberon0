package oberon.data;

import oberon.IDataType;

public abstract class AbstractDataType implements IDataType {
	private final String name;
	
	public AbstractDataType(final String inputName) {
		name = inputName;
	}
	
	/* (non-Javadoc)
	 * @see oberon.data.IDataType#getValue()
	 */
	@Override
	public abstract int getValue();
	/* (non-Javadoc)
	 * @see oberon.data.IDataType#copy(java.lang.String)
	 */
	@Override
	public abstract IDataType copy(String newName);
	
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
}
