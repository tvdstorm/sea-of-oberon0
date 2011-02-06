package oberon0.interpreter.procedure;

import java.util.ArrayList;

import oberon0.interpreter.declaration.Variable;
import oberon0.interpreter.exceptions.ExecutionException;
import oberon0.interpreter.expression.Expression;
import oberon0.interpreter.identifier.Identifier;
import oberon0.interpreter.module.Module;


public class Procedure extends Module {

	private ArrayList<Parameter> parameters;
	
	//Constructor
	public Procedure(String identifier) {
		
		super(identifier);
	
		parameters = new ArrayList<Parameter>();
	}
		
	//PARAMETERS
	public void addParameter(Parameter parameter) {
		parameters.add(parameter);
	}

	public void addParameters(ArrayList<Parameter> parameterList) {
		parameters.addAll(parameterList);
	}
	
	public void setParamerterExpressions(ArrayList<Expression>parameterExps) {
		//Expression count must always equal the parameter count.
		assert(parameterExps.size() == parameters.size());
		
		//Pass the expressions down to the parameters.
		for (int i = 0; i < parameters.size();i++) {
			Parameter parameter = parameters.get(i);
			Expression paramereterValue = parameterExps.get(i);
			
			parameter.assignExpression(paramereterValue,null,higherModule);
		}
	}
	
	//IDENTIFIER VALUES
	
	@Override
	public Expression getValueForIdentifier(Identifier identifier) {
		Parameter parameter = getParameter(identifier.getIdentifier());
		if (parameter != null) {
			return parameter.getExpression(identifier.getSelector(), this).evaluate(this);
		}
		else {
			return super.getValueForIdentifier(identifier);
		}
	}
	
	//ASSIGMENT METHODS
	@Override
	public void assignExpressionToVariable(Identifier identifier, Expression expression) {
		//Is this a assignment to a parameter variable?
		Parameter parameter = getParameter(identifier.getIdentifier());
		if (parameter != null) {
			parameter.assignExpression(expression,identifier.getSelector(),this);
		}
		else {
			//Its a declared variable.
			super.assignExpressionToVariable(identifier, expression);
		}
	}
	
	
	//VARIABLES
	public Variable getVariable(String identifier) {
		
		return super.getVariable(identifier);
	}
	
	//PROCEDURE ACTION
	public void start() throws ExecutionException {
		super.start();
		
		passParameterExpressionsToHigherModule();
	}
	
	
	//HELPERS
	public Parameter getParameter(String identifier) {
		//Find the param with the same identifier.
		for (Parameter parameter : parameters) {
			String paramIdent = parameter.getIdentifier();
			//Does this param have the same identifier?
			if (paramIdent.equals(identifier)) {
				return parameter;
			}
		}
		//No prameter found so return null.
		return null;
	}
	
	private void passParameterExpressionsToHigherModule() {
		//See if we have referenced parameters.
		for (Parameter parameter : parameters) {
			if (parameter.isReferenced()) {
				//A procedure should always have a higher module.
				assert(higherModule != null);
				//If their a higher module identifier?
				if (parameter.hasHigherModuleIdentifier()) {
					Identifier paramIdent = parameter.getHigherModuleIdentifier();
					Expression expr = parameter.getExpression(paramIdent.getSelector(), higherModule);
					//Set the value of identifier in the higher module.
					higherModule.assignExpressionToVariable(paramIdent,expr);
				}
			}
		}
	}
	
	//NEW
	public Procedure getNew() {
		//Create a new procedure object and copy all of its properties.
		Procedure procedure = new Procedure(getIdentifier());
		procedure.addParameters(getNewParameters());
		procedure.addConstants(getNewConstants());
		procedure.addTypeDeclarations(getNewTypeDeclarations());
		procedure.addVariables(getNewVariables());
		procedure.addStatements(getNewStatements());
		procedure.addProcedures(getNewProcedures());
		//Finally return the new procedure (of same type).
		return procedure;
	}
	
	protected ArrayList<Parameter> getNewParameters() {
		ArrayList<Parameter> newParameters = new ArrayList<Parameter>();
		//Add parameters (make new; contains a type).
		for (Parameter parameter : parameters) {
			newParameters.add(parameter.getNew());
		}
		return newParameters;
	}
	
}
