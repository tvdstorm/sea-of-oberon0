package com.kootsjur.oberon.type;

import java.util.List;

import com.kootsjur.oberon.FieldList;
import com.kootsjur.oberon.environment.Environment;
import com.kootsjur.oberon.value.Value;

public class RecordType extends TypeDefinition
{
   private List<FieldList> fields;

   public RecordType(List<FieldList> fields)
   {
      super(DataType.RECORD);
      this.fields = fields;
   }
   
   /**
    * Set the fields to the specified value.
    *
    * @param fields The fields to set.
    */
   public void setFields(List<FieldList> fields)
   {
      this.fields = fields;
   }

   /**
    * Get the fields.
    *
    * @return Returns the fields as a List<FieldList>.
    */
   public List<FieldList> getFields()
   {
      return fields;
   }

   @Override
   public Value initValue(Environment environment)
   {
      // TODO Auto-generated method stub
      return null;
   }

}
