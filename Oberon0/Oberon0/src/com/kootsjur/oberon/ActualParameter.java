package com.kootsjur.oberon;

import java.util.ArrayList;
import java.util.List;

public class ActualParameter
{
   private String name;
   private List<Expression> expressions;
   
   public ActualParameter(String name)
   {
      this.name = name;
      expressions = new ArrayList<Expression>();
   }
   
   public boolean addExpression(Expression p_expression)
   {
      return expressions.add(p_expression);
   }
   
   public void setName(String p_name)
   {
      this.name = p_name;
   }
   public String getName()
   {
      return name;
   }
   
   public void setExpressions(List<Expression> p_expressions)
   {
      this.expressions = p_expressions;
   }
   public List<Expression> getExpressions()
   {
      return expressions;
   }
}
