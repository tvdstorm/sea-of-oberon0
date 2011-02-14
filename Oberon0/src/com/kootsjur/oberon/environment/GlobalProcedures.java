package com.kootsjur.oberon.environment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.List;

import com.kootsjur.oberon.declaration.Declaration;
import com.kootsjur.oberon.declaration.formalparameter.FPSection;
import com.kootsjur.oberon.declaration.formalparameter.FormalParameters;
import com.kootsjur.oberon.declaration.formalparameter.ParameterDirection;
import com.kootsjur.oberon.declaration.procedure.ProcedureDeclaration;
import com.kootsjur.oberon.statement.Statement;
import com.kootsjur.oberon.statement.Statement.StatementType;
import com.kootsjur.oberon.statement.StatementSequence;
import com.kootsjur.oberon.type.IntegerType;
import com.kootsjur.oberon.type.TypeDefinition;

public class GlobalProcedures
{
   public static Procedure read;
   public static Procedure writeLn;
   public static Procedure write;
   
   public static void initGlobalProcedures(Environment environment, final BufferedReader input, final PrintWriter output)
   {
      initWriteLn(environment,output);
      initWrite(environment, output);
      initRead(environment, input);
      
   }

   private static void initRead(Environment environment, final BufferedReader input)
   {
      final String fPName = "x";
      List<String> fPNames = new LinkedList<String>();
      fPNames.add(fPName);
      TypeDefinition typeDefinition = new IntegerType();
      FPSection fPSection = new FPSection(fPNames,typeDefinition,ParameterDirection.IN);
      FormalParameters formalParameters = new FormalParameters();
      formalParameters.add(fPSection);      
      List<Declaration> declarations = new LinkedList<Declaration>();
      List<ProcedureDeclaration> procedures = new LinkedList<ProcedureDeclaration>();
      Statement statement = new Statement(StatementType.PROCEDURECALL)
      {
         @Override
         public void evaluate(Environment environment) 
         {
            String line = null;
             try 
             {
               line = input.readLine();
               System.out.println(line);
               environment.assignValue(fPName, new com.kootsjur.oberon.value.Int(Integer.parseInt(line)));
               
             } 
             catch (IOException e) 
             {
               throw new RuntimeException(e);
             }
         }
      };
         
      
      String procedureName = "Read";
      StatementSequence statementSequence = new StatementSequence();
      statementSequence.add(statement);
      Procedure procedure = new Procedure(formalParameters, declarations, procedures, statementSequence, environment);
      environment.declareProcedure(procedureName, procedure);
      
   }

   private static void initWrite(Environment environment, final PrintWriter output)
   {
      final String fPName = "y";
      List<String> fPNames = new LinkedList<String>();
      fPNames.add(fPName);
      TypeDefinition typeDefinition = new IntegerType();
      FPSection fPSection = new FPSection(fPNames,typeDefinition,ParameterDirection.IN);
      FormalParameters formalParameters = new FormalParameters();
      formalParameters.add(fPSection);      
      List<Declaration> declarations = new LinkedList<Declaration>();
      List<ProcedureDeclaration> procedures = new LinkedList<ProcedureDeclaration>();
      Statement statement = new Statement(StatementType.PROCEDURECALL){
         @Override
         public void evaluate(Environment environment) {
            com.kootsjur.oberon.value.Int y = (com.kootsjur.oberon.value.Int) environment.lookUpValue(fPName);
            output.print(y.getValue());
            output.flush();
         }
      };
      String procedureName = "Write";
      StatementSequence statementSequence = new StatementSequence();
      statementSequence.add(statement);
      Procedure procedure = new Procedure(formalParameters, declarations, procedures, statementSequence, environment);
      environment.declareProcedure(procedureName, procedure);
   }

   private static void initWriteLn(Environment environment, final PrintWriter output)
   {
      FormalParameters formalParameters = new FormalParameters();
      List<Declaration> declarations = new LinkedList<Declaration>();
      List<ProcedureDeclaration> procedures = new LinkedList<ProcedureDeclaration>();
      Statement statement = new Statement(StatementType.PROCEDURECALL){
         @Override
         public void evaluate(Environment environement) {
            output.println();
            output.flush();
         }
      };
      String procedureName = "WriteLn";
      StatementSequence statementSequence = new StatementSequence();
      statementSequence.add(statement);
      Procedure procedure = new Procedure(formalParameters, declarations, procedures, statementSequence, environment);
      environment.declareProcedure(procedureName, procedure);  
   }
   
   
   
}
