package com.kootsjur.oberon;

import java.util.ArrayList;
import java.util.List;


public class Module
{
   private String name;
   private List<Declaration> declarations;
   private List<Procedure> procedures;
   private StatementSequence statementSequence;
   
   /**
    * 
    * Constructor: create a new Module.
    * @param name
    */
   public Module(String name)
   {
      this.name = name;
      declarations = new ArrayList<Declaration>();
      procedures = new ArrayList<Procedure>();
   }
   
   /**
    * 
    * TODO
    * @param declarationName
    * @param declaration
    */
   public boolean addDeclaration(Declaration declaration)
   {
      assert(declarations != null):"Error declarations is not initialised";
      return declarations.add(declaration);
   }
   
   /**
    * 
    * TODO
    * @param declarationName
    * @return
    */
   public Declaration retrieveDeclaration(String declarationName)
   {
      if(declarations == null) 
      {
         return null;
      }
      //TODO
      return null;
   }
   
   /**
    * 
    * TODO
    * @param procedureName
    * @param procedure
    */
   public boolean addProcedure(Procedure procedure)
   {
      assert(procedures != null):"Error procedures is not initialised";
      
      return procedures.add(procedure);
      //TODO
   }
   
   /**
    * 
    * TODO
    * @param procedureName
    * @return
    */
   public Procedure getProcedure(String procedureName)
   {
      if(procedures == null)
      {
         return null;
      }
      //TODO
      return null;
   }
   
   public void setName(String name)
   {
      this.name = name;
   }
   public String getName()
   {
      return name;
   }
   

   public void setStatementSequence(StatementSequence statementSequence)
   {
      this.statementSequence = statementSequence;
   }
   public StatementSequence getStatementSequence()
   {
      return statementSequence;
   }
   
   public void setDeclarations(List<Declaration> declarations)
   {
      this.declarations = declarations;
   }
   
   
}
