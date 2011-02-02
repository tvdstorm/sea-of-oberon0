package oberon0.ast.declarations;

import java.util.ArrayList;

import oberon0.environment.Context;

public class ConstDeclarationsNode implements IDeclarable {
	ArrayList<IDeclarable> _list;
	
	public ConstDeclarationsNode(ArrayList<IDeclarable> list) {
		_list = list;
	}

	@Override
	public void declare(Context context) {
		for (IDeclarable constantDeclaration: _list){
			constantDeclaration.declare(context);
		}
	}

}
