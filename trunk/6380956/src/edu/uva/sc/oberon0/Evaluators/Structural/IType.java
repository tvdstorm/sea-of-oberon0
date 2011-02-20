package edu.uva.sc.oberon0.Evaluators.Structural;

import edu.uva.sc.oberon0.Evaluators.IEvaluator;

public interface IType extends IEvaluator  {
	String GetName(IScope scope);
}
