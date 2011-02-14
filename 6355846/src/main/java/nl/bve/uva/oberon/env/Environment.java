package nl.bve.uva.oberon.env;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

import nl.bve.uva.oberon.env.procedures.Procedure;
import nl.bve.uva.oberon.env.types.ApplicationType;
import nl.bve.uva.oberon.env.types.OberonConstant;
import nl.bve.uva.oberon.env.types.OberonType;

/**
 * This class can be used as a holder of variables, application-defined-types
 * and procedures. There are methods to add an access these members.
 * 
 * An Environment can have a reference to an outer-Environment. This makes
 * scoping for nested procedures and other structures possible. If a nested
 * scope is necessary, a new sub-Environment can be created with the getNewSubSpace
 * method. When access to members is needed, the subspace will search in its own
 * Environment first. If no matching member is found, it will pass the call to
 * its outer-Environment. 
 * 
 * For procedures: if a procedure cannot be found, the outermost-Environment will
 * look in a special directory relative to the location of this class (see constant 
 * BUILT_IN_SUBPACKAGE), to see whether the wanted procedure is available.
 *  
 * @author Bart v. Eijkelenburg
 *
 */
public class Environment {
	private final String BUILT_IN_SUBPACKAGE = "procedures.builtins";
	
	private Environment superSpace;
	
	private LinkedHashMap<String, ApplicationType> applicationTypes = new LinkedHashMap<String, ApplicationType>();
	private LinkedHashMap<String, OberonType> identStack = new LinkedHashMap<String, OberonType>();
	private LinkedHashMap<String, Procedure> procedureStack = new LinkedHashMap<String, Procedure>();
	
	public Environment() {}
	
	public void addUserType(String name, ApplicationType type) {
		applicationTypes.put(name, type);
	}
	
	public ApplicationType createApplicationType(String name) {
		ApplicationType t = applicationTypes.get(name);
		
		if (t == null) {
			if (superSpace != null) {
				t = superSpace.createApplicationType(name);
			} 
			if (t == null) {
				throw new RuntimeException("No such variable: " +name);
			}
		}
		
		return t.clone();
	}
	
	public Environment(Environment superSpace) {
		this.superSpace = superSpace;
	}
	
	public Environment getNewSubSpace() {
		return new Environment(this);
	}
	
	public void addConstant(String const_id, OberonConstant c) {
		identStack.put(const_id, c);
	}
	
	public void addVariable(String var_id, OberonType var) {
		identStack.put(var_id, var);
	}
	
	public OberonType getVariable(String var_id) {
		OberonType t = identStack.get(var_id);
		
		if (t == null) {
			if (superSpace != null) {
				t = superSpace.getVariable(var_id);
			} 
			if (t == null) {
				throw new RuntimeException("No such variable: " +var_id);
			}
		}
		
		return t;
	}
	
	public void addProcedure(String proc_id, Procedure proc) {
		procedureStack.put(proc_id, proc);
	}
	
	public Procedure getProcedure(String proc_id) {
		Procedure p = procedureStack.get(proc_id);
		
		if (p == null) {
			if (superSpace != null) {
				p = superSpace.getProcedure(proc_id);
			} else {
				p = loadProcedure(proc_id);
			}
			
			if (p == null) {
				throw new RuntimeException("No such procedure: " +proc_id);
			}
		}
		
		return p;
	}
	
	private String getCurrentPackage() {
		String result = "";
		
		Package thisPackage = this.getClass().getPackage();		
		if (thisPackage != null) {
			result = thisPackage.getName();
		}
		
		return result;
	}
	
	@SuppressWarnings("unchecked")
	private Procedure loadProcedure(String procedureName) {
		Procedure result = null;
		
		String builtInsPackage = getCurrentPackage()+ "." + BUILT_IN_SUBPACKAGE;
		String procedureClassName = builtInsPackage + "." +procedureName;
		
		try {
			Class clazz = Class.forName(procedureClassName);
			Object o = clazz.newInstance();
			
			if (o instanceof Procedure) {
				result = (Procedure)o;
			} else {
				throw new RuntimeException("Loaded class is not a Procedure: " +procedureClassName);
			}
		} catch (ClassNotFoundException cnfe) {
			// do nothing, procedure is not found
		} catch (IllegalAccessException iae) {
			throw new RuntimeException("Loaded class cannot be accessed: " +procedureClassName);
		} catch (InstantiationException ie) {
			throw new RuntimeException("Loaded class cannot be instantiated: " +procedureClassName);
		}

		return result;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		if (superSpace != null) {
			sb.append(superSpace.toString());
		}
		
		for (Entry<String, OberonType> e : identStack.entrySet() ) {
			sb.append(e.getKey()+ ": " +e.getValue()+ "\n");
		}
		
		for (Entry<String, Procedure> e : procedureStack.entrySet() ) {
			sb.append(e.getKey()+ ": " +e.getValue()+ "\n");
		}
		
		return sb.toString();
	}
}
