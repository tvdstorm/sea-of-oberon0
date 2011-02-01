package oberon;

import java.io.IOException;

import oberon.data.VariableManager;

public abstract class Statement {
	protected VariableManager getVariableManager()
	{
		return VariableManager.getInstance();
	}
	
	public abstract void Eval() throws IOException;
}
