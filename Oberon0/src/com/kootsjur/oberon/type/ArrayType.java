package com.kootsjur.oberon.type;

import com.kootsjur.oberon.environment.Environment;
import com.kootsjur.oberon.evaluator.Evaluator;
import com.kootsjur.oberon.evaluator.ExpressionEvaluator;
import com.kootsjur.oberon.value.Array;
import com.kootsjur.oberon.value.Bool;
import com.kootsjur.oberon.value.Int;
import com.kootsjur.oberon.value.Record;
import com.kootsjur.oberon.value.Value;

public class ArrayType extends TypeDefinition
{
   private Evaluator expression;
   private TypeDefinition typeDefinition;
   
   public ArrayType(Evaluator expression, TypeDefinition typeDefinition)
   {
      super(DataType.ARRAY);
      this.expression =  expression;
      this.typeDefinition = typeDefinition;
   }
   
   public void setExpression(ExpressionEvaluator expression){this.expression = expression;}
   public Evaluator getExpression(){return expression;}
   
   public void setTypeDefinition(TypeDefinition typeDefinition){this.typeDefinition = typeDefinition;}
   public TypeDefinition getTypeDefinition(){return typeDefinition;}

   @SuppressWarnings("rawtypes")
   @Override
   public Value initValue(Environment environment)
   {
      assert(environment != null):"Error in ArrayType method initValue. Parameter environment is null!";
      
      Int size = (Int) expression.evaluate(environment);
      int intsize = size.getValue();
      
      switch(typeDefinition.getDataType())
      { 
         case ARRAY:
            Array<Array> arrayOfArrays = new Array<Array>(intsize);
            return arrayOfArrays;
         case BOOL:
            Array<Bool> arrayOfBools = new Array<Bool>(intsize);
            return arrayOfBools;
         case RECORD:
            Array<Record> arrayOfRecords = new Array<Record>(intsize);
            return arrayOfRecords;
         case INTEGER:
            Array<Int> arrayOfInts = new Array<Int>(intsize);
            return arrayOfInts;
         default:
            Array array = new Array(intsize);
            return array;
      }
   }
}
