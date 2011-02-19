package oberon0.type;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import oberon0.environment.Environment;
import oberon0.value.Value;
import oberon0.value.RecordValue;

public class RecordType implements Type {

	private ArrayList<RecordField>fields;
	
	public RecordType() {
		fields = new ArrayList<RecordField>();
	}

	@Override
	public RecordValue createTypeValue(Environment env) {
		HashMap<String,Value<?>>fieldMap = new HashMap<String, Value<?>>();
		for (RecordField field : fields) {
			String ident = field.getIdentifier();
			Value<?> val = field.getType().createTypeValue(env);
			fieldMap.put(ident, val);
		}
		
		return new RecordValue(fieldMap,this);
	}
	
	public void addFields(List<RecordField>fields) {
		this.fields.addAll(fields);
	}

}
