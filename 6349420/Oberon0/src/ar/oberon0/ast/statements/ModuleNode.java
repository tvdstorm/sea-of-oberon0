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

	public void setConstants(ConstantList constants) {
		this.context.addConstants(constants);
	}

	public void setTypeIdentifiers(TypeIdentifierList types) {
		this.context.addTypeIdentifiers(types);
	}

	public void setVars(DataFieldList variables) {
		this.context.addVariables(variables);
	}

	public void setChildProcedures(ProcedureList childProcedures) {
		this.context.setProcedures(childProcedures);
	}

	public void setStatements(StatementSequence statementsToExecute) {
		assert statementsToExecute != null : "The statementsToExecute parameter can't be null";
		this.statements = statementsToExecute;
	}

	public ModuleNode(String name) {
		this.name = name;
		this.context = new Context();
	}

	@Override
	public Object interpret(Context context) throws TechnicalException {
		this.statements.interpret(this.context);
		return 0;
	}

	@Override
	public List<CheckViolation> check(Context context) {
		List<CheckViolation> violations = new ArrayList<CheckViolation>();
		violations.addAll(this.statements.check(this.context));
		ProcedureList procedures = this.context.getProcedures();
		for (Entry<String, ProcedureDeclaration> dec : procedures) {
			violations.addAll(dec.getValue().check(context));
		}
		return violations;
	}
}
