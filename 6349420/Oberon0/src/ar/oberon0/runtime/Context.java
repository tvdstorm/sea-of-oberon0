package ar.oberon0.runtime;

import java.util.Map.Entry;

import ar.oberon0.ast.dataTypes.CreatableType;
import ar.oberon0.ast.declarations.ProcedureDeclaration;
import ar.oberon0.lists.BaseMap;
import ar.oberon0.lists.ConstantList;
import ar.oberon0.lists.DataFieldList;
import ar.oberon0.lists.ProcedureList;
import ar.oberon0.lists.TypeIdentifierList;
import ar.oberon0.shared.TechnicalException;

/*
 * The context class is used to store runtime data. 
 * It stores the procedures that can be called form within a node,
 * the variables that can be read and set, constants, etc.
 */
public final class Context {
	/*
	 * The parent context can be used to lookup data from the calling procedure
	 * or module.
	 */
	private Context parentContext;
	/*
	 * The variables that of the scope the node is interpreted in. Procedure
	 * parameters are also stored in the variables list.
	 */
	private DataFieldList variables;
	/*
	 * The type identifiers that are defined in the scope the node is
	 * interpreted in.
	 */
	private TypeIdentifierList typeIdentifiers;
	private ConstantList constants;
	private ProcedureList procedures;

	/*
	 * The parent context is used to get variables of the parent construct, for
	 * example a procedure has an own context and a parent context of the parent
	 * procedure or module.
	 */
	public void setParentContext(final Context context) {
		this.parentContext = context;
	}

	public void setProcedures(final ProcedureList procedures) {
		this.procedures = procedures;
	}

	public ProcedureList getProcedures() {
		return this.procedures;
	}

	public Context() {
		this.parentContext = null;
		this.variables = new DataFieldList();
		this.typeIdentifiers = new TypeIdentifierList();
		this.constants = new ConstantList();
	}

	public CreatableType getType(final String name) {
		return this.typeIdentifiers.getItem(name);
	}

	public boolean DoesProcedureExist(final String name) {
		if (itemExist(name, this.procedures)) {
			return true;
		}
		if (this.parentContext != null) {
			return this.parentContext.DoesProcedureExist(name);
		}
		return false;
	}

	public ProcedureDeclaration getProcedure(final String name) throws TechnicalException {
		if (!itemExist(name, this.procedures)) {
			throw new TechnicalException("There was no procedure named " + name + " in the context.");
		}
		return this.procedures.getItem(name);
	}

	public void addConstants(final ConstantList constants) {
		if (constants != null) {
			if (this.constants.getCount() <= 0) {
				this.constants = constants;
			} else {
				for (Entry<String, DataField> item : constants) {
					this.constants.addItem(item.getKey(), item.getValue());
				}
			}
		}
	}

	public void addProcedure(final String name, final ProcedureDeclaration procedure) {
		this.procedures.addItem(name, procedure);
	}

	public void addTypeIdentifiers(final TypeIdentifierList typeIdentifiers) {
		if (typeIdentifiers != null) {

			for (Entry<String, CreatableType> item : typeIdentifiers) {
				this.typeIdentifiers.addItem(item.getKey(), item.getValue());
			}

		}
	}

	public void addVariable(final String name, final DataField value) {
		this.variables.addItem(name, value);
	}

	public void addVariables(final DataFieldList variables) {
		if (variables != null) {
			if (this.variables.getCount() <= 0) {
				this.variables = variables;
			} else {
				for (Entry<String, DataField> item : variables) {
					this.variables.addItem(item.getKey(), item.getValue());
				}
			}
		}
	}

	/*
	 * Clone the context. Creates a new context and copies all the lists except
	 * the variables. The variable list is also cloned. This is needed for
	 * example by the creation of a new procedure. A procedure can be invoked
	 * multiple times and if the variables where not cloned all the procedure
	 * instances would share the same variable.
	 */
	public Context clone() {
		Context clone = new Context();
		clone.constants = this.constants;
		clone.parentContext = this.parentContext;
		clone.procedures = this.procedures;
		clone.typeIdentifiers = this.typeIdentifiers;
		clone.variables = this.variables.clone();
		return clone;
	}

	public boolean doesVarOrConstantExist(final String name) {
		if (itemExist(name, this.variables)) {
			return true;
		} else if (itemExist(name, this.constants)) {
			return true;
		} else if (parentContext != null) {
			return parentContext.doesVarOrConstantExist(name);
		} else {
			return false;
		}
	}

	public DataField getVarOrConstantAsDataField(final String name) throws TechnicalException {
		if (itemExist(name, this.variables)) {
			return this.variables.getItem(name);
		} else if (itemExist(name, this.constants)) {
			return this.constants.getItem(name).clone();
		} else if (parentContext != null) {
			return parentContext.getVarOrConstantAsDataField(name);
		} else {
			throw new TechnicalException("There was no variable or constant named " + name + " in the context.");
		}
	}

	private CreatableType getTypeIdentifier(final String name) throws TechnicalException {
		if (!itemExist(name, this.typeIdentifiers)) {
			throw new TechnicalException("There was no type named " + name + " in the context.");
		}
		return this.typeIdentifiers.getItem(name);
	}

	private boolean itemExist(final String name, final BaseMap list) {
		if (list.getItem(name) == null) {
			return false;
		}
		return true;
	}
}
