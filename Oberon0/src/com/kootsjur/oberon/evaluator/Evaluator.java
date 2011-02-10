package com.kootsjur.oberon.evaluator;

import com.kootsjur.oberon.environment.Environment;
import com.kootsjur.oberon.value.Value;

public interface Evaluator {
   
   Value evaluate(Environment environment);
}
