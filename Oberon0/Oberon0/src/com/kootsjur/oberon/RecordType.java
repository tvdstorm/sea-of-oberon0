package com.kootsjur.oberon;

import java.util.List;

public class RecordType extends TypeDefinition
{
   private List<FieldList> fields;

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

}
