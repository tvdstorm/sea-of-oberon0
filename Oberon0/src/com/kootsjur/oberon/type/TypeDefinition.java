package com.kootsjur.oberon.type;

import com.kootsjur.oberon.environment.Environment;
import com.kootsjur.oberon.value.Value;

public abstract class TypeDefinition
{
   public enum DataType{ USER, ARRAY, RECORD, INTEGER, BOOL;}
   
   private DataType dataType;
   private String name;
   
   public TypeDefinition (String name)
   {
      this.name = name;
      this.dataType = DataType.USER;
   }
   
   public TypeDefinition(DataType dataType)
   {
      this.dataType = dataType;
      this.name = "";
   }
   
   public TypeDefinition(String name, DataType dataType)
   {
      this.name = name;
      this.dataType = dataType;
   }
   
   /**
    * Set the dataType to the specified value.
    *
    * @param dataType The dataType to set.
    */
   public void setDataType(DataType dataType)
   {
      this.dataType = dataType;
   }
   /**
    * Get the dataType.
    *
    * @return Returns the dataType as a DataType.
    */
   public DataType getDataType()
   {
      return dataType;
   }
   
   /**
    * Set the name to the specified value.
    *
    * @param name The name to set.
    */
   public void setName(String name)
   {
      this.name = name;
   }
   /**
    * Get the name.
    *
    * @return Returns the name as a String.
    */
   public String getName()
   {
      return name;
   }

   public abstract  Value initValue(Environment environment);
}
