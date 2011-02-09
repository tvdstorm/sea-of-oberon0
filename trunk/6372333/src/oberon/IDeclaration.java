package oberon;

import java.util.List;


public interface IDeclaration {
	/**
	 * Gets the variables.
	 *
	 * @return the variables
	 */
	public List<IDataType> getVariables();

	/**
	 * Gets the procedures.
	 *
	 * @return the procedures
	 */
	List<IProcedure> getProcedures();
}