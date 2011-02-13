package com.kootsjur.oberon.parser;

public class TypeDefinition
{
   public enum DataType{ NORMAL, ARRAY, RECORD;}
   
   private DataType dataType;
   private String name;
   
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
   
}
