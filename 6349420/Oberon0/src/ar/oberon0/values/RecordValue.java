package ar.oberon0.values;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import ar.oberon0.ast.dataTypes.CreatableType;
import ar.oberon0.runtime.Context;
import ar.oberon0.runtime.DataField;
import ar.oberon0.shared.TechnicalException;

public class RecordValue implements Value {

	private CreatableType type;
	private Map<String, DataField> members;

	public DataField getMember(String name) {
		return members.get(name);
	}

	public Iterator<Entry<String, DataField>> getMembers() {
		return members.entrySet().iterator();
	}

	public RecordValue(CreatableType type) {
		this.members = new HashMap<String, DataField>();
		this.type = type;
	}

	@Override
	public Object interpret(Context context) throws TechnicalException {
		return this;
	}

	public void addMember(String name, DataField field) {
		this.members.put(name, field);
	}

	@Override
	public CreatableType getType() {
		return this.type;
	}

}
