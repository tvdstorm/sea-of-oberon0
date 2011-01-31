package com.kootsjur.oberon;

public class Declaration
{
   private DeclarationType declarationType;

   public Declaration(DeclarationType declarationType)
   {
      this.declarationType = declarationType;
   }
   
   public void setDeclarationType(DeclarationType declarationType)
   {
      this.declarationType = declarationType;
   }

   public DeclarationType getDeclarationType()
   {
      return declarationType;
   }

}
