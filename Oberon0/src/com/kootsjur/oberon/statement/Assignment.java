package com.kootsjur.oberon.statement;

import com.kootsjur.oberon.environment.Environment;
import com.kootsjur.oberon.evaluator.Evaluator;
import com.kootsjur.oberon.evaluator.ExpressionEvaluator;
import com.kootsjur.oberon.value.Value;

public class Assignment extends Statement
{
   private String name;
   private Evaluator selector;
   private ExpressionEvaluator expression;
   
   public Assignment(String name, Evaluator selector, ExpressionEvaluator expression)
   {
      super(StatementType.ASSIGNMENT);
      this.name = name;
      this.selector = selector;
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
   
   public void setSelector(Evaluator selector)
   {
      this.selector = selector;
   }
   public Evaluator getSelector()
   {
      return selector;
   }
   
   public void setExpression(ExpressionEvaluator expression)
   {
      this.expression = expression;
   }
   public ExpressionEvaluator getExpression()
   {
      return expression;
   }

   @Override
   public void evaluate(Environment environment)
   {
      if(selector == null)
      {
         evaluateName(environment);
      }
      else
      {
         //evaluateNameSelector(environment);
      }
   }

   private void evaluateName(Environment environment)
   {
      Value value = expression.evaluate();
      environment.assignValue(name, value); 
   }
   

}
