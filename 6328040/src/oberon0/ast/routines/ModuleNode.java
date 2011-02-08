package oberon0.ast.routines;

import java.util.List;

import oberon0.ast.declarations.IDeclarable;
import oberon0.ast.statements.IExecutable;
import oberon0.ast.variables.IReferable;
import oberon0.environment.Context;
import oberon0.environment.builtinroutines.BuiltInRoutines;

public class ModuleNode implements ICallable {
	private String _name;
	private IDeclarable _declarations;
	private IExecutable _body;
	private Context _context;

	public ModuleNode(String name, IDeclarable declarations, IExecutable body) {
		_name = name;
		_declarations = declarations;
		_body = body;
		_context = new Context(_name, Context.noParent);
	}

	@Override
	public void call(Context context, List<IReferable> actualParameters) {
		context = new Context(_name, Context.noParent);

		BuiltInRoutines builtin = new BuiltInRoutines();
		builtin.declare(context);

		_declarations.declare(context);
		_body.execute(context);

		_context = context;
	}

	/*
	 * For auto-testing oberon0 scripts Returns the current context (has a
	 * context with content after a module "call")
	 */
	public Context getContextAfterCall() {
		return _context;
	}
}
