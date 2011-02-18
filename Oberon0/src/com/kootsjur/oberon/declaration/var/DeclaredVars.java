package com.kootsjur.oberon.declaration.var;

import java.util.HashMap;

import com.kootsjur.oberon.environment.Var;
import com.kootsjur.oberon.type.TypeDefinition;
import com.kootsjur.oberon.value.Value;

@SuppressWarnings("serial")
public class DeclaredVars<T extends TypeDefinition, V extends Value> extends HashMap<String, Var<T,V>>
{

}
