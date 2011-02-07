package com.kootsjur.oberon.environment;

import java.util.List;

import com.kootsjur.oberon.type.TypeDeclaration;

public class Environment
{
   private Environment parent;
  // private Map<String,Constant> declaredConstants;
   
   public void setParent(Environment parent){this.parent = parent;}
   public Environment getParent(){return parent;}
   
}
