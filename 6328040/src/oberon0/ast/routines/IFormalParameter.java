package oberon0.ast.routines;

import oberon0.environment.Context;

public interface IFormalParameter {

	public void fillIn(Context context, ActualParamNode actualParamNode);

}
