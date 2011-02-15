package oberon0.ast.declarations;

import oberon0.ast.variables.types.IType;
import oberon0.environment.Context;

public class TypeDeclarationNode implements IDeclarable {
	private final String _name;
	private final IType _type;

	public TypeDeclarationNode(String name, IType type) {
		_name = name;
		_type = type;
	}

	@Override
	public void declare(Context context) {
		context.declareType(_name, _type);
	}

}
