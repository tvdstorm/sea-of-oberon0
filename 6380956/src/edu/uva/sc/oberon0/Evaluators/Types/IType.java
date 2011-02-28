package edu.uva.sc.oberon0.Evaluators.Types;

import edu.uva.sc.oberon0.Evaluators.IEvaluator;
import edu.uva.sc.oberon0.Evaluators.Structural.IScope;

public interface IType extends IEvaluator  {
	String GetName(IScope scope);
}
