package ar.oberon0.interpreter.ControlFlow;

import ar.oberon0.interpreter.Interpretable;
import ar.oberon0.interpreter.TechnicalException;
import ar.oberon0.interpreter.Lists.ConstantList;
import ar.oberon0.interpreter.Lists.DataFieldList;
import ar.oberon0.interpreter.Lists.ProcedureList;
import ar.oberon0.interpreter.Lists.TypeIdentifierList;
import ar.oberon0.interpreter.Memory.Context;

/*
 * The module node contains a list of statements that needs to be executed. It also contains a context containing the constants, variables, procedures, etc that are reachable form this node.
 */
public class ModuleNode implements Interpretable
{
	/*
	 * The context containing the procedures, constants, varaibles, ect.
	 */
	private Context _context;

	/*
	 * The name of this module.
	 */
	private String _name;
	/*
	 * The statements to execute.
	 */
	private StatementSequence _statements;

	/*
	 * Add the constants to the context of this node.
	 */
	public void setConstants(ConstantList constants)
	{
		_context.AddConstants(constants);
	}

	/*
	 * Add the type identifiers to the context of this node.
	 */
	public void setTypeIdentifiers(TypeIdentifierList types)
	{
		_context.AddTypeIdentifiers(types);
	}

	/*
	 * Add the variables to the context of this node.
	 */
	public void setVars(DataFieldList variables)
	{
		_context.AddVariables(variables);
	}

	/*
	 * Add the procedures that are defined in this module to the context.
	 */
	public void setChildProcedures(ProcedureList childProcedures)
	{
		_context.setProcedures(childProcedures);
	}

	/*
	 * Set the statements that need to be executed when this node is
	 * interpreted.
	 */
	public void setStatements(StatementSequence statements)
	{
		_statements = statements;
	}

	/*
	 * Create a new module node, the name becomes the name of this module.
	 */
	public ModuleNode(String name)
	{
		_name = name;
		_context = new Context();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ar.oberon0.interpreter.Interpretable#Interpret(ar.oberon0.interpreter
	 * .Memory.Context)
	 */
	@Override
	public Object Interpret(Context context) throws TechnicalException
	{
		_statements.Interpret(_context);
		return 0;
	}

}
