package com.kootsjur.oberon;

public class Term
{
   private Factor leftFactor;
   private Factor rightFactor;
   private MultiplyingOperator multiplyingOperator;
   
   public void setLeftFactor(Factor leftFactor)
   {
      this.leftFactor = leftFactor;
   }
   public Factor getLeftFactor()
   {
      return leftFactor;
   }
   
   public void setRightFactor(Factor rightFactor)
   {
      this.rightFactor = rightFactor;
   }
   public Factor getRightFactor()
   {
      return rightFactor;
   }
   
   public void setTermType(MultiplyingOperator multiplyingOperator)
   {
      this.multiplyingOperator = multiplyingOperator;
   }
   public MultiplyingOperator getTermType()
   {
      return multiplyingOperator;
   }
}
