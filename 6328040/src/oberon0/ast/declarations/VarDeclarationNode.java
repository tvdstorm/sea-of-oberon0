package oberon0.ast.declarations;

import java.util.ArrayList;

import oberon0.environment.Context;
import oberon0.environment.IntegerValue;

public class VarDeclarationNode implements IDeclarable {
	private ArrayList<String> _names;
	private String _type;
	

	public VarDeclarationNode(ArrayList<String> names, String type) {
		_names = names;
		_type = type;
	}

	@Override
	public void declare(Context context) {
		for (String name: _names)
		{
			if (_type.equals("INTEGER")){
				context.declareVariable( name, new IntegerValue(0));
			}
			//TODO
		}
		
	}

}
