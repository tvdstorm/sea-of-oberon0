package oberon0.ast.declarations;

import oberon0.ast.expressions.IEvaluable;
import oberon0.environment.Context;
import oberon0.environment.IValue;

public class TypeDeclarationNode implements IDeclarable {
	private final String _name;
	private final IEvaluable _typeEval;

	public TypeDeclarationNode(String name, IEvaluable type) {
		_name = name;
		_typeEval = type;
	}

	@Override
	public void declare(Context context) {
		IValue type = _typeEval.eval(context);
		context.declareType(_name, type);
	}

}
