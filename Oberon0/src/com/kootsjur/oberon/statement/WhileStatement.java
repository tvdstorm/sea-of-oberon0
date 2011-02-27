package com.kootsjur.oberon.statement;

import com.kootsjur.oberon.environment.Environment;
import com.kootsjur.oberon.evaluator.Evaluator;
import com.kootsjur.oberon.value.Bool;

public class WhileStatement extends Statement
{
   private Evaluator whileCondition;
   private StatementSequence statementSequence;

   public WhileStatement(Evaluator whileCondition, StatementSequence statementSequence)
   {
	   super();
	   this.whileCondition = whileCondition;
	   this.statementSequence = statementSequence;
   }

   public void setWhileCondition(Evaluator whileCondition){this.whileCondition = whileCondition;}
   public Evaluator getWhileCondition(){return whileCondition;}

   public void setStatementSequence(StatementSequence statementSequence){this.statementSequence = statementSequence;}
   public StatementSequence getStatementSequence(){return statementSequence;}
   
   @Override
   public void evaluate(Environment environment)
   {
      assert(environment != null):"Error in WhileStatement method environment. Parameter environment is null";
      
      Bool condition = (Bool) whileCondition.evaluate(environment);
      while(condition.getValue())
      {
         for(Statement statement : statementSequence)
         {
            statement.evaluate(environment);
         }
         condition = (Bool) whileCondition.evaluate(environment);
      }      
   }
}
