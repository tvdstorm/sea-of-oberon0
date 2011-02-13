package com.kootsjur.oberon.parser;

public class Expression
{
   private SimpleExpression leftSimpleExpression;
   private SimpleExpression rightSimpleExpression;
   private RelationalOperator relationalOperator;
  
   public void setLeftSimpleExpression(SimpleExpression leftSimpleExpression)
   {
      this.leftSimpleExpression = leftSimpleExpression;
   }
   public SimpleExpression getLeftSimpleExpression()
   {
      return leftSimpleExpression;
   }
   
   public void setRightSimpleExpression(SimpleExpression rightSimpleExpression)
   {
      this.rightSimpleExpression = rightSimpleExpression;
   }
   public SimpleExpression getRightSimpleExpression()
   {
      return rightSimpleExpression;
   }
   
   public void setExpressionType(RelationalOperator relationalOperator)
   {
      this.relationalOperator = relationalOperator;
   }
   public RelationalOperator getExpressionType()
   {
      return relationalOperator;
   }

   
}
