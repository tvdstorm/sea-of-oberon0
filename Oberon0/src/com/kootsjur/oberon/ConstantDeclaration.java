package com.kootsjur.oberon;

public class ConstantDeclaration extends Declaration
{
   private String name;
   private Expression expression;

   public ConstantDeclaration(String name, Expression expression)
   {
      super(DeclarationType.CONSTANT);
      this.name = name;
      this.expression = expression;
   }
   public void setName(String name)
   {
      this.name = name;
   }

   public String getName()
   {
      return name;
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
