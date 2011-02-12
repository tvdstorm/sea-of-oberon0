package nl.bve.uva.oberon.env;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

import nl.bve.uva.oberon.env.procedures.Procedure;
import nl.bve.uva.oberon.env.types.OberonConstant;
import nl.bve.uva.oberon.env.types.OberonInt;
import nl.bve.uva.oberon.env.types.Type;

public class Environment {
	private final String BUILT_IN_SUBPACKAGE = "procedures.builtins";
	
	private Environment superSpace;
	
	private LinkedHashMap<String, Type> identStack = new LinkedHashMap<String, Type>();
	private LinkedHashMap<String, Procedure> procedureStack = new LinkedHashMap<String, Procedure>();
	
	public Environment() {}
	
	public Type createUserType(String typeDef) {
		if (typeDef.equals("INTEGER")) {
			return new OberonInt(0);
		} else {
			throw new RuntimeException("User types not implemented yet...");
		}
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
	
	public void addVariable(String var_id, Type var) {
		identStack.put(var_id, var);
	}
	
	public Type getVariable(String var_id) {
		Type t = identStack.get(var_id);
		
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
		
		for (Entry<String, Type> e : identStack.entrySet() ) {
			sb.append(e.getKey()+ ": " +e.getValue()+ "\n");
		}
		
		for (Entry<String, Procedure> e : procedureStack.entrySet() ) {
			sb.append(e.getKey()+ ": " +e.getValue()+ "\n");
		}
		
		return sb.toString();
	}
}
