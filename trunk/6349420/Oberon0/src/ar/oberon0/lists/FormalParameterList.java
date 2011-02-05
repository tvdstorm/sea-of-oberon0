package ar.oberon0.lists;

import java.util.ArrayList;
import java.util.List;

import junit.framework.Assert;
import ar.oberon0.ast.dataTypes.CreatableType;
import ar.oberon0.ast.declarations.FormalParameter;

/*
 * This class is used to describe the parameters of a procedure.
 */
public class FormalParameterList {
	/*
	 * List with formal parameters. An List (ArrayList) is used because an
	 * ArrayList stores the items in order they are added. This is needed when
	 * Comparing if the actual parameters are of the same type as the formal
	 * parameters.
	 */
	private List<FormalParameterWithName> _parameters;

	public FormalParameterList() {
		this._parameters = new ArrayList<FormalParameterWithName>();
	}

	public int getCount() {
		return this._parameters.size();
	}

	/*
	 * Add a parameter to the list for each identifier in the list with the
	 * specified type.
	 */
	public void addParameters(IdentList identifiers, CreatableType type, FormalParameter.Direction direction) {
		Assert.assertNotNull("The identifiers parameter can't be null.", identifiers);
		Assert.assertNotNull("The type parameter can't be null.", type);
		Assert.assertNotNull("The direction parameter can't be null.", direction);
		for (String identifier : identifiers) {
			this._parameters.add(new FormalParameterWithName(identifier, type, direction));
		}
	}

	public FormalParameter getFormalParameter(int index) {
		return this._parameters.get(index);
	}

	public String getNameOfParameter(int index) {
		return this._parameters.get(index).getName();
	}

	/*
	 * Internal object to store the information of the formal parameter.
	 */
	private class FormalParameterWithName extends FormalParameter {
		private String name;

		public String getName() {
			return this.name;
		}

		public FormalParameterWithName(String name, CreatableType type, Direction direction) {
			super(type, direction);
			this.name = name;
		}

	}

}
