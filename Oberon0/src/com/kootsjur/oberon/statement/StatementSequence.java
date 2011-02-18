package com.kootsjur.oberon.statement;

import java.util.LinkedList;

import com.kootsjur.oberon.environment.Environment;


@SuppressWarnings("serial")
public class StatementSequence extends LinkedList<Statement>
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
