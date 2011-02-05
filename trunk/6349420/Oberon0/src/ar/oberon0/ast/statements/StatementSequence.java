package ar.oberon0.ast.statements;

import java.util.ArrayList;
import java.util.List;

import junit.framework.Assert;
import ar.oberon0.runtime.Context;
import ar.oberon0.shared.Interpretable;
import ar.oberon0.shared.TechnicalException;

/*
 * This class contains a list of statements that need to be executed sequentially.
 */
public class StatementSequence implements Interpretable {

	private List<Interpretable> statements;

	public StatementSequence(Interpretable statement) {
		Assert.assertNotNull("The statement parameter can't be null.", statement);
		this.statements = new ArrayList<Interpretable>();
		addStatement(statement);
	}

	@Override
	public Object interpret(Context context) throws TechnicalException {
		for (Interpretable statement : this.statements) {
			statement.interpret(context);
		}
		return 0;
	}

	public void addStatement(Interpretable statement) {
		Assert.assertNotNull("The statement parameter can't be null.", statement);
		this.statements.add(statement);
	}

}