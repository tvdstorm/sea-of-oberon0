package edu.uva.sc.oberon0.Evaluators.Boolean;

import edu.uva.sc.oberon0.Evaluators.IEvaluator;
import edu.uva.sc.oberon0.Evaluators.Structural.IScope;

public interface IBool extends IEvaluator {
	Boolean evaluate(IScope scope);
	String toString(IScope scope);
}
