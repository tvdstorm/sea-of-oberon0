package oberon0.ast.declarations;

import java.util.ArrayList;

import oberon0.ast.expressions.IEvaluable;
import oberon0.environment.Context;
import oberon0.environment.IValue;

public class VarDeclarationNode implements IDeclarable {
	private ArrayList<String> _names;
	private IEvaluable _type;
	

	public VarDeclarationNode(ArrayList<String> names, IEvaluable typ) {
		_names = names;
		_type = typ;
	}

	@Override
	public void declare(Context context) {
		IValue type = _type.eval(context);
		for (String name: _names)
		{
			context.declareVar(name, type);
		}
	}

}
