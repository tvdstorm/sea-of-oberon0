package edu.uva.sc.oberon0.Evaluators.Selectors;

import edu.uva.sc.oberon0.Evaluators.Structural.IScope;

public interface ISelectable {
	void put(ISelector selector, Object value, IScope scope);
	Object get(ISelector selector, IScope scope);
}
