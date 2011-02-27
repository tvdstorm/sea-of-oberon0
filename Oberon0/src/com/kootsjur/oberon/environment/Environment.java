package com.kootsjur.oberon.environment;

import java.util.List;

import com.kootsjur.oberon.declaration.Declaration;
import com.kootsjur.oberon.declaration.constant.ConstantDeclaration;
import com.kootsjur.oberon.declaration.constant.DeclaredConstants;
import com.kootsjur.oberon.declaration.formalparameter.DeclaredParameters;
import com.kootsjur.oberon.declaration.formalparameter.FPSection;
import com.kootsjur.oberon.declaration.formalparameter.FormalParameters;
import com.kootsjur.oberon.declaration.procedure.DeclaredProcedures;
import com.kootsjur.oberon.declaration.procedure.ProcedureDeclaration;
import com.kootsjur.oberon.declaration.type.DeclaredTypes;
import com.kootsjur.oberon.declaration.type.TypeDeclaration;
import com.kootsjur.oberon.declaration.var.DeclaredVars;
import com.kootsjur.oberon.evaluator.Evaluator;
import com.kootsjur.oberon.type.TypeDefinition;
import com.kootsjur.oberon.value.Array;
import com.kootsjur.oberon.value.Field;
import com.kootsjur.oberon.value.Int;
import com.kootsjur.oberon.value.Record;
import com.kootsjur.oberon.value.Value;

public class Environment {
	private Environment parentEnvironment;
	private DeclaredConstants declaredConstants;

	@SuppressWarnings("rawtypes")
	private DeclaredVars declaredVars;
	private DeclaredTypes declaredTypes;
	private DeclaredProcedures procedures;
	private DeclaredParameters parameters;

	public Environment() {
		this(null);
	}

	@SuppressWarnings("rawtypes")
	public Environment(Environment parentEnvironment) {
		declaredConstants = new DeclaredConstants();
		declaredVars = new DeclaredVars();
		declaredTypes = new DeclaredTypes();
		procedures = new DeclaredProcedures();
		parameters = new DeclaredParameters();
		this.parentEnvironment = parentEnvironment;
	}

	public void setParent(Environment parent) {
		this.parentEnvironment = parent;
	}

	public Environment getParent() {
		return parentEnvironment;
	}

	public void setDeclaredConstants(DeclaredConstants declaredConstants) {
		this.declaredConstants = declaredConstants;
	}

	public DeclaredConstants getDeclaredConstants() {
		return declaredConstants;
	}

	@SuppressWarnings("rawtypes")
	public void setDeclaredVars(DeclaredVars declaredVars) {
		this.declaredVars = declaredVars;
	}

	@SuppressWarnings("rawtypes")
	public DeclaredVars getDeclaredVars() {
		return declaredVars;
	}

	public void setDeclaredTypes(DeclaredTypes declaredTypes) {
		this.declaredTypes = declaredTypes;
	}

	public DeclaredTypes getDeclaredTypes() {
		return declaredTypes;
	}

	public void setProcedures(DeclaredProcedures procedures) {
		this.procedures = procedures;
	}

	public DeclaredProcedures getProcedures() {
		return procedures;
	}

	public void setDeclaredParameters(DeclaredParameters parameters) {
		this.parameters = parameters;
	}

	public DeclaredParameters getDeclaredParameters() {
		return parameters;
	}

	public void declareConstant(String constantName, Constant constant) {
		// pre-condition
		assert (constantName != null) : "Error in Environment declareConstant. parameter constantName is null";
		assert (constant != null) : "Error in Environment declareConstant. parameter constant is null";

		declaredConstants.put(constantName, constant);
	}

	public void declareConstant(String constantName, Value constantValue) {
		// pre-condition
		assert (constantName != null) : "Error in Environment declareConstant. parameter constantName is null";
		assert (constantValue != null) : "Error in Environment declareConstant. parameter constantValue is null";

		Constant constant = new Constant(constantValue);
		declareConstant(constantName, constant);
	}

