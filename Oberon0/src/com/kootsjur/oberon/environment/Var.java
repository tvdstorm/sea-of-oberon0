package com.kootsjur.oberon.environment;

import com.kootsjur.oberon.type.TypeDefinition;
import com.kootsjur.oberon.value.Value;

public class Var
{
   private Value value;
   private TypeDefinition type;
   
   public Var() 
   {
      this(null);
   }
   
   
   public Var(TypeDefinition type)
   {
      this.setType(type);
   }
   
   public void initVar(Environment environment)
   {
      value = type.initValue(environment);
   }

   public void setValue(Value value){this.value = value;}
   public Value getValue(){return value;}

   public void setType(TypeDefinition type){this.type = type;}
   public TypeDefinition getType(){return type;}

}
