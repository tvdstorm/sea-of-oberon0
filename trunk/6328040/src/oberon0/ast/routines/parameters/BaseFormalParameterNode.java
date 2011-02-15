package oberon0.ast.routines.parameters;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import oberon0.ast.variables.IReferable;
import oberon0.ast.variables.types.IType;
import oberon0.environment.Context;
import oberon0.environment.IValue;
import oberon0.environment.Reference;

public abstract class BaseFormalParameterNode implements IFormalParameter {
	private final List<String> _names;
	private final IType _type;	//not implemented, but should be used for typechecking

	protected BaseFormalParameterNode(List<String> names, IType type) {
		if (names != null) {
			_names = names;
		} else {
			_names = new ArrayList<String>();
		}
		_type = type;
	}

	protected Iterator<String> getFPNamesIter() {
		return _names.iterator();
	}

	protected IReferable getNextActualParameter(
			Iterator<IReferable> actualParams) {
		if (actualParams.hasNext()) {
			return actualParams.next();
		} else {
			throw new IllegalArgumentException("Actual parameter expected. "
					+ "Formal list " + _names.toString());
		}
	}
	
	public void baseFillIn(Context context, Iterator<IReferable> actualParams, boolean isReferenceVar){
		Iterator<String> fpNames = getFPNamesIter();

		while (fpNames.hasNext()) {
			String currentName = fpNames.next();
			IReferable currentActualParam = getNextActualParameter(actualParams);
			
			if (isReferenceVar){
				Reference currentAPRef = currentActualParam.deref(context.getParent(), Reference.EMPTY_REFERENCE);
				context.declareVar(currentName, currentAPRef);
			} else {
				IValue currentAPValue = currentActualParam.eval(context.getParent());
				context.declareVar(currentName, currentAPValue.getCopy());
			}
		}
	}

}
