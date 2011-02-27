package com.kootsjur.oberon.value;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.kootsjur.oberon.environment.Reference;

public class Record extends Value
{
   @SuppressWarnings("rawtypes")
   private HashMap<String, Reference> fields;
   
   @SuppressWarnings("rawtypes")
   public Record(List<FieldList> fieldList)
   {
      fields = new HashMap<String, Reference>();
      for(FieldList field : fieldList)
      {
         for(String fieldName : field.getNames())
         {
            fields.put(fieldName,new Reference());
         }
      }
   }
   
   @SuppressWarnings("unchecked")
   public void set(Field field, Value value) 
   {
      if(fields.containsKey(field.getName()))
      {
         fields.get(field.getName()).setValue(value);
      }           
   }
   
   @SuppressWarnings("unchecked")
   public void set(String field, Value value) 
   {
      if(fields.containsKey(field))
      {
         fields.get(field).setValue(value);
      }           
   }
   
   @SuppressWarnings("rawtypes")
   public Reference get(Field field) 
   {
      return fields.get(field);
   }
   
   @SuppressWarnings("rawtypes")
   public Map<String,Reference> getFields()
   {
	   return fields;
   }
   
   
}
