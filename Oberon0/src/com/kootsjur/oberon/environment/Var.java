package com.kootsjur.oberon.environment;

import com.kootsjur.oberon.type.TypeDefinition;
import com.kootsjur.oberon.value.Value;

public class Var<T extends TypeDefinition,V extends Value>
{
   private Reference<V> reference;
   private T type; 
   
   public Var() 
   {
      this(null);
   }
      
   public Var(T type)
   {
      this.type = type;
   }
   
   public void initVar(Environment environment)
   {
      V value = initValueOfReference(environment);
      reference = new Reference<V>(value);
   }

   @SuppressWarnings("unchecked")
   private V initValueOfReference(Environment environment)
   {
      return (V) type.initValue(environment);
   }


   public void setReferenceValue(V value){this.reference.setValue(value);}
   public void setReference(Reference<V> reference){this.reference = reference;}
   public Reference<V> getReference(){return reference;}
   public void setType(T type){this.type = type;}
   public T getType(){return type;}

}
