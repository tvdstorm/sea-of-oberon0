package edu.uva.sc.oberon0.Structures;

import java.util.List;

import edu.uva.sc.oberon0.Evaluators.IEvaluator;

public class ProcedureCall implements IStatement {
	String procedureName;
	List<IEvaluator> parameters;
}
