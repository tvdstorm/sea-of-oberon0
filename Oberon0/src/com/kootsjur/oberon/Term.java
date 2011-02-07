package com.kootsjur.oberon;

public class Term
{
   private Factor leftFactor;
   private Factor factor;
   private TermEvaluator termEvaluator;
   
   public Term(Factor leftFactor)
   {
      this.leftFactor = leftFactor;
   }
   
   public void setLeftFactor(Factor leftFactor)
   {
      this.leftFactor = leftFactor;
   }
   public Factor getLeftFactor()
   {
      return leftFactor;
   }
   
   public void setFactor(Factor factor)
   {
      this.factor = factor;
   }
   public Factor getFactor()
   {
      return factor;
   }
   
   public void setTermType(TermEvaluator termEvaluator)
   {
      this.termEvaluator = termEvaluator;
   }
   public TermEvaluator getTermType()
   {
      return termEvaluator;
   }
}
