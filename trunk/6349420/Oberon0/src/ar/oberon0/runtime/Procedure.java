package ar.oberon0.runtime;

import junit.framework.Assert;
import ar.oberon0.ast.statements.StatementSequence;
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
		Assert.assertNotNull("The statementsToExecute parameter can't be null.", statementsToExecute);
		Assert.assertNotNull("The procedureContext parameter can't be null.", procedureContext);
		this.procedureContext = procedureContext;
		this.statementsToExecute = statementsToExecute;
	}

	@Override
	public Object interpret(final Context context) throws TechnicalException {
		this.statementsToExecute.interpret(this.procedureContext);
		return 0;
	}

}
