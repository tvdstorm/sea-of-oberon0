package com.kootsjur.oberon.statement;

import com.kootsjur.oberon.environment.Environment;
import com.kootsjur.oberon.evaluator.Evaluator;
import com.kootsjur.oberon.evaluator.ExpressionEvaluator;
import com.kootsjur.oberon.evaluator.SelectorEvaluator;
import com.kootsjur.oberon.value.Value;

public class Assignment extends Statement
{
   private String name;
   private SelectorEvaluator selector;
   private Evaluator expression;
   
   public Assignment(String name, Evaluator expression)
   {
      super(StatementType.ASSIGNMENT);
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
   
   public void setSelector(Evaluator selector)
   {
      this.selector = (SelectorEvaluator) selector;
   }
   public SelectorEvaluator getSelector()
   {
      return selector;
   }
   
   public void setExpression(ExpressionEvaluator expression)
   {
      this.expression = expression;
   }
   public Evaluator getExpression()
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
         evaluateNameSelector(environment);
      }
   }

   private void evaluateNameSelector(Environment environment)
   {
      selector.assignValue(name, expression, environment);
   }

   private void evaluateName(Environment environment)
   {
      Value value = expression.evaluate(environment);
      environment.assignValue(name, value); 
   }
   

}
