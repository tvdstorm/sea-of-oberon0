package oberon0.declaration;

import java.util.ArrayList;
import java.util.List;

import oberon0.environment.EnvObject;
import oberon0.environment.Environment;
import oberon0.environment.ReferenceLink;
import oberon0.expression.Expression;
import oberon0.expression.VariableExpression;
import oberon0.statement.Statement;
import oberon0.value.Value;

public class ProcedureDeclaration extends Declaration {

	private final List<Declaration>declarations;
	private final List<FormParamDeclaration>params;
	private final List<Statement>statements;
	
	public ProcedureDeclaration(String identifier) {
		super(identifier);
		this.declarations = new ArrayList<Declaration>();
		this.params = new ArrayList<FormParamDeclaration>();
		this.statements= new ArrayList<Statement>();
	}

	public void addDeclarations(final List<Declaration> declarations) {
		this.declarations.addAll(declarations);
	}
	
	public void addFormalParameters(final List<FormParamDeclaration> formalParams) {
		params.addAll(formalParams);
		declarations.addAll(formalParams);
	}

	public List<Declaration> getDeclarations() {
		return declarations;
	}
	
	public void addStatements(final List<Statement> statements) {
		this.statements.addAll(statements);
	}

	public List<Statement> getStatements() {
		return statements;
	}
	
	public void start(Environment env, List<Expression> actParams) {
		assert(actParams.size() == params.size());
		
		Environment innerEnv = new Environment(env);
		innerEnv.declare(declarations);
		
		setParameterValues(innerEnv, env, actParams);
		
		for (Statement statement : statements) {
			statement.execute(innerEnv);
		}
		
		env.copyValues(innerEnv,getReferenceLinks(actParams));
	}
	
	private void setParameterValues(Environment innerEnv, Environment outerEnv, List<Expression> actParams) {	
		for (int i=0; i < params.size(); i++) {
			FormParamDeclaration param = params.get(i);
			Expression exp = actParams.get(i);
			
			Value<?>val = exp.evaluate(outerEnv);
			innerEnv.assignValue(param.getIdentifier(), val.getCopy());
		}		
	}
	
	private List<ReferenceLink>getReferenceLinks(List<Expression> actParams) {
		ArrayList<ReferenceLink>links = new ArrayList<ReferenceLink>();
		
		for (int i=0; i < params.size(); i++) {
			FormParamDeclaration param = params.get(i);
			Expression exp = actParams.get(i);
			
			if (isReffereceCandidate(param,exp)) {
				VariableExpression varExp = (VariableExpression)exp;
				links.add(new ReferenceLink(param.getIdentifier(), varExp.getIdentifier(), varExp.getSelector()));
			}
		}
		
		return links;
	}
	
	private boolean isReffereceCandidate(FormParamDeclaration param, Expression exp) {
		return (param.isByRefference() && (exp.getClass() == VariableExpression.class));
	}
	
	public EnvObject getEnvironmentObject(Environment env) {
		return new EnvObject(this, false);
	}
	
}
