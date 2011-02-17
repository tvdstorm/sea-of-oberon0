package edu.uva.sc.oberon0.Structures;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import edu.uva.sc.oberon0.Evaluators.IEvaluator;

public class Module {
	String name;
	List<IDeclaration> declarations;
	List<IStatement> statements;
	public Map<Variable, IEvaluator> vars;
	
}
