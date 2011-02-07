package oberon0.environment;

import java.util.HashMap;

public class RecordValue implements IValue{
private HashMap<String, Reference> _fields;
	
	public RecordValue(HashMap<String, Reference> values){
		_fields = new HashMap<String, Reference>();
		for (String name: values.keySet()){
			_fields.put(name, values.get(name).getCopy());
		}
	}
	
	public Reference getReference(String key){
		return _fields.get(key);
	}
	
	public IValue getValue(String key){
		return _fields.get(key).getValue();
	}
	
	@Override
	public String toString(){
		String buffer = "[ ";
		for (String currentKey: _fields.keySet()){
			buffer += currentKey+ "=" + _fields.get(currentKey).toString() +" ";
		}
		return buffer + " ] ";
	}

	@Override
	public IValue getCopy() {
		return new RecordValue(_fields);
	}
	
	public HashMap<String, Reference> getFields(){
		return _fields;
	}
}
