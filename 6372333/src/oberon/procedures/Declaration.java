package oberon.procedures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import oberon.IDataType;
import oberon.IDeclaration;
import oberon.IProcedure;

/**
 * The Class Declaration, contains the declarations in the scope of a procedure.
 */
public class Declaration implements IDeclaration {
	
	/** The const and var declarations. */
	private final List<IDataType> constAndVarDeclarations;
	
	/** The proc declarations. */
	private final List<IProcedure> procDeclarations;

	/**
	 * Instantiates a new declaration.
	 *
	 * @param variables the variables
	 * @param procedures the procedures
	 */
	public Declaration(final List<IDataType> variables, final List<IProcedure> procedures) {
		constAndVarDeclarations = variables;
		procDeclarations = procedures;
	}
	
	/**
	 * Gets the variables.
	 *
	 * @return the variables
	 */
	public List<IDataType> getVariables() {
		final List<IDataType> list = new ArrayList<IDataType>();
		
		for (IDataType declaration : constAndVarDeclarations) {
			list.add(declaration.performDeepCopy(declaration.getName()));
		}
		
		return Collections.unmodifiableList(list);
	}

	/**
	 * Gets the procedures.
	 *
	 * @return the procedures
	 */
	public List<IProcedure> getProcedures() {
		return Collections.unmodifiableList(procDeclarations);
	}
}
