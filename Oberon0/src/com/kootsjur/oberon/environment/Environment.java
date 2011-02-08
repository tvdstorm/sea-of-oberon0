package com.kootsjur.oberon.environment;

import com.kootsjur.oberon.declaration.constant.ConstantDeclaration;
import com.kootsjur.oberon.declaration.constant.DeclaredConstants;
import com.kootsjur.oberon.declaration.formalparameter.DeclaredParameters;
import com.kootsjur.oberon.declaration.procedure.DeclaredProcedures;
import com.kootsjur.oberon.declaration.type.DeclaredTypes;
import com.kootsjur.oberon.declaration.type.TypeDeclaration;
import com.kootsjur.oberon.declaration.var.DeclaredVars;
import com.kootsjur.oberon.declaration.var.VarDeclaration;
import com.kootsjur.oberon.evaluator.ExpressionEvaluator;
import com.kootsjur.oberon.type.TypeDefinition;
import com.kootsjur.oberon.value.Value;

public class Environment
{
   private Environment parentEnvironment;
   private DeclaredConstants declaredConstants;
   private DeclaredVars declaredVars;
   private DeclaredTypes declaredTypes;
   private DeclaredProcedures procedures;
   private DeclaredParameters parameters;
   
   public Environment()
   {
      this(null);
   }
   
   public Environment(Environment parentEnvironment)
   {
      this.parentEnvironment = parentEnvironment;
   }
   
   public void setParent(Environment parent){this.parentEnvironment = parent;}
   public Environment getParent(){return parentEnvironment;}
   
   public void setDeclaredConstants(DeclaredConstants declaredConstants){this.declaredConstants = declaredConstants;}
   public DeclaredConstants getDeclaredConstants(){return declaredConstants;}
   
   public void setDeclaredVars(DeclaredVars declaredVars){this.declaredVars = declaredVars;}
   public DeclaredVars getDeclaredVars(){return declaredVars;}
   
   public void setDeclaredTypes(DeclaredTypes declaredTypes){this.declaredTypes = declaredTypes;}
   public DeclaredTypes getDeclaredTypes(){return declaredTypes;}
   
   public void setProcedures(DeclaredProcedures procedures){this.procedures = procedures;}
   public DeclaredProcedures getProcedures(){return procedures;}
   
   public void declareConstant(String constantName, Constant constant)
   {
      declaredConstants.put(constantName, constant);
   }
   
   public void declareConstant(String constantName, Value constantValue)
   {
      Constant constant = new Constant(constantValue);
      declareConstant(constantName, constant);
   }
   
   public void declareConstant(ConstantDeclaration constantDeclaration)
   {
      String constantName = constantDeclaration.getName();
      ExpressionEvaluator constantValueEvaluator = constantDeclaration.getExpression();
      Value constantValue = constantValueEvaluator.evaluate();
      declareConstant(constantName, constantValue);
   }
   
   public void declareVar(String varName, Var var)
   {
      declaredVars.put(varName, var);
   }
   
   public void declareVar(VarDeclaration varDeclaration)
   {
     // Var var = new Var(varDeclaration.getType().init)
      for(String varName : varDeclaration.getNames())
      {
         TypeDefinition varType = varDeclaration.getType();
         Var var = new Var(varType);
         declareVar(varName, var);
      }
   }
   
   public void declareType(String typeName, Type type)
   {
      declaredTypes.put(typeName, type);
   }
   
   public void declareType(TypeDeclaration typeDeclaration)
   {
      String typeName = typeDeclaration.getName();
      TypeDefinition typeDefinition = typeDeclaration.getTypeDefinition();
      Type type = new Type(typeDefinition);
      declareType(typeName,type);
   }
   
   public void declareProcedure(String procedureName, Procedure procedure)
   {
      procedures.put(procedureName, procedure);
   }

   public void declareParameter(String parameterName, Parameter parameter)
   {
      parameters.put(parameterName, parameter);
      
   }
   

   
}
