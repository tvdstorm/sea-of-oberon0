package oberon0.ast.declarations;

import java.util.ArrayList;
import java.util.List;

import oberon0.ast.variables.types.IType;
import oberon0.environment.Context;

public class VarDeclarationNode implements IDeclarable {
	private List<String> _names;
	private IType _type;

	public VarDeclarationNode(List<String> names, IType type) {
		if (names != null) {
			_names = names;
		} else {
			_names = new ArrayList<String>();
		}
		_type = type;
	}

	@Override
	public void declare(Context context) {
		for (String name : _names) {
			context.declareVar(name, _type.getDefaultValue(context));
		}
	}

}
