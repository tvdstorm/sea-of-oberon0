package edu.uva.sc.oberon0.Evaluators.Selectors;

import edu.uva.sc.oberon0.Evaluators.IEvaluator;

public interface ISelector extends IEvaluator {

	void SetBottomChildSelector(ISelector sel);
	void SetChildSelector(ISelector selector);
	ISelector GetChildSelector();

}
