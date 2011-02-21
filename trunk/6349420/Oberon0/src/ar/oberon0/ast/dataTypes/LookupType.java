package ar.oberon0.ast.dataTypes;

import ar.oberon0.runtime.Context;
import ar.oberon0.shared.TechnicalException;
import ar.oberon0.values.Value;

/*
 * The lookup type is a type that looks up the concrete type on runtime.
 * This is used when a type identifier is used. 
 */
public class LookupType implements CreatableType {
	private String name;

	protected LookupType(final String name) {
		this.name = name;
	}

	@Override
	public Value createInstance(final Context context) throws TechnicalException {
		CreatableType type = context.getType(this.name);
		return type.createInstance(context);
	}

}
