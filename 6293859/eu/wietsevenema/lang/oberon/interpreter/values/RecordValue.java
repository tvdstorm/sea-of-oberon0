package eu.wietsevenema.lang.oberon.interpreter.values;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import eu.wietsevenema.lang.oberon.ast.expressions.Identifier;
import eu.wietsevenema.lang.oberon.exceptions.NotImplementedException;
import eu.wietsevenema.lang.oberon.interpreter.ValueReference;

public class RecordValue extends Value {

	private Map<Identifier, ValueReference> values;

	public RecordValue(Map<Identifier, ValueReference> values) {
		this.values = values;
	}

	@Override
	public boolean equals(Object o) {
		throw new NotImplementedException();
	}

	@Override
	public Object clone() {
		TreeMap<Identifier, ValueReference> clone = new TreeMap<Identifier, ValueReference>();

		for (Map.Entry<Identifier, ValueReference> entry : values.entrySet()) {
			clone.put(entry.getKey(), new ValueReference((Value) entry.getValue().getValue().clone()));
		}

		return new RecordValue(clone);
	}
	
	public ValueReference getReference( Identifier id){
		return this.values.get(id);
	}

	
	public Set<Entry<Identifier,ValueReference>> entrySet() {
		return values.entrySet();
	}
		
	
	@Override
	public void init() {
		//This value is initialised by design. 
	}
	

}
