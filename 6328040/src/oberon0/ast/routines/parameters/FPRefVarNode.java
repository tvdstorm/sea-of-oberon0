package oberon0.ast.routines.parameters;

import java.util.ArrayList;

import oberon0.ast.expressions.IEvaluable;
import oberon0.ast.variables.IReferable;
import oberon0.environment.Context;
import oberon0.environment.Reference;

public class FPRefVarNode extends BaseFormalParameterNode {
	
	public FPRefVarNode(ArrayList<String> names, IEvaluable type) {
		super(names, type);
	}

	@Override
	public void fillIn(Context context, ArrayList<IReferable> actualParams) {
		ArrayList<String> names = new ArrayList<String>(_names);
		//TODO typechecking
		while (names.size() > 0){
			IReferable currentActualParam = actualParams.get(0);
			Reference currentAPReference = currentActualParam.refer(context, IReferable.noPreviousReference);
			
			String currentName = names.get(0);
			context.declareReferenceVariable(currentName, currentAPReference);
			
			actualParams.remove(0);
			names.remove(0);
		}
	}

}
