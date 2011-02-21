package ar.oberon0.values;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import ar.oberon0.ast.dataTypes.CreatableType;
import ar.oberon0.runtime.Context;
import ar.oberon0.runtime.DataField;
import ar.oberon0.shared.TechnicalException;

public class RecordValue extends ValueBase {

	private CreatableType type;
	private Map<String, DataField> members;

	public final DataField getMember(final String name) {
		return members.get(name);
	}

	public final Iterator<Entry<String, DataField>> getMembers() {
		return members.entrySet().iterator();
	}

	public RecordValue(final CreatableType type) {
		this.members = new HashMap<String, DataField>();
		this.type = type;
	}

	@Override
	public Object interpret(final Context context) throws TechnicalException {
		return this;
	}

	public final void addMember(final String name, final DataField field) {
		this.members.put(name, field);
	}

	@Override
	public CreatableType getType() {
		return this.type;
	}

}
