package com.kootsjur.oberon.declaration.var;

import java.util.List;

import com.kootsjur.oberon.declaration.Declaration;
import com.kootsjur.oberon.environment.Environment;
import com.kootsjur.oberon.type.ArrayType;
import com.kootsjur.oberon.type.TypeDefinition;
import com.kootsjur.oberon.value.Array;
import com.kootsjur.oberon.value.Bool;
import com.kootsjur.oberon.value.Int;
import com.kootsjur.oberon.value.Record;
import com.kootsjur.oberon.value.Value;

public class VarDeclaration implements Declaration
{
   private List<String> names;
   private TypeDefinition typeDefinition;
   
   public VarDeclaration(List<String> names, TypeDefinition typeDefinition)
   {
      //pre-condition
      assert(names != null):"Error in Constructor VarDeclaration!  parameter names is null!";
      assert(typeDefinition != null):"Error in Constructor VarDeclaration!  parameter typeDefinition is null!";
      assert(names.size() > 0):"Error in Constructor VarDeclaration!  parameter names does not contain any names!";
      
      this.names = names;
      this.typeDefinition = typeDefinition;
   }
   public void setNames(List<String> names){this.names = names;}
   public List<String> getNames(){return names;}
   
   public void setType(TypeDefinition typeDefinition){this.typeDefinition = typeDefinition;}
   public TypeDefinition getType(){return typeDefinition;}
   
   @Override
   public void declare(Environment environment)
   {
      //pre-Condition
      assert(environment != null):"Error in VarDeclaration method declare! Environment is null!";
      
      Value value = typeDefinition.initValue(environment);
      switch(typeDefinition.getDataType())
      {
         case BOOL:     
            environment.declareBoolVars(names, (Bool)value);
            checkPostCondition(names,value);
            return;
         case INTEGER:
            environment.declareIntVars(names,(Int) value);
            checkPostCondition(names,value);
            return;
         case ARRAY:
            ArrayType arrayType = (ArrayType)typeDefinition;
            declareArrayVar(environment, arrayType);
            return;
         case RECORD:
            environment.declareRecordVars(names, (Record)value);
            checkPostCondition(names,value);
            return;
            default:
               environment.declareVar(names, value);
               checkPostCondition(names,value);
      }
   }

   @SuppressWarnings({ "unchecked", "rawtypes" })
   private void declareArrayVar(Environment environment, ArrayType arrayType)
   {
      
      switch(arrayType.getDataType())
      {
         
         case BOOL:
            Array<Bool> boolArray = (Array<Bool>) typeDefinition.initValue(environment);
            environment.declareBoolArrayVars(names, boolArray);
            checkPostCondition(names,boolArray);
            return;
         case INTEGER:
            Array<Int> intArray = (Array<Int>) typeDefinition.initValue(environment);
            environment.declareIntegerArrayVars(names, intArray);
            checkPostCondition(names,intArray);
            return;
         case ARRAY:
            Array<Array> arrayArray = (Array<Array>) typeDefinition.initValue(environment);
            environment.declareArrayArrayVars(names, arrayArray);
            checkPostCondition(names,arrayArray);
            return;
         case RECORD:
            Array<Record> recordArray = (Array<Record>) typeDefinition.initValue(environment);
            environment.declareRecordArrayVars(names, recordArray);
            checkPostCondition(names,recordArray);
            return;
            default:
               Array array = (Array) typeDefinition.initValue(environment);
               environment.declareVar(names, array);
               checkPostCondition(names,array);

      }   
   }
   
   
   private void checkPostCondition(List<String> names, Value value)
   {
      // TODO Auto-generated method stub
      
   }
}
