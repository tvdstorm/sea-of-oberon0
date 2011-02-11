package com.kootsjur.oberon.statement;

import java.util.List;

import com.kootsjur.oberon.DotSelector;
import com.kootsjur.oberon.Selector;
import com.kootsjur.oberon.environment.Environment;

public class ProcedureCall extends Statement
{
   private String callTo;

   private List<ActualParameter> actualParameters;
   

   public ProcedureCall(String callTo, List<ActualParameter> actualParameters)
   {
      super(StatementType.PROCEDURECALL);
      this.callTo = callTo;
      this.actualParameters = actualParameters;      
   }
   
   public boolean addActualParameter(ActualParameter parameter)
   {
      return this.actualParameters.add(parameter);
   }
   
   public void setCallTo(String callTo)
   {
      this.callTo = callTo;
   }
   
   public String getCallTo()
   {
      return callTo;
   }
   
   public void setActualParameters(List<ActualParameter> actualParameters)
   {
      this.actualParameters = actualParameters;
   }
   public List<ActualParameter> getActualParameters()
   {
      return actualParameters;
   }

   @Override
   public void evaluate(Environment environment)
   {
      // TODO Auto-generated method stub
      
   }
   
}
