package oberon0;

public class Oberon0Interpreter {

	public static void main(String[] args) throws Exception {
		Oberon0Program program = new Oberon0Program();
		program.loadFromFile("oberonfiles/sample.oberon0");
		program.execute();
		//program.printTree();
	}

}
