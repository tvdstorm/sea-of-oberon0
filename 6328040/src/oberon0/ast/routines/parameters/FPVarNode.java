package oberon0.ast.routines.parameters;

import java.util.Iterator;
import java.util.List;

import oberon0.ast.expressions.IEvaluable;
import oberon0.ast.variables.IReferable;
import oberon0.environment.Context;
import oberon0.environment.IValue;

public class FPVarNode extends BaseFormalParameterNode {

	public FPVarNode(List<String> names, IEvaluable type) {
		super(names, type);
	}

	@Override
	public void fillIn(Context context, Iterator<IReferable> actualParams) {
		Iterator<String> fpNames = getFPNamesIter();

		while (fpNames.hasNext()) {
			IReferable currentActualParam = getNextActualParameter(actualParams);
			IValue currentAPValue = currentActualParam
					.eval(context.getParent()).getCopy();

			String currentName = fpNames.next();
			context.declareVar(currentName, currentAPValue);
		}
	}

}
