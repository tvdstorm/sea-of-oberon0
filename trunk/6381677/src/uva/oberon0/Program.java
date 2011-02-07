package uva.oberon0;

public class Program {
	public static void main(String args[]) {
		Test.testAll();

		uva.oberon0.abstractsyntax.declarations.Module module = uva.oberon0.parser.Helper
				.createModuleFromFile("D:\\DropBox\\My Dropbox\\UVA\\SC\\Smoke.txt");
		module.eval();

		System.exit(0);
	}
}
