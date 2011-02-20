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
      //pre-Condition
      assert(name != null):"Error in Constructor ConstantDeclaration! name is null!";
      assert(expression != null):"Error in Constructor ConstantDeclaration! expression is null!";
      
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
      //pre-Condition
      assert(environment != null):"Error in ConstantDeclaration method declare! Environment is null!";
      
      Value value = expression.evaluate(environment);
      Constant constant = new Constant(value);
      environment.declareConstant(name,constant);
      
      //post-condition
      assert(environment.getDeclaredConstants().containsKey(name)):"Error in ConstantDeclaration method declare! Constant is not declared!";
      assert(environment.getDeclaredConstants().get(name).equals(constant)):"Error in ConstantDeclaration method declare! constant is not equal!";
   }

}
