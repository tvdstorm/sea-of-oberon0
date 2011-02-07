package com.kootsjur.oberon;

import com.kootsjur.oberon.evaluator.SimpleExpressionEvaluator;

public class SimpleExpression
{
   private Term leftTerm;
   private SimpleExpressionEvaluator leftSimpleExpressionEvaluatore;
   private Term rightTerm;
   private SimpleExpressionEvaluator SimpleExpressionEvaluator;
   
   public SimpleExpression(Term leftTerm)
   {
      this.leftTerm = leftTerm;
   }
   
   public SimpleExpression(Term leftTerm, boolean Negative)
   {
      this.leftTerm = leftTerm;
   }
   
   public void setLeftTerm(Term leftTerm){this.leftTerm = leftTerm;}
   public Term getLeftTerm(){return leftTerm;}
   
   public void setRightTerm(Term rightTerm){this.rightTerm = rightTerm;}
   public Term getRightTerm(){return rightTerm;}
   
   public void setLeftSimpleExpressionEvaluatore(SimpleExpressionEvaluator leftSimpleExpressionEvaluatore)
   {
      this.leftSimpleExpressionEvaluatore = leftSimpleExpressionEvaluatore;
   }
   public SimpleExpressionEvaluator getLeftSimpleExpressionEvaluatore()
   {
      return leftSimpleExpressionEvaluatore;
   }
   
   public void setSimpleExpressionEvaluator(SimpleExpressionEvaluator simpleExpressionEvaluator)
   {
      SimpleExpressionEvaluator = simpleExpressionEvaluator;
   }
   public SimpleExpressionEvaluator getSimpleExpressionEvaluator()
   {
      return SimpleExpressionEvaluator;
   }
}
