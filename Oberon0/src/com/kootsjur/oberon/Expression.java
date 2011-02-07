package com.kootsjur.oberon;

import com.kootsjur.oberon.evaluator.ConditionalEvaluator;
import com.kootsjur.oberon.evaluator.SimpleExpressionEvaluator;

public class Expression
{
   private SimpleExpressionEvaluator leftSimpleExpression;
   private SimpleExpressionEvaluator rightSimpleExpression;
   private ConditionalEvaluator conditionalEvaluator;
  
   public Expression(SimpleExpressionEvaluator leftSimpleExpression)
   {
      this.leftSimpleExpression = leftSimpleExpression;
   }
   
   public void setLeftSimpleExpression(SimpleExpressionEvaluator leftSimpleExpression){this.leftSimpleExpression = leftSimpleExpression;}
   public SimpleExpressionEvaluator getLeftSimpleExpression(){return leftSimpleExpression;}
   
   public void setRightSimpleExpression(SimpleExpressionEvaluator rightSimpleExpression){this.rightSimpleExpression = rightSimpleExpression;}
   public SimpleExpressionEvaluator getRightSimpleExpression(){return rightSimpleExpression;}
   
   public void setConditionalEvaluator(ConditionalEvaluator conditionalEvaluator){this.conditionalEvaluator = conditionalEvaluator;}
   public ConditionalEvaluator getConditionalEvaluatore(){return conditionalEvaluator;}

   
}
