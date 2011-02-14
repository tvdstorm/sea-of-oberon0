package uva.oberon0;

public class Program {
	public static void main(String args[]) {
		Test.testAll();

		uva.oberon0.abstractsyntax.declarations.Module module = 
			//uva.oberon0.parser.Helper.createModuleFromFile("Smoke1.txt");
			uva.oberon0.parser.Helper.createModuleFromFile("Smoke2.txt");
		//module.eval();

		System.exit(0);
	}
}
