package com.douwekasemier.oberon0.ast;

import com.douwekasemier.oberon0.exceptions.Oberon0Exception;
import com.douwekasemier.oberon0.interpreter.environment.Environment;
import com.douwekasemier.oberon0.interpreter.environment.Reference;
import com.douwekasemier.oberon0.interpreter.environment.Value;

public interface Selectable {

    Reference select(Environment environment, Value from) throws Oberon0Exception;

}
