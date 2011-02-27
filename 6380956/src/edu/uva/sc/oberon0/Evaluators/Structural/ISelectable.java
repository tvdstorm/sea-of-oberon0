package edu.uva.sc.oberon0.Evaluators.Structural;

public interface ISelectable {
	void put(ISelector selector, Object value, IScope scope);
	Object get(ISelector selector, IScope scope);
}
