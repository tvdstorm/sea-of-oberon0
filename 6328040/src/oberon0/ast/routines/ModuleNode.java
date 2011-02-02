package oberon0.ast.routines;

import oberon0.ast.declarations.IDeclarable;
import oberon0.ast.statements.IExecutable;
import oberon0.environment.Context;

public class ModuleNode implements ICallable{
	
	private String _name;
	private IDeclarable _declarations;
	private IExecutable _body;
	
	public ModuleNode(String name, IDeclarable declarations, IExecutable body){
		_name = name;
		_declarations = declarations;
		_body = body;
	}

	public void call(Context context) {	
		context = new Context(_name, Context.noParent);
		
		_declarations.declare(context);
		_body.execute(context);
		
		context.print();
	}
}
