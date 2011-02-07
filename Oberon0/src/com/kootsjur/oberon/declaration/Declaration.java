package com.kootsjur.oberon.declaration;

import com.kootsjur.oberon.ast.Node;
import com.kootsjur.oberon.environment.Environment;

public abstract class Declaration extends Node
{
   private DeclarationType declarationType;

   public Declaration(DeclarationType declarationType)
   {
      this.declarationType = declarationType;
   }
   
   public void setDeclarationType(DeclarationType declarationType){this.declarationType = declarationType;}
   public DeclarationType getDeclarationType(){return declarationType;}
   
   public abstract void declare(Environment environment);
}
