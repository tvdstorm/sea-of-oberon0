package jdm.oberon0.ast.types;

import java.util.HashMap;


public class RecordType extends Type {
	private HashMap<String, Type> _fields;
	
	public RecordType(HashMap<String, Type> fields) {
		_fields = fields;
	}
	
	public HashMap<String, Type> getFields() {
		return _fields;
	}
	
	@Override
	public <T> T accept(TypeVisitor<T> visitor) {
		return visitor.visitRecord(this);
	}
}
