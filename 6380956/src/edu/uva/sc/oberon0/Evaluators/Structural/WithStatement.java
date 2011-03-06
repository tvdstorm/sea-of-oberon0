package edu.uva.sc.oberon0.Evaluators.Structural;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import edu.uva.sc.oberon0.Evaluators.IEvaluator;
import edu.uva.sc.oberon0.Evaluators.Selectors.ISelectable;
import edu.uva.sc.oberon0.Evaluators.Selectors.ISelector;
import edu.uva.sc.oberon0.Evaluators.Selectors.RecordSelector;
import edu.uva.sc.oberon0.Evaluators.Types.IType;
import edu.uva.sc.oberon0.Evaluators.Types.RecordType;

public class WithStatement implements IStatement, IScope {

	List<IStatement> statementSequence;
	IEvaluator withObj;
	Map<String, Object> refs = new HashMap<String, Object>();
	private IScope parentScope;
	
	public WithStatement(IEvaluator exp, List<IStatement> statementSequence) {
		this.statementSequence = statementSequence;
		this.withObj = exp;
	}

	@Override
	public Object evaluate(IScope scope) {
		SetParentScope(scope);
		((VariableRef)withObj).getDeepest = false;
		
		RecordType withRecordType = (RecordType)withObj.evaluate(scope);
		VariableRef topRef = ((VariableRef)withObj).GetRootRef(scope);
		for (FieldList fList : withRecordType.fieldLists) {
			for (String withRecordField : fList.fieldNames) {
				ISelector selector;
				if(topRef.selector != null) {
					selector = new RecordSelector(((RecordSelector)topRef.selector).GetFieldName());
					selector.SetChildSelector(new RecordSelector(withRecordField));
				} else {
					selector = new RecordSelector(withRecordField);
				}
				this.refs.put(withRecordField, new VariableRef(topRef.name, selector, topRef.scope));
			}
			
		}
		
		if(statementSequence != null){
			for (IStatement stat : statementSequence) {
				stat.evaluate(this);
			}
		}
		return null;
	}

	@Override
	public Object GetVarValue(String varName, ISelector selector, IScope scope) {
		Object result = refs.get(varName);
		if(result == null){
			result = this.parentScope.GetVarValue(varName, selector, scope);
		} else if(selector != null && result != null && !VariableRef.IsMyType(result)) {
			result = ((ISelectable)result).get(selector, this);
		}
		if(VariableRef.IsMyType(result) && selector != null) {
			((VariableRef)result).selector = selector;
		}
		return result;
	}
	@Override
	public void SetVarValue(String varName, Object value, ISelector selector, IScope scope) {

		if(!refs.containsKey(varName)) {
			parentScope.SetVarValue(varName, value, selector, scope);
		} else {
			
			Object var = refs.get(varName);
			if(selector != null && var != null) {
				((ISelectable)var).put(selector, value, scope);
				value = var;
			}
			
			this.refs.put(varName, value);
		}	
	}

	@Override
	public void AddToScope(String varName, IType type) {
		if(!refs.containsKey(varName)) {
			this.refs.put(varName, type);
		}
	}

	@Override
	public IScope GetParentScope() {
		return this.parentScope;
	}
	@Override
	public void SetParentScope(IScope scope) {
		this.parentScope = scope;
	}

	@Override
	public ProcedureDeclaration GetProcedure(String procedureName) {
		return (ProcedureDeclaration)GetVarValue(procedureName, null, null);
	}

}
