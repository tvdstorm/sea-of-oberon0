package oberon0.environment;

public class EnvObject {
	 
	private Object object;
	private final boolean isMutable;
	
	public EnvObject(Object object, boolean isMutable) {
		this.object = object;
		this.isMutable = isMutable;
	}
	
	public Object getObject() {
		return object;
	}
	
	public void setObject(Object object) {
		this.object = object;
	}
	
	public boolean isMutable() {
		return isMutable;
	}
}
