package oberon0.ast.routines;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import oberon0.ast.declarations.IDeclarable;
import oberon0.ast.routines.parameters.IFormalParameter;
import oberon0.ast.statements.IExecutable;
import oberon0.ast.variables.IReferable;
import oberon0.environment.Context;

public class ProcedureNode implements ICallable, IDeclarable {
	private String _name;
	private IDeclarable _declarations;
	private IExecutable _body;
	private List<IFormalParameter> _formalParameters;

	public final static List<IFormalParameter> noFormalParameters = null;

	public ProcedureNode(String name, List<IFormalParameter> formalParameters,
			IDeclarable declarations, IExecutable body) {
		_name = name;
		if (formalParameters != null) {
			_formalParameters = formalParameters;
		} else {
			_formalParameters = new ArrayList<IFormalParameter>();
		}
		_declarations = declarations;
		_body = body;
	}

	@Override
	public void call(Context context, List<IReferable> actualParams) {
		context = new Context(_name, context);

		Iterator<IReferable> actualParamsIter = actualParams.iterator();
		for (int index = 0; index < _formalParameters.size(); index++) {
			IFormalParameter currentFP = _formalParameters.get(index);
			currentFP.fillIn(context, actualParamsIter);
		}

		declare(context);
		_declarations.declare(context);
		_body.execute(context);
	}

	@Override
	public void declare(Context context) {
		context.declareProcedure(_name, this);
	}
}
