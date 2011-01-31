package com.kootsjur.oberon;

import java.util.ArrayList;
import java.util.List;

public class ProcedureBody
{
   private List<Declaration> declarations;
   private List<Procedure> procedures;
   private StatementSequence statementSequence;
   
   public ProcedureBody()
   {
      declarations = new ArrayList<Declaration>();
      procedures = new ArrayList<Procedure>();
      statementSequence = new StatementSequence();
   }
   
   public boolean addProcedure(Procedure procedure)
   {
      assert(procedures != null):"Erros procedures is not initialized!";
      return procedures.add(procedure);
         
   }
   
   public void setDeclarations(List<Declaration> declarations)
   {
      this.declarations = declarations;
   }
   public List<Declaration> getDeclarations()
   {
      return declarations;
   }
   
   public void setStatementSequence(StatementSequence statementSequence)
   {
      this.statementSequence = statementSequence;
   }
   public StatementSequence getStatementSequence()
   {
      return statementSequence;
   }
   
   public void setProcedures(List<Procedure> procedures)
   {
      this.procedures = procedures;
   }
   public List<Procedure> getProcedures()
   {
      return procedures;
   }

}
