package ar.oberon0.ast.statements;

import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;

import ar.oberon0.ast.declarations.ProcedureDeclaration;
import ar.oberon0.lists.ConstantList;
import ar.oberon0.lists.DataFieldList;
import ar.oberon0.lists.ProcedureList;
import ar.oberon0.lists.TypeIdentifierList;
import ar.oberon0.runtime.Context;
import ar.oberon0.shared.CheckViolation;
import ar.oberon0.shared.Interpretable;
import ar.oberon0.shared.TechnicalException;

/*
 * The module node contains a list of statements that needs to be executed. It also contains a context containing the constants, variables, procedures, etc that are reachable form this node.
 */
public class ModuleNode implements Interpretable {

	private Context context;
	private String name;
	private StatementSequence statements;

	public final void setConstants(final ConstantList constants) {
		this.context.addConstants(constants);
	}

	public final void setTypeIdentifiers(final TypeIdentifierList types) {
		this.context.addTypeIdentifiers(types);
	}

	public final void setVars(final DataFieldList variables) {
		this.context.addVariables(variables);
	}

	public final void setChildProcedures(final ProcedureList childProcedures) {
		this.context.setProcedures(childProcedures);
	}

	public final void setStatements(final StatementSequence statementsToExecute) {
		assert statementsToExecute != null : "The statementsToExecute parameter can't be null";
		this.statements = statementsToExecute;
	}

	public ModuleNode(final String name) {
		this.name = name;
		this.context = new Context();
	}

	@Override
	public Object interpret(final Context context) throws TechnicalException {
		this.statements.interpret(this.context);
		return 0;
	}

	@Override
	public List<CheckViolation> check(final Context context) {
		List<CheckViolation> violations = new ArrayList<CheckViolation>();
		violations.addAll(this.statements.check(this.context));
		ProcedureList procedures = this.context.getProcedures();
		for (Entry<String, ProcedureDeclaration> dec : procedures) {
			violations.addAll(dec.getValue().check(context));
		}
		return violations;
	}
}
