package com.kootsjur.oberon.type;

import java.util.List;

import com.kootsjur.oberon.environment.Environment;
import com.kootsjur.oberon.value.Field;
import com.kootsjur.oberon.value.FieldList;
import com.kootsjur.oberon.value.Record;
import com.kootsjur.oberon.value.Value;

public class RecordType extends TypeDefinition {
	private List<FieldList> fields;

	public RecordType(List<FieldList> fields) {
		super(DataType.RECORD);
		this.fields = fields;
	}

	public void setFields(List<FieldList> fields) {
		this.fields = fields;
	}

	public List<FieldList> getFields() {
		return fields;
	}

	@Override
	public Value initValue(Environment environment) {
		assert (environment != null) : "Error in RecordType method initValue. Parameter environment is null!";

		Record record = new Record(fields);
		for (FieldList field : fields) {
			Value value = field.getTypeDefinition().initValue(environment);
			for (String name : field.getNames()) {
				record.set(new Field(name), value);
			}
		}
		return record;
	}

}
