package oberon0.environment;

import java.util.HashMap;
import java.util.List;

import oberon0.declaration.Declaration;
import oberon0.declaration.ProcedureDeclaration;
import oberon0.selector.Selector;
import oberon0.value.Value;

public class Environment {
	
	private static String IDENT_ERROR = "Identifier not found :";
	private static String IMMUT_ERROR = "Trying to mutate a immutable value";
	
	private Environment superEnvironment;
	private HashMap<String,EnvObject>envObjects;
	
	
	public Environment(Environment superEnvironment) {
		this.superEnvironment = superEnvironment;
		this.envObjects = new HashMap<String, EnvObject>();
	}
	
	public void declare(Declaration declaration) {
		String ident = declaration.getIdentifier();
		this.envObjects.put(ident, declaration.getEnvironmentObject(this));
	}
	
	public void declare(final List<Declaration> declarations) {
		for (Declaration declaration : declarations) {
			declare(declaration);
		}
	}
	
	public Value<?> getValue(String identifier) {
		EnvObject envObj = findEnvObject(identifier);
		return (Value<?>) envObj.getObject();
	}
	
	public Value<?> getValue(String identifier, Selector selector) {
		EnvObject envObj = findEnvObject(identifier);
		return (Value<?>) envObj.getObject();
	}

	public void assignValue(String identifier, Value<?> value) {
		EnvObject envObj = findEnvObject(identifier);
		assert(envObj.isMutable()):IMMUT_ERROR;
		envObj.setObject(value);
	}
	
	public ProcedureDeclaration getProcedure(String identifier) {
		EnvObject envObj = findEnvObject(identifier);
		return (ProcedureDeclaration) envObj.getObject();	
	}
	
	private EnvObject findEnvObject(String identifier) {
		if (envObjects.containsKey(identifier)) {
			return envObjects.get(identifier);
		}
		else {
			//Look in the super environment.
			assert(superEnvironment != null):IDENT_ERROR + identifier;
			return superEnvironment.findEnvObject(identifier);
		}
	}
	
	public void copyValues(Environment env, List<ReferenceLink> refLinks) {
		for (ReferenceLink link : refLinks) {
			Value<?> innerVal = env.getValue(link.getInnerIdentifier());
			
			EnvObject envObj = findEnvObject(link.getOuterIdentifier());
			assert(envObj.isMutable()):IMMUT_ERROR;
			
			Value<?> outerVal = (Value<?>) envObj.getObject();
			outerVal.setValue(link.getOuterSelector(), this, innerVal);
		}
	}
}
