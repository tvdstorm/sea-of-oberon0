package com.kootsjur.oberon.declaration.constant;

import com.kootsjur.oberon.declaration.Declaration;
import com.kootsjur.oberon.environment.Constant;
import com.kootsjur.oberon.environment.Environment;
import com.kootsjur.oberon.evaluator.Evaluator;
import com.kootsjur.oberon.value.Value;

public class ConstantDeclaration implements Declaration
{
   private String name;
   private Evaluator expression;

   public ConstantDeclaration(String name, Evaluator expression)
   {
      this.name = name;
      this.expression = expression;
   }
   
   public void setName(String name){this.name = name;}
   public String getName(){return name;}

   public void setExpression(Evaluator expression){this.expression = expression;}
   public Evaluator getExpression(){return expression;}

   @Override
   public void declare(Environment environment)
   {
      
      Value value = expression.evaluate(environment);
      Constant constant = new Constant(value);
      environment.declareConstant(name,constant);      
   }

}
