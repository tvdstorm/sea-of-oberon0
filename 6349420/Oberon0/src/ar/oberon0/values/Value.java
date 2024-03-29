package ar.oberon0.values;

import java.util.List;

import ar.oberon0.ast.dataTypes.CreatableType;
import ar.oberon0.runtime.Context;
import ar.oberon0.shared.CheckViolation;
import ar.oberon0.shared.Interpretable;

/*
 * A Value object is used to store data. for example an integer node.
 */
public interface Value extends Interpretable {
	/*
	 * Return the Type of the current object.
	 */
	public CreatableType getType();

	public List<CheckViolation> check(Context context);

}
