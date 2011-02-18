package randy.oberon0.main;

import randy.oberon0.interpreter.buildinprocedures.BuildinProcedures;
import randy.oberon0.interpreter.runtime.Program;

public class Main
{
	public static void main(String args[]) throws Exception
	{
		if (args.length == 1)
		{
			Program p = new Program();
			p.loadProgram(args[0], new BuildinProcedures());
			p.run();
		}
		else
		{
			System.out.println("Expecting one argument: scriptname.oberon0");
		}
	}
}
