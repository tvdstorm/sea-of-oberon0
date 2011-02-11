package nl.bve.uva.oberon.env;

import java.util.Stack;

public class Environment {
	private Stack<Type> variableStack = new Stack<Type>();
	private Stack<Procedure> procedureStack = new Stack<Procedure>();
	
	public Environment() {
		
	}
	
	public void addVariable(Type var) {
		variableStack.push(var);
	}
	
	public void addProcedureStack(Procedure proc) {
		procedureStack.push(proc);
	}
}
