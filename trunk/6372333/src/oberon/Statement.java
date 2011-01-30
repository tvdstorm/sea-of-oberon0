package oberon;

import java.io.IOException;

public abstract class Statement {
	protected VariableManager getVariableManager()
	{
		return VariableManager.getInstance();
	}
	
	public abstract void Eval() throws IOException;
}
