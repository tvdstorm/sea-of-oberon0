package com.kootsjur.oberon.value;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.kootsjur.oberon.Field;
import com.kootsjur.oberon.FieldList;
import com.kootsjur.oberon.environment.Reference;

public class Record extends Value
{
   @SuppressWarnings("rawtypes")
   private Map<Field, Reference> fields;
   
   @SuppressWarnings("rawtypes")
   public Record(List<FieldList> fieldList)
   {
      fields = new HashMap<Field, Reference>();
      for(FieldList field : fieldList)
      {
         for(String fieldName : field.getNames())
         {
            fields.put(new Field(fieldName),null);
         }
      }
   }
   
   @SuppressWarnings("unchecked")
   public void set(String name, Value value) 
   {
      Field field = new Field(name);
      if(fields.containsKey(field))
      {
         fields.get(field).setValue(value);
      }
   }
   
   @SuppressWarnings("rawtypes")
   public Reference get(String name) 
   {
      return fields.get(name);
   }
   
   
}
