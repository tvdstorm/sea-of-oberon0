package com.kootsjur.oberon.environment;

import com.kootsjur.oberon.declaration.constant.Constant;
import com.kootsjur.oberon.declaration.constant.ConstantDeclaration;
import com.kootsjur.oberon.declaration.constant.DeclaredConstants;
import com.kootsjur.oberon.declaration.procedure.DeclaredProcedures;
import com.kootsjur.oberon.declaration.type.DeclaredTypes;
import com.kootsjur.oberon.declaration.var.DeclaredVars;
import com.kootsjur.oberon.declaration.var.Var;
import com.kootsjur.oberon.declaration.var.VarDeclaration;

public class Environment
{
   private Environment parentEnvironment;
   private DeclaredConstants declaredConstants;
   private DeclaredVars declaredVars;
   private DeclaredTypes declaredTypes;
   private DeclaredProcedures procedures;
   
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
   
   public void declareConstant(ConstantDeclaration constantDeclaration)
   {
      String constantName = constantDeclaration.getName();
      Constant constant = new Constant(constantDeclaration.getExpression().evaluate());
      declareConstant(constantName, constant);
   }
   
   public void declareVar(String varName, Var var)
   {
      declaredVars.put(varName, var);
   }
   
   public void declareVar(VarDeclaration varDeclaration)
   {
     // Var var = new Var(varDeclaration.getType().init)
      for(String varNames : varDeclaration.getNames())
      {
         
      }
   }
}
