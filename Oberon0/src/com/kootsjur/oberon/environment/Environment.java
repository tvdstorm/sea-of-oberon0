package com.kootsjur.oberon.environment;

import com.kootsjur.oberon.declaration.DeclaredConstants;
import com.kootsjur.oberon.declaration.DeclaredTypes;
import com.kootsjur.oberon.declaration.DeclaredVars;

public class Environment
{
   private Environment parent;
   private DeclaredConstants declaredConstants;
   private DeclaredVars declaredVars;
   private DeclaredTypes declaredTypes;
   
   public void setParent(Environment parent){this.parent = parent;}
   public Environment getParent(){return parent;}
   
   public void setDeclaredConstants(DeclaredConstants declaredConstants){this.declaredConstants = declaredConstants;}
   public DeclaredConstants getDeclaredConstants(){return declaredConstants;}
   
   public void setDeclaredVars(DeclaredVars declaredVars){this.declaredVars = declaredVars;}
   public DeclaredVars getDeclaredVars(){return declaredVars;}
   
   public void setDeclaredTypes(DeclaredTypes declaredTypes){this.declaredTypes = declaredTypes;}
   public DeclaredTypes getDeclaredTypes(){return declaredTypes;}
}
