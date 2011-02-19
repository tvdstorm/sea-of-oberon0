package oberon0.declaration;

import java.util.ArrayList;
import java.util.List;

import oberon0.environment.EnvObject;
import oberon0.environment.Environment;
import oberon0.statement.Statement;


public class ModuleDeclaration extends Declaration {
	
	private final List<Declaration> declarations;
	private final List<Statement> statements;
	
	public ModuleDeclaration(final String identifier) {
		super(identifier);
		this.declarations = new ArrayList<Declaration>();
		this.statements = new ArrayList<Statement>();
	}

	public void addDeclarations(final List<Declaration> declarations) {
		this.declarations.addAll(declarations);
	}

	public final List<Declaration> getDeclarations() {
		return declarations;
	}
	
	public void addStatements(final List<Statement> statements) {
		this.statements.addAll(statements);
	}

	public List<Statement> getStatements() {
		return statements;
	}
	
	public void start(Environment env) {
		Environment innerEnv = new Environment(env);
		innerEnv.declare(declarations);
		
		for (Statement statement : statements) {
			statement.execute(innerEnv);
		}
	}

	@Override
	public EnvObject getEnvironmentObject(Environment env) {
		return new EnvObject(this, false);
	}
	
}
