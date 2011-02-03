package ar.oberon0.interpreter.DataTypes;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import ar.oberon0.interpreter.TechnicalException;
import ar.oberon0.interpreter.Lists.FieldList;
import ar.oberon0.interpreter.Memory.Context;
import ar.oberon0.interpreter.Memory.DataField;

/*
 * This class is not yet implemented.
 * This class is used to create oberon 0 record types.
 */
public class RecordType implements CreatableType {

	private Map<String, CreatableType> members;

	public RecordType() {
		this.members = new HashMap<String, CreatableType>();
	}

	public void addFieldList(FieldList fieldList) {
		if (fieldList != null) {
			for (String fieldName : fieldList.getFieldNames()) {
				this.members.put(fieldName, fieldList.getType());
			}
		}
	}

	@Override
	public Value createInstance(Context context) throws TechnicalException {
		RecordValue recordValue = new RecordValue(this);
		Iterator it = members.entrySet().iterator();
		while (it.hasNext()) {
			Entry<String, CreatableType> entry = (Entry<String, CreatableType>) it.next();
			recordValue.addMember(entry.getKey(), new DataField(entry.getValue()));
		}
		return recordValue;
	}

}
