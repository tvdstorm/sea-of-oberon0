package oberon0.ast.routines.parameters;

import java.util.Iterator;
import java.util.List;

import oberon0.ast.variables.IReferable;
import oberon0.ast.variables.types.IType;
import oberon0.environment.Context;

public class FPRefVarNode extends BaseFormalParameterNode {

	public FPRefVarNode(List<String> names, IType type) {
		super(names, type);
	}

	@Override
	public void fillIn(Context context, Iterator<IReferable> actualParams) {
		baseFillIn(context, actualParams, true);
	}

}
