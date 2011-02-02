package oberon0.ast.routines;

import java.util.ArrayList;

import oberon0.ast.declarations.IDeclarable;
import oberon0.ast.statements.IExecutable;
import oberon0.environment.Context;

public class RoutineNode implements ICallable, IDeclarable{	
	private String _name;
	private IDeclarable _declarations;
	private IExecutable _body;
	private ArrayList<IFormalParameter> _formalParameters;
	
	public final static ArrayList<IFormalParameter> noFormalParameters = null;
	public final static ArrayList<ActualParamNode> noActualParameters = null;
	
	public RoutineNode(String name, ArrayList<IFormalParameter> formalParameters, IDeclarable declarations, IExecutable body){
		_name = name;
		_formalParameters = formalParameters;
		_declarations = declarations;
		_body = body;
	}

	@Override
	public void call(Context context, ArrayList<ActualParamNode> actualParameters) {	
		context = new Context(_name, Context.noParent);

		for(int index = 0; index < _formalParameters.size(); index++){
			IFormalParameter currentFP = _formalParameters.get(index);
			currentFP.fillIn(context, actualParameters.get(index));
		}
		
		//TODO declare builtins
		//TODO declare own function in context
		
		_declarations.declare(context);
		_body.execute(context);
		
		context.print();
	}


	@Override
	public void declare(Context context) {
		// TODO Auto-generated method stub
	}
}
