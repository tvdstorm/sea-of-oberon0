package oberon0.ast.routines;

import java.util.ArrayList;

import oberon0.ast.expressions.IEvaluable;
import oberon0.ast.variables.IReferable;
import oberon0.environment.Context;
import oberon0.environment.Reference;

public class FPRefVarNode implements IFormalParameter {
	ArrayList<String> _names;
	IEvaluable _type;
	
	public FPRefVarNode(ArrayList<String> names, IEvaluable type) {
		_names = names;
		_type = type;
	}

	@Override
	public void fillIn(Context context, ArrayList<IReferable> actualParams) {
		ArrayList<String> names = (ArrayList<String>) _names.clone();
		//TODO typechecking
		while (names.size() > 0){
			
			String currentName = names.get(0);
			
			IReferable currentActualParam = actualParams.get(0);
			Reference currentAPReference = currentActualParam.refer(context, IReferable.noPreviousReference);
			
			context.declareReferenceVariable(currentName, currentAPReference);
			
			actualParams.remove(0);
			names.remove(0);
		}
	}

}
