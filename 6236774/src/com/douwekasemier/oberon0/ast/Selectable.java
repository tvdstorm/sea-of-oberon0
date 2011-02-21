package com.douwekasemier.oberon0.ast;

import com.douwekasemier.oberon0.interpreter.environment.Environment;
import com.douwekasemier.oberon0.interpreter.environment.Reference;
import com.douwekasemier.oberon0.interpreter.environment.Value;

public interface Selectable {

    Reference select(Environment environment, Value from);

}
