package com.kootsjur.oberon.evaluator;

import com.kootsjur.oberon.environment.Environment;

public interface SelectorEvaluator extends Evaluator
{
   public void assignValue(String name, Evaluator expressionValueToAssign, Environment environment);
}
