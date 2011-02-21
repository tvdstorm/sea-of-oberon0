package ar.oberon0.runtime;

import java.util.ArrayList;
import java.util.List;

import ar.oberon0.ast.statements.StatementSequence;
import ar.oberon0.shared.CheckViolation;
import ar.oberon0.shared.Interpretable;
import ar.oberon0.shared.TechnicalException;

/*
 * A procedure can be invoked by an procedure call node. 
 * This class contains the logic to execute a procedure.
 * A procedure is created by a procedure declaration. 
 */
public class Procedure implements Interpretable {
	private StatementSequence statementsToExecute;
	private Context procedureContext;

	public Procedure(final StatementSequence statementsToExecute, final Context procedureContext) {
		assert statementsToExecute != null : "The statementsToExecute parameter can't be null.";
		assert procedureContext != null : "The procedureContext parameter can't be null.";
		this.procedureContext = procedureContext;
		this.statementsToExecute = statementsToExecute;
	}

	@Override
	public Object interpret(final Context context) throws TechnicalException {
		this.statementsToExecute.interpret(this.procedureContext);
		return 0;
	}

	@Override
	public List<CheckViolation> check(Context context) {
		return new ArrayList<CheckViolation>();
	}

}
