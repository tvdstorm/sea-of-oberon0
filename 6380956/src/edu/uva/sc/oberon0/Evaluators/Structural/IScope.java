package edu.uva.sc.oberon0.Evaluators.Structural;

import java.io.Serializable;
import java.util.Map;

import edu.uva.sc.oberon0.Evaluators.IEvaluator;

public interface IScope extends Serializable {
	Object GetVarValue(String varName);
	void SetVarValue(String varName, Object value);
	void AddToScope(String varName);
	IScope GetParentScope();
	void SetParentScope(IScope scope);
	ProcedureDeclaration GetProcedure(String procedureName);
}
