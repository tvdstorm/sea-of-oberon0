package com.kootsjur.oberon;

public class Statement
{
   public enum StatementType { PROCEDURECALL, ASSIGNMENT, IFSTATEMENT, WHILESTATEMENT}
   
   private StatementType statementType;

   public void setStatementType(StatementType statementType)
   {
      this.statementType = statementType;
   }

   public StatementType getStatementType()
   {
      return statementType;
   }
}
