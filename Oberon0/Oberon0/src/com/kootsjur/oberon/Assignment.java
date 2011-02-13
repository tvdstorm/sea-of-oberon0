package com.kootsjur.oberon.parser;

public class Assignment extends Statement
{
   private String name;
   private Selector selector;
   private Expression expression;
   
   public void setName(String name)
   {
      this.name = name;
   }
   public String getName()
   {
      return name;
   }
   
   public void setSelector(Selector selector)
   {
      this.selector = selector;
   }
   public Selector getSelector()
   {
      return selector;
   }
   public void setExpression(Expression expression)
   {
      this.expression = expression;
   }
   public Expression getExpression()
   {
      return expression;
   }
   

}
