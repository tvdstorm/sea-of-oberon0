package com.kootsjur.oberon.value;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.kootsjur.oberon.FieldList;
import com.kootsjur.oberon.type.TypeDefinition;

public class Record extends Value
{
   private Map<String, Value> fields;
   
   public Record(List<FieldList> fieldList)
   {
      fields = new HashMap<String, Value>();
      for(FieldList field : fieldList)
      {
         TypeDefinition type = field.getTypeDefinition();
         for(String fieldName : field.getNames())
         {
            fields.put(fieldName, type.initValue());
         }
      }
   }
   
   public void set(String name, Value value) 
   {
      if(fields.containsKey(name))
      {
         fields.put(name, value);
      }
   }
   
   public Value get(String name) 
   {
      return fields.get(name);
   }
   
   
}
