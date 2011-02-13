package com.kootsjur.oberon.parser;

public class ArrayType extends TypeDefinition
{
   private Expression expression;
   private TypeDefinition typeDefinition;
   
   public void setExpression(Expression expression)
   {
      this.expression = expression;
   }
   public Expression getExpression()
   {
      return expression;
   }
   
   public void setTypeDefinition(TypeDefinition typeDefinition)
   {
      this.typeDefinition = typeDefinition;
   }
   public TypeDefinition getTypeDefinition()
   {
      return typeDefinition;
   }
}
