package edu.uva.sc.oberon0.Evaluators.Structural;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import edu.uva.sc.oberon0.Evaluators.IEvaluator;
import edu.uva.sc.oberon0.Evaluators.Types.IType;

public class FieldList implements IEvaluator {
	
	public Map<String, Object> records = new HashMap<String, Object>();
	
	private static final long serialVersionUID = 1L;
	List<String> fieldNames;
	IType fieldsType;
	public FieldList(List<String> identsList, IType type) {
		this.fieldNames = identsList;
		this.fieldsType = type;
		
		for(String field : this.fieldNames) {
			this.records.put(field, this.fieldsType);
		}
	}
	@Override
	public Object evaluate(IScope scope) {
		// TODO Auto-generated method stub
		return null;
	}
}
