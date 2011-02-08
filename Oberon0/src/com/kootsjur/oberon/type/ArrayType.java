package com.kootsjur.oberon.type;

import com.kootsjur.oberon.evaluator.ExpressionEvaluator;
import com.kootsjur.oberon.value.Value;

public class ArrayType extends TypeDefinition
{
   private ExpressionEvaluator expression;
   private TypeDefinition typeDefinition;
   
   public ArrayType(ExpressionEvaluator expression, TypeDefinition typeDefinition)
   {
      super(DataType.ARRAY);
      this.expression = expression;
      this.typeDefinition = typeDefinition;
   }
   
   public void setExpression(ExpressionEvaluator expression)
   {
      this.expression = expression;
   }
   public ExpressionEvaluator getExpression()
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

   @Override
   public Value initValue()
   {
      // TODO Auto-generated method stub
      return null;
   }
}
