package com.kootsjur.oberon.statement;

import java.util.ArrayList;

import com.kootsjur.oberon.environment.Environment;


@SuppressWarnings("serial")
public class StatementSequence extends ArrayList<Statement>
{

   public void evaluate(Environment environment)
   {
      if(!isEmpty())
      {
         for(Statement statement : this)
         {
            statement.evaluate(environment);
         }
      }
   }

}
