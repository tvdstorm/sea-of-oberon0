package com.kootsjur.oberon.value;

import java.util.ArrayList;
import java.util.List;


public class Array<T extends Value> extends Value
{
   private final List<T> values;
   
   public Array(int size) {
      values = new ArrayList<T>(size);
      for (int i = 0; i < size; i++) {
         values.add(i, null);
      }
   }
   
   public void set(int i, T value) {
      values.set(i, value);
   }
   
   public T get(int i) {
      return values.get(i);
   }
   
}
