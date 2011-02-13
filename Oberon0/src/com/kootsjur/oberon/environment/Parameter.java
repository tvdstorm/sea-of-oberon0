package com.kootsjur.oberon.environment;

import com.kootsjur.oberon.declaration.formalparameter.ParameterDirection;
import com.kootsjur.oberon.type.TypeDefinition;
import com.kootsjur.oberon.value.Value;

public class Parameter
{
   private Value value;
   private TypeDefinition type;
   private ParameterDirection direction;
   
   public Parameter()
   {
      this(null);
   }
   
   public Parameter(TypeDefinition type)
   {
      this(type,null,null);
   }
   
   public Parameter(TypeDefinition type, ParameterDirection direction)
   {
      this(type,direction,null);
   }
   
   public Parameter(TypeDefinition type, ParameterDirection direction, Value value)
   {
      this.setType(type);
      this.setDirection(direction);
      this.value = value;
   }

   public void setValue(Value value){this.value = value;}
   public Value getValue(){return value;}

   public void setType(TypeDefinition type){this.type = type;}
   public TypeDefinition getType(){return type;}

   public void setDirection(ParameterDirection direction){this.direction = direction;}
   public ParameterDirection getDirection(){return direction;}
}
