package randy.oberon0.main;

import randy.oberon0.interpreter.buildinfunctions.BuildinFunctions;
import randy.oberon0.interpreter.runtime.Program;

public class Main
{
	public static void main(String args[]) throws Exception
	{
		//if (args.length == 1)
		{
			Program p = new Program();
			p.loadProgram("src/test/java/randy/oberon0/test/testscripts/smoketest_quicksort.oberon0", new BuildinFunctions());
			p.run();
		}
		//else
		{
			System.out.println("Expecting one argument: scriptname.oberon0");
		}
	}
}
