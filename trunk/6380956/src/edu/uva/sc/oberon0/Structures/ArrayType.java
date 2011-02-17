package edu.uva.sc.oberon0.Structures;

import edu.uva.sc.oberon0.Evaluators.IEvaluator;

public class ArrayType implements IType {
	IEvaluator expression;
	IType type;
	ArraySelector selector;
}
