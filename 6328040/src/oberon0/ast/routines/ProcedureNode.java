package oberon0.ast.routines;

import java.util.ArrayList;

import oberon0.ast.declarations.IDeclarable;
import oberon0.ast.routines.parameters.IFormalParameter;
import oberon0.ast.statements.IExecutable;
import oberon0.ast.variables.IReferable;
import oberon0.environment.Context;
import oberon0.environment.builtinroutines.BuiltInRoutines;

public class ProcedureNode implements ICallable, IDeclarable{	
	private String _name;
	private IDeclarable _declarations;
	private IExecutable _body;
	private ArrayList<IFormalParameter> _formalParameters;
	
	public final static ArrayList<IFormalParameter> noFormalParameters = null;
	
	public ProcedureNode(String name, ArrayList<IFormalParameter> formalParameters, IDeclarable declarations, IExecutable body){
		_name = name;
		if(formalParameters!= null){
			_formalParameters = new ArrayList<IFormalParameter>();
		}
		else{
			_formalParameters = formalParameters;
		}
		_declarations = declarations;
		_body = body;
	}

	@Override
	public void call(Context context, ArrayList<IReferable> actualParams) {
		context = new Context(_name, context);

		ArrayList<IReferable> actualParamsClone = new ArrayList<IReferable>(actualParams);
		for(int index = 0; index < _formalParameters.size(); index++){
			IFormalParameter currentFP = _formalParameters.get(index);
			currentFP.fillIn(context, actualParamsClone);
		}
		
		BuiltInRoutines builtin = new BuiltInRoutines();
		builtin.declare(context);
		
		declare(context);
		_declarations.declare(context);
		_body.execute(context);
	}


	@Override
	public void declare(Context context) {
		context.declareProcedure(_name,this);
	}
}
