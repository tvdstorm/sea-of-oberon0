package ar.oberon0.interpreter.Procedure;

import java.util.List;

import ar.oberon0.interpreter.Interpretable;
import ar.oberon0.interpreter.StatementSequence;
import ar.oberon0.interpreter.Memory.Context;

public class Procedure implements Interpretable {


	public FormalParameters setFormalParameters;
	public StatementSequence setStatementSequence;
	public List<Procedure> setChildProcedures;
	public Object setVars;
	public Object setTypes;
	public Object setConstants;

	public Procedure(String text) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Object Interpret(Context context) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
