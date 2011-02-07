package com.kootsjur.oberon.declaration;

import com.kootsjur.oberon.value.Value;

public class Var
{
   private Value value;

   public Var() 
   {
      this(null);
   }
   
   public Var(Value value) 
   {
      this.value = value;
   }

   public void setValue(Value value){this.value = value;}
   public Value getValue(){return value;}

}
