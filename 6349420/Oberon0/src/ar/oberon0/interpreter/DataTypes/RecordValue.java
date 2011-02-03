package ar.oberon0.interpreter.DataTypes;

import java.util.HashMap;
import java.util.Map;

import ar.oberon0.interpreter.TechnicalException;
import ar.oberon0.interpreter.Memory.Context;
import ar.oberon0.interpreter.Memory.DataField;

public class RecordValue implements Value {

	private CreatableType type;
	private Map<String, DataField> members;

	public DataField getMember(String name) {
		return members.get(name);
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
