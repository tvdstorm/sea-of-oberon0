package oberon0.interpreter.module;

import java.util.ArrayList;
import java.util.HashMap;

import oberon0.interpreter.declaration.Constant;
import oberon0.interpreter.declaration.TypeDeclaration;
import oberon0.interpreter.declaration.Variable;
import oberon0.interpreter.exceptions.ExecutionException;
import oberon0.interpreter.expression.Expression;
import oberon0.interpreter.expression.IntegerExpression;
import oberon0.interpreter.identifier.Identifier;
import oberon0.interpreter.procedure.Procedure;
import oberon0.interpreter.program.Program;
import oberon0.interpreter.statement.Statement;
import oberon0.interpreter.type.IntegerType;

public class Module {
	
	private Program program;
	private String identifier;
	private HashMap<String,Constant> constants;
	private HashMap<String,TypeDeclaration> declaredTypes;
	private HashMap<String,Variable> variables;
	private HashMap<String,Procedure> procedures;
	private ArrayList<Statement>statements;
	protected Module higherModule;
	
	public Module (String identifier) {
		this.identifier = identifier;
		
		constants = new HashMap<String,Constant>();
		declaredTypes = new HashMap<String,TypeDeclaration>();
		variables = new HashMap<String,Variable>();
		procedures = new HashMap<String,Procedure>();
		statements = new ArrayList<Statement>();
		higherModule = null;
	}
	
	//IDENTIFIER
	public String getIdentifier() {
		return identifier;
	}
	
	//CONSTANTS
	public void addConstant(Constant constant) {
		constants.put(constant.getIdentifier(), constant);
	}
	
	public void addConstants(ArrayList<Constant> constantList) {
		for (Constant constant : constantList) {
			constants.put(constant.getIdentifier(), constant);
		}
	}

	public Constant getConstantExpression(String identifier) {
		return constants.get(identifier);
	}
	
	
	//TYPE DECLARATIONS
	public void addTypeDeclaration(TypeDeclaration typeDecl) {
		declaredTypes.put(typeDecl.getTypeName(), typeDecl);
	}
	
	public void addTypeDeclarations(ArrayList<TypeDeclaration> typeDeclarationList) {
		for (TypeDeclaration typeDecl : typeDeclarationList) {
			addTypeDeclaration(typeDecl);
		}
	}
	
	public TypeDeclaration getTypeDeclaration(String identifier) {
		return declaredTypes.get(identifier);
	}
	
	
	//VARIABLES
	public void addVariable(Variable variable) {
		variables.put(variable.getIdentifier(),variable);
	}
	
	public void addVariables(ArrayList<Variable> variableList) {
		for (Variable variable : variableList) {
			variables.put(variable.getIdentifier(), variable);
		}
	}
	
	public Variable getVariable(String identifier) {
		return variables.get(identifier);
	}
	
	
	//PROCEDURES
	public void addProcedure(Procedure procedure) {
		procedures.put(procedure.getIdentifier(),procedure);
		procedure.setHigherModule(this);
	}
	
	public void addProcedures(ArrayList<Procedure> procedureList) {
		for (Procedure procedure : procedureList) {
			procedures.put(procedure.getIdentifier(), procedure);
		}
	}
	
	public Procedure getProcedure(String identifier) {
		Procedure foundProcedure = procedures.get(identifier);
		if (foundProcedure != null) {
			//Make a new procedure of the found one.
			return foundProcedure.getNew();
		}
		else if (higherModule != null) {
			//Look on module higher.
			return higherModule.getProcedure(identifier);
		}
		else {
			//TODO throw procedure not found exception
			return null;
		}
	}
	
	
	//STATEMENTS
	public void addStatement(Statement statement) {
		statements.add(statement);
	}
	
	public void addStatements(ArrayList<Statement> statementList) {
		statements.addAll(statementList);
	}
	
	public void setHigherModule(Module higherModule) {
		this.higherModule = higherModule;
	}
	
	//ASSIGMENT METHODS
	public void assignExpressionToVariable(Identifier identifier, Expression valueEx) {
		Variable var = variables.get(identifier.getIdentifier());
		//Variables should always be there. (Checked by parser).
		
		assert(var != null);
		var.assignExpression(valueEx,identifier.getSelector(), this);
	}
	
	//VALUE GETTER METHODS 
	public Expression getValueForIdentifier(Identifier identifier) {
		
		if (variables.containsKey(identifier.getIdentifier())) {
			Variable var = variables.get(identifier.getIdentifier());
			assert(var != null);
			return var.getExpression(identifier.getSelector(), this).evaluate(this);
		}
		else if (constants.containsKey(identifier.getIdentifier())) {
			//Not in variables check constants.
			Constant con = constants.get(identifier.getIdentifier());
			assert(con != null);
			return con.getExpression().evaluate(this);
		}
		else if (higherModule != null) {
			return higherModule.getValueForIdentifier(identifier);
		}
		else {
			//TODO add Exception!
			return new IntegerExpression(new IntegerType());
		}
	}
	
	//MODULE ACTION
	public void start() throws ExecutionException {
		//Execute all statements
		for (Statement statement:statements) {
			statement.execute(this);
		}
	}

	
	//PROGRAM
	public void setProgram(Program program) {
		this.program = program;
	}

	public Program getProgram() {
		//Do we have a program object?
		if (program != null) {
			return program;
		}
		else {
			//We dont so look one module higher.
			return higherModule.getProgram();
		}
	}

	
	//NEW
	protected ArrayList<Constant> getNewConstants() {
		//Add constants (no need to make new; contains no type).
		return new ArrayList<Constant>(constants.values());
	}
	
	protected ArrayList<TypeDeclaration> getNewTypeDeclarations() {
		//Add type declarations(no need to make new; contains no type).
		return new ArrayList<TypeDeclaration>(declaredTypes.values());
	}
	
	
	protected ArrayList<Variable> getNewVariables() {
		ArrayList<Variable> newVariables = new ArrayList<Variable>();
		//Add new variables (make new; contains a type).
		for (Variable variable : variables.values()) {
			newVariables.add(variable.getNew());
		}
		return newVariables;
	}
	
	protected ArrayList<Procedure> getNewProcedures() {
		
		ArrayList<Procedure> newProcedures = new ArrayList<Procedure>();
		//Add new procedures(make new; contains a type).
		for (Procedure procedure : procedures.values()) {
			newProcedures.add(procedure.getNew());
		}
		return newProcedures;
	}

	protected ArrayList<Statement> getNewStatements() {
		//Add staments(no need to make new; contains no type).
		return new ArrayList<Statement>(statements);
	}
	
}
