package oberon0.ast.declarations;

import java.util.ArrayList;
import java.util.List;

import oberon0.ast.expressions.IEvaluable;
import oberon0.environment.Context;
import oberon0.environment.IValue;

public class VarDeclarationNode implements IDeclarable {
	private List<String> _names;
	private IEvaluable _type;

	public VarDeclarationNode(List<String> names, IEvaluable type) {
		if (names != null){
			_names = names;
		} else {
			_names = new ArrayList<String>();
		}
		_type = type;
	}

	@Override
	public void declare(Context context) {
		IValue type = _type.eval(context);
		for (String name : _names) {
			context.declareVar(name, type);
		}
	}

}
