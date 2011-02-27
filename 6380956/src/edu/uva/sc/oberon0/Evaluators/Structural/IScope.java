package edu.uva.sc.oberon0.Evaluators.Structural;

import java.io.Serializable;
import java.util.Map;

import edu.uva.sc.oberon0.Evaluators.IEvaluator;

public interface IScope extends Serializable {
	Object GetVarValue(String varName, ISelector selector, IScope scope);
	void SetVarValue(String varName, Object value, ISelector selector, IScope scope);
	void AddToScope(String varName, IType type);
	IScope GetParentScope();
	void SetParentScope(IScope scope);
	ProcedureDeclaration GetProcedure(String procedureName);
}
