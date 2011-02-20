package edu.uva.sc.oberon0.Evaluators;

import edu.uva.sc.oberon0.Evaluators.Structural.IScope;

public interface IEvaluator {
	Object evaluate(IScope scope);
	String toString();
}
