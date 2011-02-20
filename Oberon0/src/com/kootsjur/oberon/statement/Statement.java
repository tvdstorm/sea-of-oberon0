package com.kootsjur.oberon.statement;

import com.kootsjur.oberon.environment.Environment;

public abstract class Statement
{
   public enum StatementType { PROCEDURECALL, ASSIGNMENT, IFSTATEMENT, WHILESTATEMENT}
   
   private StatementType statementType;

   public Statement(StatementType statementType)
   {
      this.statementType = statementType;
   }
   
   public void setStatementType(StatementType statementType){this.statementType = statementType;}
   public StatementType getStatementType(){return statementType;}

   public abstract void evaluate(Environment environment);
}
