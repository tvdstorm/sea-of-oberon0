package oberon0.value;

import oberon0.environment.Environment;
import oberon0.selector.Selector;
import oberon0.type.Type;

public abstract class Value <T> extends Object{
	
	protected T value;
	protected Type type;
	
	public Value(T value, Type type) {
		this.value = value;
		this.type = type;
	}
	
	public T getTrueValue() {
		return value;
	}
	
	public void setTrueValue(T value) {
		this.value = value;
	}
	
	public abstract <R extends Object>R getValue(Selector selector, Environment env);
	
	public abstract void setValue(Selector selector, Environment env, Value<?> setValue);
	
	public abstract Value<T> getCopy();
	
	public static boolean isValueType(Object object) {
		Class<?> objectClass = object.getClass();
		return (objectClass.getSuperclass() == Value.class);
	}
	
	public String toString(){
		return value.toString();
	}
	
	public Type getType() {
		return type;
	}
}
