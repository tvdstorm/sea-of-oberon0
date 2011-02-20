package com.kootsjur.oberon.declaration.procedure;

import java.util.ArrayList;
import java.util.List;

import com.kootsjur.oberon.declaration.Declaration;
import com.kootsjur.oberon.statement.StatementSequence;


public class ProcedureBody
{
   private List<Declaration> declarations;
   private List<ProcedureDeclaration> procedureDeclarations;
   private StatementSequence statementSequence;
   
   public ProcedureBody()
   {
      declarations = new ArrayList<Declaration>();
      procedureDeclarations = new ArrayList<ProcedureDeclaration>();
      statementSequence = new StatementSequence();
      
      //post-condition
      assert(procedureDeclarations != null):"Error in Constructor ProcedureBody! procedureDeclarations is not initialized!";
      assert(declarations != null):"Error in Constructor ProcedureBody! declarations is not initialized!";
      assert(statementSequence != null):"Error in Constructor ProcedureBody! procedureDeclarations is not initialized!";
   }
   
   public void addProcedure(ProcedureDeclaration procedureDeclaration)
   {
      //pre-condition
      assert(procedureDeclaration != null):"Error in ProcedureBody method addProcedure. Parameter procedureDeclaration is null";
      
      procedureDeclarations.add(procedureDeclaration);
      
      //post-condition
      assert(procedureDeclarations.contains(procedureDeclaration)): "Error in ProcedureBody method addProcedure.procedureDeclaration not added";
   }
   
   public void setDeclarations(List<Declaration> declarations){this.declarations = declarations;}
   public List<Declaration> getDeclarations(){return declarations;}
   
   public void setStatementSequence(StatementSequence statementSequence){this.statementSequence = statementSequence;}
   public StatementSequence getStatementSequence(){return statementSequence;}
   
   public void setProcedures(List<ProcedureDeclaration> procedureDeclarations){this.procedureDeclarations = procedureDeclarations;}
   public List<ProcedureDeclaration> getProcedures(){return procedureDeclarations;}
}
