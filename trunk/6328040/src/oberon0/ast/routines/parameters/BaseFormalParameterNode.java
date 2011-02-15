package oberon0.ast.routines.parameters;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import oberon0.ast.variables.IReferable;
import oberon0.ast.variables.types.IType;

public abstract class BaseFormalParameterNode implements IFormalParameter {
	private final List<String> _names;
	private final IType _type;

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

}
