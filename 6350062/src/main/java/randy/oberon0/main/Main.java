package randy.oberon0.main;

import randy.oberon0.interpreter.buildinfunctions.BuildinFunctions;
import randy.oberon0.interpreter.runtime.Program;

public class Main
{
	public static void main(String args[]) throws Exception
	{
		Program p = new Program();
		p.loadProgram("test/quicksort.oberon0", new BuildinFunctions());
		p.run();
	}
}
