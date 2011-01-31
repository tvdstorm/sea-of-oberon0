package com.kootsjur.oberon;

import java.util.List;

public class StatementSequence
{
   private List<Statement> statements;

   public void setStatements(List<Statement> statements)
   {
      this.statements = statements;
   }

   public List<Statement> getStatements()
   {
      return statements;
   }
}
