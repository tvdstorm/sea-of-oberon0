package edu.uva.sc.oberon0.Structures;

import java.util.List;

import edu.uva.sc.oberon0.Evaluators.IEvaluator;

public class WhileStatement implements IStatement {
	IEvaluator condition;
	List<IStatement> statements;
}
