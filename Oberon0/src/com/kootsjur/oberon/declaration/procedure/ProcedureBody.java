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
   }
   
   public boolean addProcedure(ProcedureDeclaration procedureDeclaration)
   {
      assert(procedureDeclarations != null):"Erros procedureDeclarations is not initialized!";
      return procedureDeclarations.add(procedureDeclaration);
         
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
   
   public void setProcedures(List<ProcedureDeclaration> procedureDeclarations)
   {
      this.procedureDeclarations = procedureDeclarations;
   }
   public List<ProcedureDeclaration> getProcedures()
   {
      return procedureDeclarations;
   }

}
