package edu.uva.sc.oberon0.Structures;

import edu.uva.sc.oberon0.Evaluators.IEvaluator;

public class Assignment {
	
	private IVariable ident;
	private ISelector selector;
	private IEvaluator assignmentValue;
	
	public Boolean go() {
		return Variables.assign(ident, selector, assignmentValue);
	}
	public Assignment(IVariable ident, ISelector selector, IEvaluator assignmentValue) {
		super();
		this.ident = ident;
		this.selector = selector;
		this.assignmentValue = assignmentValue;
	}
}

