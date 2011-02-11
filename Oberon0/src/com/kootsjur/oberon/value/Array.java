package com.kootsjur.oberon.value;

import java.util.ArrayList;
import java.util.List;

import com.kootsjur.oberon.type.TypeDefinition;


public class Array<T extends Value> extends Value
{
   private final List<T> values;
   
   public Array(int size, TypeDefinition init) {
      values = new ArrayList<T>(size);
      for (int i = 0; i < size; i++) {
         T initValue = getInitValue(init);
         values.set(i, initValue);
      }
   }

   @SuppressWarnings("unchecked")
   private T getInitValue(TypeDefinition init)
   {
      return (T) init.initValue();
   }
   
   public void set(int i, T value) {
      values.set(i, value);
   }
   
   public T get(int i) {
      return values.get(i);
   }
   
}
