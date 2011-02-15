package oberon0.ast.routines.parameters;

import java.util.Iterator;
import java.util.List;

import oberon0.ast.variables.IReferable;
import oberon0.ast.variables.types.IType;
import oberon0.environment.Context;
import oberon0.environment.Reference;

public class FPRefVarNode extends BaseFormalParameterNode {

	public FPRefVarNode(List<String> names, IType type) {
		super(names, type);
	}

	@Override
	public void fillIn(Context context, Iterator<IReferable> actualParams) {
		Iterator<String> fpNames = getFPNamesIter();

		while (fpNames.hasNext()) {
			IReferable currentActualParam = getNextActualParameter(actualParams);
			Reference currentAPReference = currentActualParam.deref(
					context.getParent(), Reference.EMPTY_REFERENCE);

			String currentName = fpNames.next();
			context.declareVar(currentName, currentAPReference);
		}
	}

}
