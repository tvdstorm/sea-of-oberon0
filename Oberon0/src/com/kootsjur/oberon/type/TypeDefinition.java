package com.kootsjur.oberon.type;

public class TypeDefinition
{
   public enum DataType{ NORMAL, ARRAY, RECORD, INTEGER, BOOL;}
   
   private DataType dataType;
   private String name;
   
   public TypeDefinition (String name)
   {
      this.name = name;
      this.dataType = DataType.NORMAL;
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
   
}