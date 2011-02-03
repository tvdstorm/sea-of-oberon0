package oberon0.ast.routines;

import java.util.ArrayList;

import oberon0.ast.expressions.IEvaluable;
import oberon0.ast.variables.IReferable;
import oberon0.environment.Context;
import oberon0.environment.IValue;
import oberon0.environment.Reference;

public class FPVarNode implements IFormalParameter {
	ArrayList<String> _names;
	IEvaluable _type;
	
	public FPVarNode(ArrayList<String> names, IEvaluable type) {
		_names = names;
		_type = type;
	}

	@Override
	public void fillIn(Context context, ArrayList<IReferable> actualParams) {
		ArrayList<String> names = new ArrayList<String>(_names);
		while (names.size() > 0){
			IValue FormalParamType = _type.eval(context);
			String currentName = names.get(0);
			context.declareVariable(currentName, FormalParamType);
			
			Reference reference= context.getReference(currentName);
			IReferable currentActualParam = actualParams.get(0);
			IValue currentAPValue = currentActualParam.eval(context);
			reference.setValue(currentAPValue);
			
			actualParams.remove(0);
			names.remove(0);
		}
	}

}
