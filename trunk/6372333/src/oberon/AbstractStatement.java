package oberon;

import java.io.IOException;

import oberon.data.VariableManager;

public abstract class AbstractStatement {
	protected VariableManager getVariableManager() {
		return VariableManager.getInstance();
	}
	
	public abstract void eval() throws IOException;
}
