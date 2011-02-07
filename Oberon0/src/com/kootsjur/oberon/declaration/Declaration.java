package com.kootsjur.oberon.declaration;

import com.kootsjur.oberon.ast.Node;

public class Declaration extends Node
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
