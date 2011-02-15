package com.kootsjur.oberon.environment;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import com.kootsjur.oberon.declaration.Declaration;
import com.kootsjur.oberon.declaration.procedure.ProcedureDeclaration;
import com.kootsjur.oberon.statement.StatementSequence;



public class Module extends Environment
{
   private String name;
   private List<Declaration> declarations;
   private List<ProcedureDeclaration> procedureDeclarations;
   private StatementSequence statementSequence;
   
   public Module(String name)
   {
      this.name = name;
      declarations = new ArrayList<Declaration>();
      procedureDeclarations = new ArrayList<ProcedureDeclaration>();
   }
   
   public boolean addDeclaration(Declaration declaration)
   {
      assert(declarations != null):"Error declarations is not initialised";
      return declarations.add(declaration);
   }
      
   public boolean addProcedure(ProcedureDeclaration procedureDeclaration)
   {
      assert(procedureDeclarations != null):"Error procedureDeclarations is not initialised";
      
      return procedureDeclarations.add(procedureDeclaration);
   }
      
   
   public void declare(final BufferedReader input, final PrintWriter output)
   {
      GlobalProcedures.initGlobalProcedures(this, input, output);
      declareDeclarations(declarations);
      declareProcedures(procedureDeclarations);
   }
   
   private void evaluate()
   {
      evaluateStatements(statementSequence);
   }

   public void run()
   {
      evaluate();
   }
   
   public void setName(String name){this.name = name;}
   public String getName(){return name;}
   
   public void setStatementSequence(StatementSequence statementSequence){this.statementSequence = statementSequence;}
   public StatementSequence getStatementSequence(){return statementSequence;}
   
   public void setDeclarations(List<Declaration> declarations){this.declarations = declarations;}
}