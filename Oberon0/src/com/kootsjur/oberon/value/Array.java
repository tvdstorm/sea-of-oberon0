package com.kootsjur.oberon.value;

import java.util.ArrayList;
import java.util.List;

import com.kootsjur.oberon.environment.Reference;


public class Array<T extends Value> extends Value
{
   private final List<Reference<T>> values;
   
   public Array(int size) {
      values = new ArrayList<Reference<T>>(size);
      for (int i = 0; i < size; i++) {
         values.add(i, new Reference<T>(null));
      }
   }
   
   public void set(int i, T value) {
      values.get(i).setValue(value);
   }
   
   public Reference<T> get(int i) {
      return values.get(i);
   }
   
}
