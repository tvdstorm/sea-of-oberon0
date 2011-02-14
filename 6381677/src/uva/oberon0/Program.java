package uva.oberon0;

public class Program {
	public static void main(String args[]) {
		Test.testAll();

		uva.oberon0.parser.Helper.createModuleFromFile("Smoke1.txt").checkTypes();
		uva.oberon0.parser.Helper.createModuleFromFile("Smoke2.txt").checkTypes();

		System.exit(0);
	}
}
