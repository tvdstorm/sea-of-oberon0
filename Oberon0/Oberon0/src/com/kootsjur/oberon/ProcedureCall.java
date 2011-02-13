package com.kootsjur.oberon.parser;

import java.util.ArrayList;
import java.util.List;

public class ProcedureCall extends Statement
{
   private String callTo;
   private DotSelector dotSelector;
   private List<ActualParameter> actualParameters;
   

   public ProcedureCall(String callTo)
   {
      this.callTo = callTo;
      this.dotSelector = new DotSelector();
      actualParameters = new ArrayList<ActualParameter>();
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
   
   public void setDotSelector(DotSelector dotSelector)
   {
      this.dotSelector = dotSelector;
   }
   public DotSelector getDotSelector()
   {
      return dotSelector;
   }

}
