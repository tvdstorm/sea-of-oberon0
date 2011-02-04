package oberon0.ast.routines.parameters;

import java.util.ArrayList;

import oberon0.ast.variables.IReferable;
import oberon0.environment.Context;

public interface IFormalParameter {

	public void fillIn(Context context, ArrayList<IReferable> _actualParams);

}
