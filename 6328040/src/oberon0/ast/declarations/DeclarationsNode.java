package oberon0.ast.declarations;

import java.util.ArrayList;

import oberon0.environment.Context;

public class DeclarationsNode implements IDeclarable {
	private ArrayList<IDeclarable> _declarations;

	public DeclarationsNode(ArrayList<IDeclarable> declarations) {
		_declarations = declarations;
	}

	@Override
	public void declare(Context context) {
		for (IDeclarable declaration : _declarations) {
			declaration.declare(context);
		}
	}

}
