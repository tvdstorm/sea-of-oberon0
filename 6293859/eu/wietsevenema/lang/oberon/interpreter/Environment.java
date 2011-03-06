package eu.wietsevenema.lang.oberon.interpreter;

import java.io.InputStream;
import java.io.OutputStream;

import eu.wietsevenema.lang.oberon.ast.declarations.Module;
import eu.wietsevenema.lang.oberon.ast.visitors.interpreter.ModuleEvaluator;
import eu.wietsevenema.lang.oberon.ast.visitors.typechecker.ModuleChecker;
import eu.wietsevenema.lang.oberon.exceptions.SymbolAlreadyDeclaredException;
import eu.wietsevenema.lang.oberon.typechecker.TypeCheckerScope;

public class Environment {

	private InterpreterScope interpreterScope;
	private OutputStream out;
	private InputStream in;
	private TypeCheckerScope typeCheckerScope;

	public Environment(InputStream in, OutputStream out) throws SymbolAlreadyDeclaredException {
		this.in = in;
		this.out = out;
		this.interpreterScope = new InterpreterScope();
		this.typeCheckerScope = new TypeCheckerScope();
		BuiltIns.inject(this, interpreterScope);
		BuiltIns.inject(this, typeCheckerScope);
	}
	

	public OutputStream getOut() {
		return out;
	}

	public InputStream getIn() {
		return in;
	}

	public void runModule(Module result) {
		ModuleChecker typeChecker = new ModuleChecker(typeCheckerScope);
		typeChecker.dispatch(result);
		
		ModuleEvaluator me = new ModuleEvaluator(interpreterScope);
		me.dispatch(result);
	}

}
