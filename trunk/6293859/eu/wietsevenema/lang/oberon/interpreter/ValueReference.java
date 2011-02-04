package eu.wietsevenema.lang.oberon.interpreter;

import eu.wietsevenema.lang.oberon.exceptions.ImmutableException;
import eu.wietsevenema.lang.oberon.exceptions.TypeMismatchException;
import eu.wietsevenema.lang.oberon.interpreter.values.Value;

public class ValueReference {

	private Value value;
	private boolean constant = false;
	
	public ValueReference( Value value ){
		assert(value != null);
		this.value = value;
	}
	
	private ValueReference(Value value, boolean constant){
		assert(value != null);
		
		this.constant = constant;
		this.value = value;
	}
	
	
	public static ValueReference createConstant( Value value ){
		//Constructors met boolean parameters zijn verwarrend. 
		return new ValueReference(value, true);
	}

	public Value getValue() {
		return value;
	}
	
	/*
	 * Bewust gekozen om constanten niet met subclass op te lossen; 
	 * is een violatie van Liskov substitutie principe. 
	 */
	public void setValue(Value value) throws TypeMismatchException, ImmutableException {
		if(this.isConstant()){
			throw new ImmutableException("Setting a constant is not possible.");
		}
		if(this.value.getClass() == value.getClass()){
			this.value = value;
		} else {
			throw new TypeMismatchException();
		}
	}

	private boolean isConstant() {
		return this.constant ;
	}
	
	
}
