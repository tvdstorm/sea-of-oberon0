package com.kootsjur.oberon.statement;

import com.kootsjur.oberon.evaluator.ExpressionEvaluator;

public class ActualParameter
{
   private ExpressionEvaluator expression;
   
   public ActualParameter(ExpressionEvaluator expression)
   {
      
      this.expression = expression;
   }
   
   public void setExpression(ExpressionEvaluator expression)
   {
      this.expression = expression;
   }

   public ExpressionEvaluator getExpression()
   {
      return expression;
   }
}
