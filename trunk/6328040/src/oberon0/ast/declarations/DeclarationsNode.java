package oberon0.ast.declarations;

import java.util.ArrayList;
import java.util.List;

import oberon0.environment.Context;

public class DeclarationsNode implements IDeclarable {
	private final List<IDeclarable> _declarations;

	public DeclarationsNode(List<IDeclarable> declarations) {
		if (declarations != null) {
			_declarations = declarations;
		} else {
			_declarations = new ArrayList<IDeclarable>();
		}
	}

	@Override
	public void declare(Context context) {
		for (IDeclarable declaration : _declarations) {
			declaration.declare(context);
		}
	}

}
