package oberon0;

public class interpreter {

	public static void main(String[] args) throws Exception {
		Program program = new Program();
		program.loadFromFile("oberonfiles/sample.oberon0");
		program.execute();
		//program.printTree();
	}

}
