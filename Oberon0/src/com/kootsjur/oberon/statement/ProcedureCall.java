package com.kootsjur.oberon.statement;

import java.util.Iterator;
import java.util.List;
import com.kootsjur.oberon.declaration.formalparameter.FPSection;
import com.kootsjur.oberon.declaration.formalparameter.FormalParameters;
import com.kootsjur.oberon.environment.Environment;
import com.kootsjur.oberon.environment.Procedure;
import com.kootsjur.oberon.evaluator.Evaluator;
import com.kootsjur.oberon.value.Value;

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
      Procedure procedure = environment.lookUpProcedure(callTo);
      if(actualParameters != null && actualParameters.size() > 0)
      {
         setParametersValue(procedure,environment);
      }
      procedure.run();      
   }

   private void setParametersValue(Procedure procedure,Environment environment)
   {
      Iterator<ActualParameter> actuals = actualParameters.iterator();
      FormalParameters formals = procedure.getFormalParameters(); 
      for(FPSection fPSection : formals)
      {
         for(String parameterName : fPSection.getNames())
         {
            ActualParameter actual = actuals.next();
            Evaluator expression = actual.getExpression();
            Value value = expression.evaluate(environment);
            procedure.assignValueToParameter(parameterName,value);
         }
      }
    }
   
}
