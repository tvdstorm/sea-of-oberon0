package com.kootsjur.oberon.statement;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import com.kootsjur.oberon.declaration.formalparameter.FPSection;
import com.kootsjur.oberon.declaration.formalparameter.FormalParameters;
import com.kootsjur.oberon.environment.Environment;
import com.kootsjur.oberon.environment.Procedure;
import com.kootsjur.oberon.environment.Reference;
import com.kootsjur.oberon.evaluator.Evaluator;
import com.kootsjur.oberon.evaluator.LookUpEvaluator;
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
      
      assert(actualParameters != null):"ActualParameters is null";
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
      ListIterator<ActualParameter> actuals = actualParameters.listIterator();     
      FormalParameters formals = procedure.getFormalParameters(); 
      
      for(FPSection fPSection : formals)
      {
         for(String parameterName : fPSection.getNames())
         {
            if(!actuals.hasNext())
            {
               throw new RuntimeException();
            }
            ActualParameter actual = actuals.next();
            switch(fPSection.getParameterDirection())
            {
               case IN:
                  declareValue(procedure,environment,actual,parameterName);
                  break;
               case INOUT:
                  declareByRef(procedure,environment,actual, parameterName);
                  default:
            }
         }
      }
    }

   @SuppressWarnings("rawtypes")
   private void declareByRef(Procedure procedure, Environment environment, ActualParameter actual, String parameterName)
   {
      LookUpEvaluator expression = (LookUpEvaluator) actual.getExpression();
      Reference reference = expression.lvalueOf(environment);
      procedure.assignActualParameterReference(parameterName, reference);;
      
   }

   private void declareValue(Procedure procedure, Environment environment, ActualParameter actual, String parameterName)
   {
      Evaluator expression = actual.getExpression();
      Value value = expression.evaluate(environment);
      procedure.assignValueToParameter(parameterName, value);
      
   }
   
}
