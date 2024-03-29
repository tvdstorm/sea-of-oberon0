package ar.oberon0.ast.dataTypes;

import ar.oberon0.runtime.Context;
import ar.oberon0.shared.TechnicalException;
import ar.oberon0.values.Value;

/*
 * Classes that implement this interface are able to create a DataType.
 * Classes that implement this interface are used to create the oberon 0 Values, for example a integers.
 */
public interface CreatableType {
	/*
	 * Create the specified Value object.
	 */
	Value createInstance(Context context) throws TechnicalException;
}
