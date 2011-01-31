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
public class ModuleNode implements Interpretable {
	/*
	 * The context containing the procedures, constants, varaibles, ect.
	 */
	private Context context;

	/*
	 * The name of this module.
	 */
	private String name;
	/*
	 * The statements to execute.
	 */
	private StatementSequence statements;

	/*
	 * Add the constants to the context of this node.
	 */
	public void setConstants(ConstantList constants) {
		this.context.addConstants(constants);
	}

	/*
	 * Add the type identifiers to the context of this node.
	 */
	public void setTypeIdentifiers(TypeIdentifierList types) {
		this.context.addTypeIdentifiers(types);
	}

	/*
	 * Add the variables to the context of this node.
	 */
	public void setVars(DataFieldList variables) {
		this.context.addVariables(variables);
	}

	/*
	 * Add the procedures that are defined in this module to the context.
	 */
	public void setChildProcedures(ProcedureList childProcedures) {
		this.context.setProcedures(childProcedures);
	}

	/*
	 * Set the statements that need to be executed when this node is
	 * interpreted.
	 */
	public void setStatements(StatementSequence statements) {
		this.statements = statements;
	}

	/*
	 * Create a new module node, the name becomes the name of this module.
	 */
	public ModuleNode(String name) {
		this.name = name;
		this.context = new Context();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ar.oberon0.interpreter.Interpretable#Interpret(ar.oberon0.interpreter
	 * .Memory.Context)
	 */
	@Override
	public Object interpret(Context context) throws TechnicalException {
		this.statements.interpret(this.context);
		return 0;
	}

}
