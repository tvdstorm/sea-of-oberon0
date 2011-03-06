package edu.uva.sc.oberon0.Evaluators.Types;

import java.util.LinkedList;
import java.util.List;

import edu.uva.sc.oberon0.Evaluators.Selectors.ISelectable;
import edu.uva.sc.oberon0.Evaluators.Selectors.ISelector;
import edu.uva.sc.oberon0.Evaluators.Structural.FieldList;
import edu.uva.sc.oberon0.Evaluators.Structural.IScope;
import edu.uva.sc.oberon0.Evaluators.Selectors.RecordSelector;

public class RecordType implements IType, ISelectable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public List<FieldList> fieldLists;

	public RecordType() {
		fieldLists = new LinkedList<FieldList>();
	}
	
	@Override
	public Object evaluate(IScope scope) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String GetName(IScope scope) {
		// TODO Auto-generated method stub
		return null;
	}

	public void AddFieldList(FieldList fieldList) {
		fieldLists.add(fieldList);
	}

	@Override
	public void put(ISelector selector, Object value, IScope scope) {
		if(selector.GetChildSelector() != null) {
			ISelectable childRecord = (ISelectable)this.getLocal(selector, scope);
			childRecord.put(selector.GetChildSelector(), value, scope);
			return;
		}
		
		String fieldName = (String)((RecordSelector)selector).evaluate(scope);
		
		for (FieldList fieldList : this.fieldLists) {
			
			if(fieldList.records.containsKey(fieldName)) {
				fieldList.records.put(fieldName, value);
				return;
			}
			
		}
	}

	@Override
	public Object get(ISelector selector, IScope scope) {
		if(selector.GetChildSelector() != null) {
			ISelectable childRecord = (ISelectable)this.getLocal(selector, scope);
			return childRecord.get(selector.GetChildSelector(), scope);
		}
		
		return getLocal(selector, scope);
	}
	
	private Object getLocal(ISelector selector, IScope scope) {
		String fieldName = (String)((RecordSelector)selector).evaluate(scope);
		for (FieldList fieldList : this.fieldLists) {
			
			if(fieldList.records.containsKey(fieldName)) {
				return fieldList.records.get(fieldName);
			}
			
		}
		
		return null;
	}
}
