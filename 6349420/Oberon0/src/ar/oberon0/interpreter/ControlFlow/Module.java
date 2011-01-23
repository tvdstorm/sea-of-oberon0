package ar.oberon0.interpreter.ControlFlow;

import java.util.List;

import ar.oberon0.interpreter.Interpretable;
import ar.oberon0.interpreter.Statement;
import ar.oberon0.interpreter.StatementSequence;
import ar.oberon0.interpreter.Lists.ConstantList;
import ar.oberon0.interpreter.Lists.TypeIdentifierList;
import ar.oberon0.interpreter.Lists.VarList;
import ar.oberon0.interpreter.Memory.Context;
import ar.oberon0.interpreter.Memory.Var;
import ar.oberon0.interpreter.Procedure.Procedure;

public class Module implements Interpretable {

	private Context _context;
	
	private String _name;
	private List<Procedure> _childProcedures;
	private StatementSequence _statements;
	
	public void setConstants(ConstantList constants)
	{
		_context.AddConstants(constants);
	}
	
	public void setTypeIdentifiers(TypeIdentifierList types) 
	{
		_context.AddTypeIdentifiers(types);
	}

	public void setVars(VarList variables) 
	{
		_context.AddVariables(variables);
	}

	public void setChildProcedures(List<Procedure> childProcedures) 
	{
		_childProcedures = childProcedures;
	}
	
	public void setStatements(StatementSequence statements)
	{
		_statements = statements;
	}

	public Module(String name) {
		_name = name;
		_context = new Context();
	}

	@Override
	public Object Interpret(Context context) throws Exception {
		_statements.Interpret(_context);
		return 0;
	}

}
