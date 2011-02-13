package com.kootsjur.oberon.parser;

public class SimpleExpression
{
   private Term leftTerm;
   private BinaryOperator leftSimpleExpressionType;
   private Term rightTerm;
   private BinaryOperator rightSimpleExpressionType;
   
   
   public void setLeftTerm(Term leftTerm)
   {
      this.leftTerm = leftTerm;
   }
   public Term getLeftTerm()
   {
      return leftTerm;
   }
   public void setRightTerm(Term rightTerm)
   {
      this.rightTerm = rightTerm;
   }
   public Term getRightTerm()
   {
      return rightTerm;
   }
   
   public void setRightSimpleExpressionType(BinaryOperator rightSimpleExpressionType)
   {
      this.rightSimpleExpressionType = rightSimpleExpressionType;
   }
   public BinaryOperator getRightSimpleExpressionType()
   {
      return rightSimpleExpressionType;
   }
   public void setLeftSimpleExpressionType(BinaryOperator leftSimpleExpressionType)
   {
      this.leftSimpleExpressionType = leftSimpleExpressionType;
   }
   public BinaryOperator getLeftSimpleExpressionType()
   {
      return leftSimpleExpressionType;
   }

}
