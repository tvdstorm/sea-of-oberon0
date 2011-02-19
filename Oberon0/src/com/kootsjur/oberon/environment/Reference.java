package com.kootsjur.oberon.environment;

import com.kootsjur.oberon.value.Value;

public class Reference<T extends Value>
{
   private T value;

   public Reference(T value)
   {
      this.value = value;
   }
   
   public Reference()
   {
      this(null);
   }

   public void setValue(T value2){this.value = value2;}
   public T getValue(){return value;}
   
}
