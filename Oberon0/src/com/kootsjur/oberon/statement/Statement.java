package com.kootsjur.oberon.statement;

public class Statement
{
   public enum StatementType { PROCEDURECALL, ASSIGNMENT, IFSTATEMENT, WHILESTATEMENT}
   
   private StatementType statementType;

   public Statement(StatementType statementType)
   {
      this.statementType = statementType;
   }
   
   public void setStatementType(StatementType statementType)
   {
      this.statementType = statementType;
   }

   public StatementType getStatementType()
   {
      return statementType;
   }
}
