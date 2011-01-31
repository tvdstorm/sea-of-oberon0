package com.kootsjur.oberon;

public class BracketSelector extends Selector
{
   private Expression expression;

   public void setExpression(Expression expression)
   {
      this.expression = expression;
   }

   public Expression getExpression()
   {
      return expression;
   }

}
