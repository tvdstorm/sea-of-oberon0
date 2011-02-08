package com.kootsjur.oberon.declaration.constant;

import com.kootsjur.oberon.declaration.Declaration;
import com.kootsjur.oberon.environment.Environment;
import com.kootsjur.oberon.evaluator.ExpressionEvaluator;

public class ConstantDeclaration implements Declaration
{
   private String name;
   private ExpressionEvaluator expression;

   public ConstantDeclaration(String name, ExpressionEvaluator expression)
   {
      this.name = name;
      this.expression = expression;
   }
   
   public void setName(String name){this.name = name;}
   public String getName(){return name;}

   public void setExpression(ExpressionEvaluator expression){this.expression = expression;}
   public ExpressionEvaluator getExpression(){return expression;}

   @Override
   public void declare(Environment environment)
   {
      environment.declareConstant(this);      
   }

}
