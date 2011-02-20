package edu.uva.sc.oberon0.Evaluators.Structural;

import edu.uva.sc.oberon0.Evaluators.IEvaluator;

public interface IDeclaration extends IEvaluator {

	String GetType(IScope scope);

	String GetName(IScope scope);

	void AddToScope(IScope scope);
}
