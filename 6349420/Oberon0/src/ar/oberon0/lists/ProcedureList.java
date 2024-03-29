package ar.oberon0.lists;

import ar.oberon0.ast.declarations.ProcedureDeclaration;

/*
 * A list that contains procedure declarations. This is used to make procedure calls possible. 
 * The context that is passed while interpreting contains a procedure list, with this list the procedure call node can find the right procedure to invoke.
 */
public class ProcedureList extends BaseMap<ProcedureDeclaration> {
	public ProcedureList() {
		super();
	}
}
