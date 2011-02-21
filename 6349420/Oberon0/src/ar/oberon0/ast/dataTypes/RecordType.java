package ar.oberon0.ast.dataTypes;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import ar.oberon0.lists.FieldList;
import ar.oberon0.runtime.Context;
import ar.oberon0.runtime.DataField;
import ar.oberon0.shared.TechnicalException;
import ar.oberon0.values.RecordValue;
import ar.oberon0.values.Value;

public class RecordType implements CreatableType {

	private Map<String, CreatableType> members;

	public RecordType() {
		this.members = new HashMap<String, CreatableType>();
	}

	public final void addFieldList(final FieldList fieldList) {
		if (fieldList != null) {
			for (String fieldName : fieldList.getFieldNames()) {
				this.members.put(fieldName, fieldList.getType());
			}
		}
	}

	@Override
	public Value createInstance(final Context context) throws TechnicalException {
		RecordValue recordValue = new RecordValue(this);
		Iterator<Entry<String, CreatableType>> it = members.entrySet().iterator();
		while (it.hasNext()) {
			Entry<String, CreatableType> entry = it.next();
			recordValue.addMember(entry.getKey(), new DataField(entry.getValue()));
		}
		return recordValue;
	}

	@Override
	public boolean equals(Object objectToCompare) {
		if (objectToCompare instanceof RecordType) {
			return true;
		}
		return false;
	}

}
