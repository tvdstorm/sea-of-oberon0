package oberon0.ast.declarations;

import oberon0.environment.Context;

public class VarDeclarationNode implements IDeclarable {
	private String _name;
	private String _type;
	

	public VarDeclarationNode(String name, String type) {
		_name = name;
		_type = type;
	}

	@Override
	public void declare(Context context) {
		//TODO context.declareReference( _name, _type)
	}

}
