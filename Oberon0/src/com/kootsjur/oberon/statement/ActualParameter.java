package com.kootsjur.oberon.statement;

import com.kootsjur.oberon.evaluator.Evaluator;
import com.kootsjur.oberon.evaluator.ExpressionEvaluator;

public class ActualParameter
{
   private Evaluator expression;
   
   public ActualParameter(Evaluator expression)
   {
      
      this.expression =  expression;
   }
   
   public void setExpression(ExpressionEvaluator expression)
   {
      this.expression = expression;
   }

   public Evaluator getExpression()
   {
      return expression;
   }
}