	public void declareParameters(FormalParameters formalParameters) {
		for (FPSection formalParameter : formalParameters) {
			formalParameter.declare(this);
		}

	}

	public void declareConstant(ConstantDeclaration constantDeclaration) {
		String constantName = constantDeclaration.getName();
		Evaluator constantValueEvaluator = constantDeclaration.getExpression();
		Value constantValue = constantValueEvaluator.evaluate(this);
		declareConstant(constantName, constantValue);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void declareVar(String varName, Var var) {
		declaredVars.put(varName, var);
	}

	public void declareType(String typeName, Type type) {
		declaredTypes.put(typeName, type);
	}

	public void declareType(TypeDeclaration typeDeclaration) {
		// pre-conditions
		assert (typeDeclaration != null) : "Error in Environment method declareType!Parameter typeDeclaration is null!";

		String typeName = typeDeclaration.getName();
		TypeDefinition typeDefinition = typeDeclaration.getTypeDefinition();
		Type type = new Type(typeDefinition);
		declareType(typeName, type);

		// post-condition
		assert (declaredTypes.containsKey(typeName)) : "Error declaringType. declaredTypes does not contain name of typeDeclaration as Key ";
	}

	public void declareProcedure(String procedureName, Procedure procedure) {
		procedures.put(procedureName, procedure);
	}

	@SuppressWarnings("rawtypes")
	public void declareParameter(String parameterName, Parameter parameter) {
		parameters.put(parameterName, parameter);
	}

	public void declareProcedures(
			List<ProcedureDeclaration> procedureDeclarations) {
		for (ProcedureDeclaration procedureDeclaration : procedureDeclarations) {
			procedureDeclaration.declare(this);
		}
	}

	public void declareDeclarations(List<Declaration> declarations) {
		for (Declaration declaration : declarations) {
			declaration.declare(this);
		}
	}

	public Constant lookUpConstant(String constantName) {
		Constant constantToReturn = null;
		if (declaredConstants.containsKey(constantName)) {
			constantToReturn = declaredConstants.get(constantName);

		} else {
			if (parentEnvironment != null) {
				constantToReturn = parentEnvironment
						.lookUpConstant(constantName);
			}
		}
		return constantToReturn;
	}

	@SuppressWarnings("rawtypes")
	public Var lookUpVar(String varName) {
		Var varToReturn = null;
		if (declaredVars.containsKey(varName)) {
			varToReturn = (Var) declaredVars.get(varName);
		} else {
			if (parentEnvironment != null) {
				varToReturn = parentEnvironment.lookUpVar(varName);
			}
		}
		return varToReturn;
	}

	@SuppressWarnings("rawtypes")
	public Parameter lookUpParameter(String parameterName) {
		Parameter parameterToReturn = null;
		if (parameters.containsKey(parameterName)) {
			parameterToReturn = parameters.get(parameterName);
		} else {
			if (parentEnvironment != null) {
				parameterToReturn = parentEnvironment
						.lookUpParameter(parameterName);
			}
		}
		return parameterToReturn;
	}

	public Procedure lookUpProcedure(String procedureName) {
		Procedure procedureToReturn = null;
		if (procedures.containsKey(procedureName)) {
			procedureToReturn = procedures.get(procedureName);
		} else {
			if (parentEnvironment != null) {
				procedureToReturn = parentEnvironment
						.lookUpProcedure(procedureName);
			}
		}
		return procedureToReturn;
	}

	public Type lookUpType(String typeName) {
		Type typeToReturn = null;
		if (declaredTypes.containsKey(typeName)) {
			typeToReturn = declaredTypes.get(typeName);
		} else {
			if (parentEnvironment != null) {
				typeToReturn = parentEnvironment.lookUpType(typeName);
			}
		}
		return typeToReturn;
	}

	public Value lookUpConstantValue(String constantName) {
		Constant constant = lookUpConstant(constantName);
		Value valueToReturn = constant.get();
		return valueToReturn;
	}

	@SuppressWarnings("rawtypes")
	public Value lookUpVarValue(String varName) {
		Reference varReference = lookUpVarReference(varName);
		Value varValue = varReference.getValue();
		return varValue;
	}

	@SuppressWarnings("rawtypes")
	public Value lookUpParameterValue(String parameterName) {
		Reference parameterReference = lookUpParameterReference(parameterName);
		Value parameterValue = parameterReference.getValue();
		return parameterValue;
	}

	public Value lookUpValue(String name) {
		Value valueToReturn = null;
		if (declaredVars.containsKey(name)) {
			valueToReturn = lookUpVarValue(name);
		} else if (declaredConstants.containsKey(name)) {
			valueToReturn = lookUpConstantValue(name);
		} else if (parameters.containsKey(name)) {
			valueToReturn = lookUpParameterValue(name);
		} else {
			if (parentEnvironment != null) {
				valueToReturn = parentEnvironment.lookUpValue(name);
			}
		}
		return valueToReturn;
	}

	@SuppressWarnings("rawtypes")
	public Reference lookUpReference(String name) {
		Reference reference = null;
		if (declaredVars.containsKey(name)) {
			reference = lookUpVarReference(name);
		} else if (parameters.containsKey(name)) {
			reference = lookUpParameterReference(name);
		} else {
			if (parentEnvironment != null) {
				reference = parentEnvironment.lookUpReference(name);
			}
		}
		return reference;
	}

	@SuppressWarnings("rawtypes")
	public Reference lookUpVarReference(String varName)

	{
		Var var = lookUpVar(varName);
		Reference varReference = var.getReference();
		return varReference;
	}

	@SuppressWarnings("rawtypes")
	private Reference lookUpParameterReference(String parameterName) {
		Parameter parameter = lookUpParameter(parameterName);
		Reference parameterReference = parameter.getReference();
		return parameterReference;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void assignValueToVar(String varName, Value value) {
		Var var = lookUpVar(varName);
		var.setReferenceValue(value);

	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void assignActualParameterReference(String parameterName,
			Reference reference) {
		Parameter parameter = lookUpParameter(parameterName);
		parameter.setReference(reference);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void assignValueToParameter(String parameterName, Value value) {
		Parameter parameter = lookUpParameter(parameterName);
		parameter.setReferenceValue(value);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void assignArrayValue(String name, Int selector, Value value) {
		Array array = (Array) this.lookUpValue(name);
		array.set(selector.getValue(), value);
	}

	public void assignRecordFieldValue(String name, Field recordSelector,
			Value value) {
		Record record = (Record) this.lookUpValue(name);
		record.set(recordSelector, value);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void assignArrayValue(String name, Int[] selectors, Value value) {
		Array array = (Array) this.lookUpValue(name);
		int selectorsLength = selectors.length;

		for (int i = 0; i < selectorsLength - 1; i++) {
			int selector = selectors[i].getValue();
			array = (Array) array.get(selector).getValue();
		}

		int lastSelector = selectors[selectorsLength - 1].getValue();
		array.set(lastSelector, value);
	}

	public void assignValue(String name, Value value) {
		if (declaredVars.containsKey(name)) {
			assignValueToVar(name, value);
		} else if (parameters.containsKey(name)) {
			assignValueToParameter(name, value);
		} else {
			if (parentEnvironment != null) {
				parentEnvironment.assignValue(name, value);
			}
		}
	}

	@SuppressWarnings("rawtypes")
	public void declareVar(List<String> names) {
		for (String name : names) {
			Var var = new Var();
			declareVar(name, var);
		}
	}

	public void declareVar(List<String> names, Value value) {
		for (String name : names) {
			declareVar(name, value);
		}

	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void declareVar(String name, Value value) {
		Var var = new Var();
		var.setReferenceValue(value);
		declareVar(name, var);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void declareVarByReference(String name, Reference reference) {
		Var var = new Var();
		var.setReference(reference);
		declareVar(name, var);
	}

}
