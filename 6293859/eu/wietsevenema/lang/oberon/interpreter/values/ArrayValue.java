package eu.wietsevenema.lang.oberon.interpreter.values;

import eu.wietsevenema.lang.oberon.interpreter.ValueReference;

public class ArrayValue extends Value {

	private ValueReference[] values;
	
	public ArrayValue(Value template, Integer size) {
		this.values = new ValueReference[size.intValue()];
		for (int i = 0; i < values.length; i++) {
			values[i] = new ValueReference((Value)template.clone());
		}
	}
	
	private ArrayValue(ValueReference[] values){
		this.values = values;
	}

	@Override
	public boolean equals(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object clone() {
		int size = this.values.length;
		ValueReference[] values = new ValueReference[size];
		for (int i = 0; i < size; i++) {
			values[i] = new ValueReference(	
							(Value)this.values[i].getValue().clone()
						);
		}
		return new ArrayValue(values);
	}

	public ValueReference getReference(int index) {
		return values[index];
	}

}
