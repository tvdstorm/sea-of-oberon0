package oberon.statement;

import java.io.IOException;

import oberon.IStatement;
import oberon.Scope;

/**
 * The Class WriteLnProcStatement, implements the writeln system procedure.
 */
public class WriteLnProcStatement implements IStatement {

	/* (non-Javadoc)
	 * @see oberon.IStatement#eval(oberon.Scope)
	 */
	@Override
	public void eval(Scope currentScope) throws IOException {
		System.out.println();
	}

}
