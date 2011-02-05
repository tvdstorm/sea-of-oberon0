package oberon;

import java.io.IOException;

import oberon.data.VariableManager;

public abstract class AbstractStatement implements IStatement {
	protected VariableManager getVariableManager() {
		return VariableManager.getInstance();
	}
	
	/* (non-Javadoc)
	 * @see oberon.IStatement#eval()
	 */
	@Override
	public abstract void eval() throws IOException;
}
