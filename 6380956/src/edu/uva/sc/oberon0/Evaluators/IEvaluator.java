package edu.uva.sc.oberon0.Evaluators;

import java.io.Serializable;

import edu.uva.sc.oberon0.Evaluators.Structural.IScope;

public interface IEvaluator extends Serializable {
	Object evaluate(IScope scope);
	String toString();
}
