package oberon.data;

public abstract class AbstractDataType {
	private final String name;
	
	public AbstractDataType(final String inputName) {
		name = inputName;
	}
	
	public abstract int getValue();
	public abstract AbstractDataType deepCopy(String newName);
	public abstract AbstractDataType shallowCopy(String newName);
	
	public String getName() {
		return name;
	}
	
	public void setValue(final int value){
		//nothing to do, specific implementations will be done in derived classes
	}
}
