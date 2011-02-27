package com.kootsjur.oberon.value;

public class Field extends Value
{
   private String name;
   
   public Field(String name){
      this.name = name;
   }
   public void setName(String name){this.name = name;}
   public String getName(){return name;}
   
   @Override
   public boolean equals(Object obj) {
      if (!(obj instanceof Field)) {
         return false;
      }
      return name.equals(((Field)obj).name);
   }
}
