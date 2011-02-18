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
   
   @Override
   public void declare(Environment environment)
   {
      switch(typeDefinition.getDataType())
      {
         case BOOL:
            Var<BoolType, Bool> boolVar = new Var<BoolType, Bool>((BoolType)typeDefinition);
            environment.declareVar(names, boolVar);
            return;
         case INTEGER:
            Var<IntegerType, Int> intVar = new Var<IntegerType, Int>((IntegerType)typeDefinition);
            environment.declareVar(names, intVar);
            return;
         case ARRAY:
            ArrayType arrayType = (ArrayType)typeDefinition;
            declareArrayVar(environment, arrayType);
            return;
         case RECORD:
            Var<RecordType,Record> recordVar = new Var<RecordType,Record>((RecordType)typeDefinition);
            environment.declareVar(names, recordVar);
            return;
         case USER:
            Var<UserType,Record> userVar = new Var<UserType,Record>((UserType)typeDefinition);
            environment.declareVar(names, userVar);
            return;
            default:
               Var var = new Var(typeDefinition);
               environment.declareVar(names, var);
      }
   }
   private void declareArrayVar(Environment environment, ArrayType arrayType)
   {
      switch(arrayType.getDataType())
      {
         case BOOL:
            Var<ArrayType, Array<Bool>> boolArrayVar = new Var<ArrayType, Array<Bool>>(arrayType);
            environment.declareVar(names, boolArrayVar);
            return;
         case INTEGER:
            Var<ArrayType, Array<Int>> integerArrayVar = new Var<ArrayType, Array<Int>>(arrayType);
            environment.declareVar(names, integerArrayVar);
            return;
         case ARRAY:
            Var<ArrayType, Array<Array>> arrayArrayVar = new Var<ArrayType, Array<Array>>(arrayType);
            environment.declareVar(names, arrayArrayVar);
            return;
         case RECORD:
            Var<ArrayType, Array<Record>> recordArrayVar = new Var<ArrayType, Array<Record>>(arrayType);
            environment.declareVar(names, recordArrayVar);
            return;
            default:
               Var<ArrayType, Array> userArrayVar = new Var<ArrayType, Array>(arrayType);
               environment.declareVar(names, userArrayVar);

      }   
      
      
   }
}
