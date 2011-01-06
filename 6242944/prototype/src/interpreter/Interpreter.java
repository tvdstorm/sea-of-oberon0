package interpreter;

import ast.Module;
import ast.Visitor;

public class Interpreter extends Visitor<String> {

	@Override
	public String visit(Module m) {
		return null;
	}

}
