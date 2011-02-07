package com.kootsjur.oberon.statement;

import java.util.ArrayList;
import java.util.List;

import com.kootsjur.oberon.declaration.StatementSequence;
import com.kootsjur.oberon.evaluator.ExpressionEvaluator;

public class IfStatement extends Statement
{
   private ExpressionEvaluator ifCondition;
   private StatementSequence thenStatementSequence;
   private List<IfStatement> elseIfStatements;
   private StatementSequence elseStatementSequence;
   
   public IfStatement(ExpressionEvaluator ifCondition, StatementSequence thenStatementSequence)
   {
      super(StatementType.IFSTATEMENT);
      this.ifCondition = ifCondition;
      this.thenStatementSequence = thenStatementSequence;
      this.elseIfStatements = new ArrayList<IfStatement>();
   }
   
   public IfStatement(ExpressionEvaluator ifCondition, StatementSequence thenStatementSequence, StatementSequence elseStatementSequence)
   {
      super(StatementType.IFSTATEMENT);
      this.ifCondition = ifCondition;
      this.thenStatementSequence = thenStatementSequence;
      this.elseStatementSequence = elseStatementSequence;
      this.elseIfStatements = new ArrayList<IfStatement>();
   }
   
   public IfStatement(ExpressionEvaluator ifCondition, StatementSequence thenStatementSequence, List<IfStatement> elseIfStatements)
   {
      super(StatementType.IFSTATEMENT);
      this.ifCondition = ifCondition;
      this.thenStatementSequence = thenStatementSequence;
      this.elseIfStatements = elseIfStatements;
   }
   
   public IfStatement(ExpressionEvaluator ifCondition, StatementSequence thenStatementSequence, StatementSequence elseStatementSequence, List<IfStatement> elseIfStatements)
   {
      super(StatementType.IFSTATEMENT);
      this.ifCondition = ifCondition;
      this.thenStatementSequence = thenStatementSequence;
      this.elseStatementSequence = elseStatementSequence;
      this.elseIfStatements = elseIfStatements;
   }
   
   public boolean addElseIfStatement(IfStatement elseIfStatement)
   {
      assert(this.elseIfStatements != null):"Error elseIfStatement not initialized";
      return this.elseIfStatements.add(elseIfStatement);
   }

   public void setIfCondition(ExpressionEvaluator ifCondition){this.ifCondition = ifCondition;}
   public ExpressionEvaluator getIfCondition(){return ifCondition;}

   public void setThenStatementSequence(StatementSequence thenStatementSequence){this.thenStatementSequence = thenStatementSequence;}
   public StatementSequence getThenStatementSequence(){return thenStatementSequence;}

   public void setElseIfStatement(List<IfStatement> elseIfStatements){this.elseIfStatements = elseIfStatements;}
   public List<IfStatement> getElseIfStatement(){return elseIfStatements;}

   public void setElseStatementSequence(StatementSequence elseStatementSequence){this.elseStatementSequence = elseStatementSequence;}
   public StatementSequence getElseStatementSequence(){return elseStatementSequence;}



}
