package jdm.oberon0.ast;

import java.util.HashMap;

public class Record extends AbstractType {
	private HashMap<String, AbstractType> _fields;
	
	public Record(HashMap<String, AbstractType> fields) {
		_fields = fields;
	}
	
	public HashMap<String, AbstractType> getFields() {
		return _fields;
	}
}
