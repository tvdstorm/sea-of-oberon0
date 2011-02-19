package com.kootsjur.oberon.declaration.var;

import java.util.List;

import com.kootsjur.oberon.declaration.Declaration;
import com.kootsjur.oberon.environment.Environment;
import com.kootsjur.oberon.environment.Var;
import com.kootsjur.oberon.type.ArrayType;
import com.kootsjur.oberon.type.BoolType;
import com.kootsjur.oberon.type.IntegerType;
import com.kootsjur.oberon.type.RecordType;
import com.kootsjur.oberon.type.TypeDefinition;
import com.kootsjur.oberon.type.UserType;
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
      this.names = names;
      this.typeDefinition = typeDefinition;
   }
   public void setNames(List<String> names){this.names = names;}
   public List<String> getNames(){return names;}
   
   public void setType(TypeDefinition typeDefinition){this.typeDefinition = typeDefinition;}
   public TypeDefinition getType(){return typeDefinition;}
   
   @SuppressWarnings({ "rawtypes" })
   @Override
   public void declare(Environment environment)
   {
      Value value = typeDefinition.initValue(environment);
      switch(typeDefinition.getDataType())
      {
         case BOOL:     
            environment.declareBoolVars(names, (Bool)value);
            return;
         case INTEGER:
            environment.declareIntVars(names,(Int) value);
            return;
         case ARRAY:
            ArrayType arrayType = (ArrayType)typeDefinition;
            declareArrayVar(environment, arrayType);
            return;
         case RECORD:
            environment.declareRecordVars(names, (Record)value);
            return;
            default:
               environment.declareVar(names, value);
      }
   }
   
   @SuppressWarnings("unchecked")
   private void declareArrayVar(Environment environment, ArrayType arrayType)
   {
      
      switch(arrayType.getDataType())
      {
         
         case BOOL:
            Array<Bool> boolArray = (Array<Bool>) typeDefinition.initValue(environment);
            environment.declareBoolArrayVars(names, boolArray);
            return;
         case INTEGER:
            Array<Int> intArray = (Array<Int>) typeDefinition.initValue(environment);
            environment.declareIntegerArrayVars(names, intArray);
            return;
         case ARRAY:
            Array<Array> arrayArray = (Array<Array>) typeDefinition.initValue(environment);
            environment.declareArrayArrayVars(names, arrayArray);
            return;
         case RECORD:
            Array<Record> recordArray = (Array<Record>) typeDefinition.initValue(environment);
            environment.declareRecordArrayVars(names, recordArray);
            return;
            default:
               Array array = (Array) typeDefinition.initValue(environment);
               environment.declareVar(names, array);

      }   
   }
   
}
